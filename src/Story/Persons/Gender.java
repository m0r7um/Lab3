package Story.Persons;

public enum Gender {
    MALE("мужчина", "male"),
    FEMALE("женщина", "female");

    public final String ruName;
    public final String enName;

    Gender(String ruName, String enName) {
        this.ruName = ruName;
        this.enName = enName;
    }
}
