package Story.Persons;


import Story.Action_details;
import Story.Actions.ActionsWithItems;
import Story.Actions.ActionsWithoutItems;
import Story.Items.Items;

public final class Carlson extends Characters implements ActionsWithoutItems, ActionsWithItems {
    private static Carlson instance = null;
    private Carlson() {
        super("Карлсон", "обычный", Races.HUMAN_HELICOPTER);
    }
    public static Carlson getInstance() {
        if (instance == null) {
            instance = new Carlson();
        }
        return instance;
    }
    @Override
    public String actionI(int i, Items item) {
        switch (i) {
            case 1 -> {
                item.changeStat("пропали");
                return Action_details.MAYBE + " стащил " + item.getName();
            }
            case 2 -> {
                item.changeStat("очищен");
                return "вынул " + item.getName() + Action_details.FROM_GLAZOK;
            }
        }
        return null;
    }

    @Override
    public String action(int i) {
        switch (i) {
            case 1 -> {
                instance.object_status = "что-то задумал";
                return Action_details.MYSTERIOUSLY + " подмигнул";
            }
            case 2 -> {
                instance.object_status = "исчез";
                return Action_details.SOMEWHERE + " улетал";
            }
        }
        return null;
    }
}

