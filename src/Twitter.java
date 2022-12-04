public class Twitter {
    public User logged_in_user;

    public Twitter(String username, String password, String email) {
        this.logged_in_user = new User(username, password, email);
    }

    public static void main(String[] args) {
        Twitter main = new Twitter("justin", "123456", "justin@gmail.com");
        User user2 = new User("not justin", "password", "user2@gmail.com");
        User user3 = new User("not justin 2", "password", "user2@gmail.com");
        Tweet tweet1 = main.logged_in_user.create_tweet(new Tweet("This is a tweet title!", "This is a tweet body!", main.logged_in_user));
        tweet1.user_like_post(user2);
        tweet1.user_like_post(user3);
        System.out.println(tweet1.liked_by);
        tweet1.user_unlike_post(user3);
        System.out.println(tweet1.liked_by);

        user2.follow_user(user3);
        System.out.println(user2.following);
        System.out.println(tweet1);

        Reply reply1 = new Reply("this is a reply", user2, tweet1);
        Reply reply2 = new Reply("this is a reply2", user2, tweet1);
        reply1.like_reply();
        reply1.unlike_reply();

        tweet1.user_reply(reply1);
        tweet1.user_reply(reply2);
        System.out.println(tweet1.replies);
        tweet1.user_delete_reply(reply1);
        System.out.println(tweet1.replies);

        System.out.println(main.logged_in_user.tweets);
        main.logged_in_user.delete_tweet(tweet1);
        System.out.println(main.logged_in_user.tweets);

        System.out.println(main.logged_in_user.following);
        main.logged_in_user.unfollow_user(user2);
        System.out.println(main.logged_in_user.following);

    }
}
