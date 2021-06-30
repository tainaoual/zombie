package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here  Create a Zombie class with the following attributes... brainLust, strength, intelligence,
        //    and compassion. Choose the most appropriate type for each of these fields.
        Scanner input = new Scanner(System.in);
        Zombie zombie= new Zombie();
        zombie.brainLust="lol very lost,100%lost";
        zombie.strength=100;
        zombie.compassion= 0;
        zombie.intelligence =5;
        System.out.print("\nPlease enter brainLust for your zombie: "    +zombie.brainLust()   +
                "\nstrength is "    +   zombie.strength()+
                "\ngoblin compassion "   +
                zombie.compassion()     +       "\ngloben intelligence   "     +    zombie.intelligence() );
        // Golbin golbin= new Golbin(name);
    }
}
