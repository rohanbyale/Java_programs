import java.util.*;

public class GameCharacterProfileSystem implements Cloneable {
    // public Character c= new Character();
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        String characterId = sc.nextLine();
        String playerName = sc.nextLine();
        int level = sc.nextInt();
        if (level < 0) {
            System.out.println("Error: Invalid character details");
            System.exit(0);
        }
        double health = sc.nextDouble();

        Character char1 = new Character(characterId, playerName, level, health);

        IO.println("Original Character:");
        IO.println(char1);

        Character char2 = char1.clone();

        // modification
        char2.level = char2.level + 5;
        char2.health = char2.health - 20;
        IO.println("Cloned Character:");
        IO.println(char2);
    }
}

class Character implements Cloneable {
    public String id;
    public String name;
    public int level;
    public double health;

    public Character(String id, String name, int level, double health) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.health = health;
    }

    // copy constructor
    // public Character(Character char1)
    // {
    // this.id = char1.id;
    // this.name = char1.name;
    // this.level = char1.level+5;
    // this.health = char1.health-20;
    // }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }

    public String toString() {
        return "CharacterId=" + id + ", PlayerName=" + name + ", Level=" + level + ", Health=" + health;
    }
}