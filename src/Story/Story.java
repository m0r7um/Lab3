package Story;

import Story.Items.ItemType;
import Story.Items.Items;
import Story.Persons.Carlson;
import Story.Persons.Fille_and_Rulle;
import Story.Persons.Malysh;

public final class Story {
    static public void StoryTeller() {
        Items money = new Items("деньги", "по умлочанию", ItemType.CURRENCY);
        Items apple = new Items("яблоко", "по умлочанию", ItemType.FRUIT);
        Items bubble_gum = new Items("жвачка", "по умлочанию", ItemType.CANDY);

        System.out.println(Carlson.getInstance().getName() + " " + Carlson.getInstance().action(1));
        System.out.println(Malysh.getInstance().getName() + " " + Malysh.getInstance().action(1));
        System.out.println(Carlson.getInstance().getName() + " " + Carlson.getInstance().action(2));
        System.out.println(Carlson.getInstance().getName() + " " + Carlson.getInstance().actionI(1, money));
        //System.out.println(Fille_and_Rulle.getInstance().getName() + " " + Fille_and_Rulle.getInstance().action(1));
        System.out.println(Malysh.getInstance().getName() + " " + Malysh.getInstance().action(2));
        System.out.println(Malysh.getInstance().getName() + " " + Malysh.getInstance().action(3));
        System.out.println(Carlson.getInstance().getName() + " " + Carlson.getInstance().actionI(2, bubble_gum));
    }
}
