package Story;

public final class Thoughts {
    int badness;
    String content;
    public Thoughts(String thought, int badness) {
        this.badness = badness;
        this.content = thought;
    }
    public int getBadness() {
        return badness;
    }
    public String getContent() {
        return content;
    }
}
