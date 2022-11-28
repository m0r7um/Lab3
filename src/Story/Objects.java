package Story;

public abstract class Objects implements getPar, changeStatus {
    protected final String object_name;
    protected String object_status;

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
}
