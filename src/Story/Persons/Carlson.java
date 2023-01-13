package Story.Persons;

import Exceptions.DoorIsAlreadyOpenedException;
import Story.Actions.Flyable;
import Story.Items.Item;
import Story.Items.ItemType;
import Story.Items.Peephole;

import java.util.ArrayList;
import java.util.Objects;

public final class Carlson extends Characters implements Flyable {
    private static Carlson instance = null;
    private ArrayList<Item> inventory = new ArrayList<>(2); // 2 items max because of the two pockets or two hand, IDK
    private Carlson() {
        super("Карлсон", "что-то задумал", Races.HUMAN_HELICOPTER);
    }
    public Carlson(Carlson copy) {
        super(copy.getName(), "default", copy.getRace());
    }

    public static Carlson getInstance() {
        if (instance == null) {
            instance = new Carlson();
        }
        return instance;
    }
        private Carlson dummy;
    public boolean blinks() {
        System.out.println("Карлсон подмигнул");
        return Objects.equals(instance.getStatus(), "что-то задумал");
    }
    public void steal(Item i) {
        i.changeStat("украден");
        System.out.println("Карлсон украл " + i);
    }
    @Override
    public void fly() {
        instance.changeStat("Улетел");
        System.out.println("Карлсон улетел");
    }
    public void pullOutItemFromPeephole(Peephole o, Malysh m) {
        System.out.println("Карлсон достал из " + o + " " + o.getNameOfItemInside());
        inventory.add(o.getNameOfItemInside());
        o.becomeEmpty();
        m.finishThinking();
    }
    public class Cigarette extends Item {
        public Cigarette() {
            super("сигарета", "default", ItemType.TABACCO);
        }
        public void addInInventory(){
            inventory.add(this);
        }
    }
    public void breakIntoRoom() {
        abstract class Room {
            protected boolean doorClosed = true;
            public abstract void openDoor();
        }
        Room room = new Room() {
            @Override
            public void openDoor() {
                try {
                    if (doorClosed) {
                        System.out.println("Карлсон открыл дверь");
                    } else {
                        throw new DoorIsAlreadyOpenedException("Дверь уже открыта");
                    }
                    } catch (DoorIsAlreadyOpenedException e) {
                    System.out.println(e.getMessage());
                    doorClosed = false;
                }
            }
        };
        room.openDoor();
    }
}

