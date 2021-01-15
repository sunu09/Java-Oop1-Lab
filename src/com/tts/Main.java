package com.tts;
import com.tts.Pet;
import com.tts.Dog;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Pet truePet = new Pet();
        truePet.name = "Floppy";
        truePet.age = 2;
        truePet.location = "Shreveport";
        truePet.type = "unknown";
        System.out.println(truePet);
        Pet fam = new Pet("Biscuit", 1, "Bossier", "Poodle");
        System.out.println(fam);

        Dog ownedDog = new Dog();
        ownedDog.name = "Siya";
        ownedDog.age = 1;
        ownedDog.type = "mixed";
        System.out.println(ownedDog);
        Dog fam1 = new Dog("JoJo", 5, "Hound");
        Dog fam2 = new Dog("Brownie", 1, "German Sherperd");
        System.out.println(fam1);
        System.out.println(fam2);
        System.out.println("This is the method returns string.");
    }

    public static boolean ageEquals(Dog fam1, Dog fam2){
            if (fam1.age == fam2.age) {
                return true;
            } else {
                return false;
            }

//     return ageEquals(,);
    }

}
