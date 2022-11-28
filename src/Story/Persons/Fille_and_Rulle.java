package Story.Persons;

import Story.Actions.ActionsWithoutItems;
import Story.Items.Items;

public final class Fille_and_Rulle extends Characters implements ActionsWithoutItems {
    private static Fille_and_Rulle instance = null;
    private Fille_and_Rulle() {
        super("Филле и Рулле", "обычный", Races.HUMAN);
    }
    public static Fille_and_Rulle getInstance() {
        if (instance == null) {
            instance = new Fille_and_Rulle();
        }
        return instance;
    }
    @Override
    public String action(int i) {
        switch (i) {
            case 1 -> {
                return "делают";
            }
            case 2 -> {
                return "сложение";
            }
        }
        return null;
    }
}
