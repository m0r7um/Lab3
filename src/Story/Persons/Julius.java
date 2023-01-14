package Story.Persons;

import Exceptions.OverflowSofaException;
import Story.Items.Sofa;

public class Julius extends Story.Persons.Characters{
    final private Sofa usualSittingPlace;
    private Sofa sittingPlace;
    public Julius(Sofa favouriteSofa) {
        super("Julius", "default", Races.HUMAN);
        usualSittingPlace = favouriteSofa;
    }
    public void sitDown(Sofa sofa) {
        try {
            sofa.addSitter(this);
            sittingPlace = sofa;
        } catch (OverflowSofaException e) {
            System.out.println(e.getMessage() + this + "can't take a sit!" );
        }
    }
}
