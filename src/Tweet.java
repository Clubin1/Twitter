import java.util.*;

public class Tweet {
    public String title;
    public String body;
    public String id;
    public User owner;
    public ArrayList<User> liked_by;
    public ArrayList<Reply> replies;
    public Date creation_date;
    public Integer likes;

    public Tweet(String title, String body, User owner) {
        this.title = title;
        this.body = body;
        this.id = String.valueOf(UUID.randomUUID());
        this.owner = owner;
        this.liked_by = new ArrayList<>();
        this.creation_date = new Date();
        this.likes = 0;
        this.replies = new ArrayList<>();
    }

    public void user_like_post(User user) {
        this.liked_by.add(user);
        this.likes += 1;
    }

    public void user_unlike_post(User user) {
        this.liked_by.remove(user);
        this.likes -= 1;
    }

    public void user_reply(Reply reply) {
        this.replies.add(reply);
    }

    public void user_delete_reply(Reply reply) {
        this.replies.remove(reply);
    }

    public String print_liked_users() {
        StringBuilder post_likes = new StringBuilder();
        for(User user : this.liked_by) {
            post_likes.append(user.username);
            post_likes.append(", ");
        }
        return post_likes.toString();
    }

    @Override
    public String toString() {
        return "Post Title: " + this.title + "\n" + "Post Body: " + this.body + "\n" + "Post Date: " +
                this.creation_date + "\n" + "Post ID: " + this.id + "\n" + "Post Owner: " + this.owner.username + "\n" + "Users who Liked: " +
                print_liked_users();
    }
}