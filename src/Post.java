public class Post {
    public String post_title;
    public String post_body;
    public String post_date;
    public String post_id;
    public User post_owner;
    public User[] post_liked_users;
    public String post_creation_date;

    void set(String title, String body, String date, String id, User owner, User[] users) {
        this.post_title = title;
        this.post_body = body;
        this.post_date = date;
        this.post_id = id;
        this.post_owner = owner;
        this.post_liked_users = users;
        this.post_creation_date = "123";
    }
    public String print_liked_users() {
        StringBuilder post_likes = new StringBuilder();
        for(User user : post_liked_users) {
            post_likes.append(user.user_name);
        }
        return post_likes.toString();
    }

    @Override
    public String toString() {
        return "Post Title: " + post_title + "\n" + "Post Body: " + post_body + "\n" + "Post Date: " +
                post_date + "\n" + "Post ID: " + post_id + "\n" + "Post Owner: " + post_owner + "\n" + "Users who Liked: " +
                print_liked_users();
    }
}