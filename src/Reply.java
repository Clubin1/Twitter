import java.util.*;

public class Reply {
    public String body;
    public Date date;
    public String id;
    public User user;
    public Tweet tweet;
    public Integer likes;
    public ArrayList<Reply> replies;

    public Reply(String body, User user, Tweet tweet) {
        this.body = body;
        this.user = user;
        this.tweet = tweet;
        this.date = new Date();
        this.id = String.valueOf(UUID.randomUUID());
        this.likes = 0;
        this.replies = new ArrayList<Reply>();
    }

    public void nest_reply(Reply reply){
        this.replies.add(reply);
    }

    public void like_reply(){
        this.likes += 1;
    }

    public void unlike_reply(){
        this.likes -= 1;
    }
}

