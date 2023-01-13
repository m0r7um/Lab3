package Story.Persons;
import Story.Actions.Worriable;
import Story.Items.Sofa;
import Story.Thoughts;

public final class Malysh extends Characters implements Worriable {
    private static Malysh instance = null;
    private byte lvlOfStress = 0;
    public boolean enoughTimeToThink = true;
    public boolean enshuredNobodyOnSofa;
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
    public void worry() {
        lvlOfStress += 45;
        switch (lvlOfStress) {
            case 45 -> {
                instance.changeStat("встревожился");
            }
            case 90 -> {
                instance.changeStat("разволновался не на шутку");
            }
        }
        System.out.println(getName() + instance.getStatus());
    }
    @Override
    public void calmDown() {
        lvlOfStress -= 45;
    }

    public void thinkWhatIsWorse(Thoughts firstThougt, Thoughts secondThought) {
        if (firstThougt.getBadness() > secondThought.getBadness()) {
            System.out.println("Малыш думает, что " + firstThougt.getContent() + " хуже, чем " + secondThought);
        } else {
            System.out.println("Малыш думает, что " + secondThought.getContent() + " хуже, чем " + firstThougt);
        }
        worry();
    }
    public boolean lookTroughPeephole(Sofa sofa) {
        return enshuredNobodyOnSofa = sofa.getNumberOfSitters() == 0;
        }
    public void finishThinking() {
        enoughTimeToThink = false;
        System.out.println("Малыш закончил размышлять");
    }
//    @Override
//    public Characters getCharacter() {
//        return instance;
//    }
}
