package Story.Persons;

import Story.Actions.ActionsWithItems;
import Story.Actions.ActionsWithoutItems;
import Story.Items.Items;
import Story.Objects;

public abstract class Characters extends Objects {
    Races race;
    public Characters(String name, String status, Races race) {
        super(name, status);
        this.race = race;
    }
}
