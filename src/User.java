import java.util.PriorityQueue;

public class User {
    public String user_name;
    public PriorityQueue<int[]> user_posts; // TODO CHANGE TO HEAP WITH HEAP KEY AS POST CREATION DATE
    public Post[] liked_posts;
    public User[] user_followers;
    public User[] user_following;
    public String creation_date;
    // TODO MAKE PRIVATE
    public String password;
    public String email;

    void set(String user, String password, String email) {
        this.user_name = user;
        this.password = password;
        this.email = email;
    }

    // creating a new post and adding it to user_posts
    public Post create_post(Post new_post) {
    }
    // follow a user, return success or no
    public Boolean follow_user() {

    }

    public Boolean like_post() {

    }
}
