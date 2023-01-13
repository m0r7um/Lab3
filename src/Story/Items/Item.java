package Story.Items;

import Story.Objects;

public abstract class Item extends Objects {
    public final ItemType type;
    public Item(String name, String status, ItemType type) {
        super(name, status);
        this.type = type;
    }
}
