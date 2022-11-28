package Story.Persons;

import Story.Action_details;
import Story.Actions.ActionsWithoutItems;
import Story.Items.Items;

public final class Malysh extends Characters implements ActionsWithoutItems {
    private static Malysh instance = null;
    private Malysh() {
        super("Малыш", "обычный", Races.HUMAN);
    }
    public static Malysh getInstance() {
        if (instance == null) {
            instance = new Malysh();
        }
        return instance;
    }
    @Override
    public String action(int i) {
        switch (i) {
            case 1 -> {
                instance.object_status = "нервничает";
                return Action_details.EVEN_MORE + " встревожился";
            }
            case 2 -> {
                instance.object_status = "нервничает еще больше";
                return Action_details.SERIOUSLY + " разволновался";
            }
            case 3 -> {
                instance.object_status = "в растерянности";
                return Action_details.HAD_NO_TIME + " думать " + Action_details.ABOUT_THIS;
            }
        }
        return null;
    }
}
