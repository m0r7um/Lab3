package Story.Persons;
import Story.Objects;

public abstract class Characters extends Objects {
    private final Races race;

    public Characters(String name, String status, Races race) {
        super(name, status);
        this.race = race;
    }
    public Races getRace(){
        return race;
    }

//    public Characters getCharacter() {
//        return this;
//    }
}
