import java.util.*;

public class User {
    public String username;
    public ArrayList<Tweet> tweets;
    public ArrayList<Tweet> liked_tweets;
    public ArrayList<User> followers;
    public ArrayList<User> following;
    public Date creation_date;
    public String password;
    public String email;
    public String id;

    public User(String user, String password, String email) {
        this.username = user;
        this.password = password;
        this.email = email;
        this.creation_date = new Date();
        this.tweets =  new ArrayList<>();
        this.liked_tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.id = String.valueOf(UUID.randomUUID());
    }

    // creating a new post and adding it to user_posts
    public Tweet create_tweet(Tweet tweet) {
        this.tweets.add(tweet);
        return tweet;
    }
    public void delete_tweet(Tweet tweet) {
        this.tweets.remove(tweet);
    }
    // follow a user, return success or no
    public void follow_user(User user) {
        this.following.add(user);
        user.followers.add(this);
    }
    public void unfollow_user(User user) {
        this.following.remove(user);
        user.followers.remove(this);
    }
}
