import java.util.Scanner;
/*
Create a method called generateEnergy() that:
•	does not take any arguments
•	internally assigns a number (e.g., steps walked)
•	calculates energy = steps × 5
•	returns the energy
In main():
•	store the returned value in a variable
•	if energy > 500 → print "High Energy"
•	else → print "Low Energy"
Test Cases:
1.	steps = 120 → energy = 600 → Output: High Energy
2.	steps = 80 → energy = 400 → Output: Low Energy
3.	steps = 100 → energy = 500 → Output: Low Energy
*/

public class EnergyCalulator {
    public static void main(String[] args) {
        int ener = generateEnergy();
        System.out.println("Energy: " + ener);
        if (ener > 500) {
            System.out.println("High Energy");
        } else {
            System.out.println("Low Energy");
        }
    }

    public static int generateEnergy() {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        int energy = steps * 5;
        return energy;
    }
}