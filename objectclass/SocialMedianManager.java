package objectclass;

/**
 * Main
 */
import java.util.Scanner;

public class SocialMedianManager {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String country = sc.nextLine();
        String postid = sc.nextLine();
        String contentType = sc.nextLine();
        int likes = sc.nextInt();
        int comments = sc.nextInt();
        int share = sc.nextInt();

        if (likes < 0) {
            System.out.println("Error: Engagement values must be non-negative");
            return;
        }
        EngagementPost ob = new EngagementPost(username, country, postid, contentType, likes, comments, share);
        System.out.println(ob);

    }
}

class UserProfile {
    public String username;
    public String country;

    public UserProfile(String username, String country) {
        this.username = username;
        this.country = country;
    }

    public String toString() {
        return "User[username=" + username + ", country=" + country + "]," + "\n";
    }
}

class Post extends UserProfile {
    public String postid;
    public String contentType;

    public Post(String username, String country, String postid, String contentType) {
        super(username, country);
        this.postid = postid;
        this.contentType = contentType;
    }

    public String toString() {
        return super.toString() + "Post[id=" + postid + ", type=" + contentType + "], " + "\n";

    }

}

class EngagementPost extends Post {
    public int likes;
    public int comments;
    public int share;

    public EngagementPost(String username, String country, String postid, String contentType, int likes, int comments,
            int share) {
        super(username, country, postid, contentType);
        this.likes = likes;
        this.comments = comments;
        this.share = share;
    }

    public String toString() {
        return super.toString() + "Engagement[likes=" + likes + ", comments=" + comments + ", shares=" + share + "]";
    }

}
