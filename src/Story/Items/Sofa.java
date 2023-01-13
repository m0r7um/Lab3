package Story.Items;

import Exceptions.OverflowSofaException;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class Sofa extends Item {
    public Location location;
    private final ArrayList<Story.Persons.Characters> sittingCharacters = new ArrayList<Story.Persons.Characters>(4);
    static class Location{
        private final String name;
        private boolean noticeableTroughPeephole;
        public Location(String name, boolean noticeable) {
            this.name = name;
            noticeableTroughPeephole = noticeable;
        }
    }
    public Sofa(String name, String status, String locationName, boolean noticable) {
        super(name, status, ItemType.FURNITURE);
        this.location = new Location(locationName, noticable);
    }
    public void addSitter(Story.Persons.Characters c) throws OverflowSofaException {
        if (sittingCharacters.size() < 4) {
            sittingCharacters.add(c);
        } else {
            throw new OverflowSofaException("Sofa is full");
        }
    }
    public int getNumberOfSitters() {
        return sittingCharacters.size();
    }
}
