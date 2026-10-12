import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String artid1 = sc.nextLine();
        String artName1 = sc.nextLine();
        double price1 = sc.nextDouble();
        sc.nextLine();
        String artistName1 = sc.nextLine();
        String country1 = sc.nextLine();

        // second Artist
        String artid2 = sc.nextLine();
        String artName2 = sc.nextLine();
        double price2 = sc.nextDouble();
        sc.nextLine();
        String artistName2 = sc.nextLine();
        String country2 = sc.nextLine();

        ArtPiece[] a = new ArtPiece[2];

        a[0] = new ArtPiece(artid1, artName1, price1, new ArtPiece.Artist(artistName1, country1));
        a[1] = new ArtPiece(artid2, artName2, price2, new ArtPiece.Artist(artistName2, country2));

    }
}

class ArtPiece {
    public String artid;
    public String artName;
    public double price;
    public Artist artist;

    public ArtPiece(String artid, String artName, double price, Artist artist) {
        this.artid = artid;
        this.artName = artName;
        this.price = price;
        this.artist = artist;
    }

    // inner class
    static class Artist {
        public String artistName;
        public String country;

        public Artist(String artistName, String country) {
            this.artistName = artistName;
            this.country = country;
        }
    }

    public void printDetails() {
        System.out.println("Art Id: " + artid);
        System.out.println("Art Name: " + artName);
        System.out.println("Price : " + price);
        System.out.println("Artist: " + artist.artistName);
        System.out.println("Contry: " + artist.country);
    }

}