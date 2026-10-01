import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
    

        
    }
}

class UserProfile{
    public String username;
    public String country;

    public UserProfile(String username, String country){
        this.username= username;
        this.country = country;
    }

    public String toString(){
        return "UserProfile [username ="+username +"country = "+country+"]";
    }
}

class Post extends UserProfile{
     public String postid;
     public String contentType;
     
     public Post(String username,String country,String postid, String contentType){
        super(username,country);
        this.postid = postid;
        this.contentType = contentType;
     }

     public String toString(){
        return super.toString()+ "Post [id="+postid+"type+"+contentType+"]";
     
     }


}

class EngagementPost extends Post{
    public int likes;
    public int comments;
    public int share;

    public EngagementPost(String username,String country,String postid, String contentType,int likes,int comments,int share){
        super(username,country,postid,contentType);
        this.likes = likes;
        this.comments = comments;
        this.share = share;
    }

    public String toString(){
        return super.toString() + 
    }


}
