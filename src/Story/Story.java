package Story;

import Story.Actions.Flyable;
import Story.Items.*;
import Story.Persons.Carlson;
import Story.Persons.Characters;
import Story.Persons.Julius;
import Story.Persons.Malysh;

import java.util.Arrays;

public final class Story {
    static public void storyMaker() {
//        naming
        // redo ThinkWhatIsWorse
        // strong dependency of Carlson on Malysh
        // item from peehole just vanishes
        Money money = new Money("деньги", "по умлочанию");
        BubbleGum bubbleGum = new BubbleGum("жвачка", "по умлочанию");
        Peephole peephole = new Peephole("глазок", "по умолчанию", bubbleGum);
        Thoughts firstThought = new Thoughts("Сложение яблок, то что делают Филле и Рулле", 70);
        Thoughts secondThought = new Thoughts("Карлсон стащил деньги", 67);
        Carlson carlson = Carlson.getInstance();
        Malysh malysh = Malysh.getInstance();
        Sofa sofa1 = new Sofa("маленький диван", "свободен", "комната перед глазком", true);
        Sofa sofa2 = new Sofa("диван у окна", "свободен", "комната не перед глазком", true);
        System.out.println(sofa1.location);
//        actions
        if (carlson.blinks()) {
            malysh.worry();
        }
        carlson.steal(money);
        carlson.fly();
        malysh.thinkWhatIsWorse(firstThought, secondThought);
        carlson.pullOutItemFromPeephole(peephole, malysh);
        Julius julius = new Julius(sofa2);
    }
    static public void makeStoryAboutCarlsonInPast(Carlson c) {
        Carlson carlson = new Carlson(c);
        Carlson.Cigarette cigarette = carlson.new Cigarette();
        cigarette.addInInventory();
        carlson.breakIntoRoom();
    }
}
