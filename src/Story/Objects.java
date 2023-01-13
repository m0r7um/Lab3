package Story;

public abstract class Objects implements getPar, setStatus {
    private final String object_name;
    private String object_status;

    public Objects(String name, String status) {
        this.object_name = name;
        this.object_status = status;
    }
    @Override
    public String getName(){
        return object_name;
    }
    @Override
    public String getStatus(){
        return object_status;
    }
    @Override
    public void changeStat(String newStatus){
        object_status = newStatus;
    }
    @Override
    public String toString(){
        return getName();
    }
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        return java.util.Objects.equals(getName(), ((Objects) obj).getName());
    }
}
