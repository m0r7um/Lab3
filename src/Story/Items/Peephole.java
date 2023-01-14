package Story.Items;

public final class Peephole extends Item {
    private Item itemInside;
    public Peephole(String name, String status, Item itemInside) {
        super(name, status, ItemType.DOOR_DETAIL);
        this.itemInside = itemInside;
    }
    public void becomeEmpty() {
        itemInside = null;
    }
    public Item getNameOfItemInside() {
        return itemInside;
    }
}
