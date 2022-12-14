
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvote;

    public Cats(@JsonProperty("id") String id, @JsonProperty("text") String text, @JsonProperty("type") String type,
                @JsonProperty("user") String user, @JsonProperty("upvotes") Integer upvote) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvote = upvote;
    }

    public Integer getUpvote() {
        return upvote;
    }
    @Override
    public String toString() {
        return "\n id " + id +
                "\n text " + text +
                "\n type " + type +
                "\n user " + user +
                "\n upvote " + upvote;
    }
}