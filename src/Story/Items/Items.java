package Story.Items;

import Story.Objects;

public final class Items extends Objects {
    public final ItemType type;
    public Items(String name, String status, ItemType type) {
        super(name, status);
        this.type = type;
    }
}
