package ch.bbw.al;

import java.util.ArrayList;
import java.util.Scanner;

public class Zork_Intro {


    public static void main(String[] args) throws Exception {

        System.out.println("-------------------------------------------");
        String t = "Welcome to my Zork mini-game ʕ•́ᴥ•̀ʔっ";
        ArrayList<String> word = new ArrayList<>();

        for (int e = 0; e < t.length(); e++) {
            char str = t.charAt(e);
            word.add(String.valueOf(str));
        }

        for (int i = 0; i < t.length(); i++) {

            System.out.print(word.get(i));
            Thread.sleep(150);

        }

        word.clear();
        System.out.println("");
        System.out.println("-------------------------------------------");


        System.out.println("START || QUIT");


        Scanner scan = new Scanner(System.in);
        String eingabe;
        eingabe = scan.nextLine();
        int a = 0;

        while (a == 0) {

            switch (eingabe.toLowerCase()) {
                case "start":
                    a = 1;
                    break;
                case "quit":

                    String ta = "WHYYYYYYYYYYY did you quit? ʕ•̀ᴥ•́ʔ";

                    for (int e = 0; e < ta.length(); e++) {
                        char str = ta.charAt(e);
                        word.add(String.valueOf(str));
                    }

                    for (int i = 0; i < ta.length(); i++) {

                        System.out.print(word.get(i));
                        Thread.sleep(1);

                    }
                    word.clear();
                    System.exit(0);
                    break;

                default:
                    break;
            }


        }

        System.out.println("-------------------------------------------");
        String y = "YOU ARE IN A ROOM WITH THREE DOORS AND ONE KEY.";

        for (int e = 0; e < y.length(); e++) {
            char str = y.charAt(e);
            word.add(String.valueOf(str));
        }

        for (int i = 0; i < y.length(); i++) {

            System.out.print(word.get(i));
            Thread.sleep(150);

        }
        word.clear();
        System.out.println("");

        String x = "WHERE DO YOU WANT TO SEARCH FOR THE KEY?";

        for (int e = 0; e < x.length(); e++) {
            char str = x.charAt(e);
            word.add(String.valueOf(str));
        }

        for (int i = 0; i < x.length(); i++) {

            System.out.print(word.get(i));
            Thread.sleep(50);

        }
        word.clear();
        Thread.sleep(300);
        System.out.println("");
        System.out.println("-------------------------------------------");

        System.out.println("OPTION 1:");
        System.out.println("Under the bed");
        System.out.println("-");
        System.out.println("OPTION 2:");
        System.out.println("In the closet");
        System.out.println("-");
        System.out.println("OPTION 3:");
        System.out.println("In my bag");
        System.out.println("-");
        System.out.println("OPTION 4:");
        System.out.println("Under the carpet");
        System.out.println("-");
        System.out.println("OPTION 5:");
        System.out.println("Behind the painting of the Mona Mista");

        ArrayList<String> list = new ArrayList<>();
        String gun = "gun";

        ArrayList<String> bone = new ArrayList<>();
        String dog = "dog";

        String suche;
        int k = 1;
        while (k == 1) {
            suche = scan.nextLine();
            switch (suche) {
                case "Under the bed":
                    System.out.println("No keys here just a sock");
                    //no key
                    break;

                case "Option 1":
                    System.out.println("No keys here just a sock");
                    break;

                case "In the closet":
                    System.out.println("No key here buddy");
                    //no key
                    break;

                case "Option 2":
                    System.out.println("No key here buddy");
                    break;

                case "In my bag":
                    System.out.println("You found a revolver with 4 shots in your bag but no key");
                    list.add(gun);
                    //no you found a revolver with 4 shots in it
                    break;

                case "Option 3":
                    System.out.println("You found a revolver with 4 shots in your bag but no key");
                    list.add(gun);
                    break;


                case "Under the carpet":
                    System.out.println("You found a bone but no key");
                    bone.add(dog);
                    //no but u found a bone
                    break;

                case "Option 4":
                    System.out.println("You found a bone but no key");
                    bone.add(dog);
                    break;


                case "Behind the painting of the Mona Mista":
                    System.out.println("Congratulation!!! you found the key ฅʕ´•ᴥ•`ʔฅ.");
                    k = 0;

                    //yessir
                    break;

                case "Option 5":
                    System.out.println("Congratulation!!! you found the key ฅʕ´•ᴥ•`ʔฅ.");
                    k = 0;
                    break;

                default:
                    System.out.println("I don't understand you");
                    break;
            }
        }
        System.out.println("Which Door do you want to open?");
        System.out.println("---------");
        System.out.println("OPTION 1: Door 1");
        System.out.println("-");
        System.out.println("OPTION 2: Door 2");
        System.out.println("-");
        System.out.println("OPTION 3: Door 3");
        System.out.println("-");
        String Tür;
        int u = 1;
        while (u == 1) {
            Tür = scan.nextLine();
            switch (Tür) {

                case "Door 1":
                    String dodge;
                    System.out.println("Not here buddy");
                    System.out.println("-------------------------------------------");
                    if (bone.size() == 1) {
                        System.out.println("A dog enters the room trough the dog door in door 1");
                        System.out.println("Do you want to give him a bone?");
                        System.out.println("YES || NO");

                        dodge = scan.nextLine();
                        switch (dodge) {
                            case "yes":
                                System.out.println("The dog jumps around and is happy");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");

                                break;
                            case "no":
                                System.out.println("The dog looks sad and goes back trough his dog door");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");

                                break;
                            default:
                        }
                    }
                    break;

                case "Option 1":
                    System.out.println("Not this door Buddy!!!");
                    System.out.println("-------------------------------------------");
                    if (bone.size() == 1) {
                        System.out.println("A dog enters the room trough the dog door in door 1");
                        System.out.println("Do you want to give him a bone?");
                        System.out.println("YES || NO");

                        dodge = scan.nextLine();
                        switch (dodge) {
                            case "yes":
                                System.out.println("The dog jumps around and is happy");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");
                                break;
                            case "no":
                                System.out.println("The dog looks sad and goes back trough his dog door");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");

                                break;
                            default:
                        }
                    }
                    break;

                case "Door 2":
                    System.out.println("The key works!!!!");
                    u = 0;
                    break;

                case "Option 2":
                    System.out.println("The key works!!!!");
                    u = 0;
                    break;


                case "Door 3":
                    String gunner;
                    System.out.println("FRAU MÜLLER: HALLO ANDY BIST DU DAS ANDYYYY");
                    if (list.size() == 1) {
                        System.out.println("Do you want to shoot through the door?");
                        System.out.println("YES || NO");

                        gunner = scan.nextLine();
                        switch (gunner) {
                            case "yes":
                                System.out.println("You miss 3 shots but hit the last one");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");

                                break;
                            case "no":
                                System.out.println("You are a good guy continue with the doors");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");
                                break;
                            default:
                        }
                    } else ;
                    break;


                case "Option 3":

                    System.out.println("HERR MÜLLER: HALLO WER IST DA. HALLOOOOOOOOOOOOOOOO!!!!!");
                    if (list.size() == 1) {
                        System.out.println("Do you want to shoot through the door?");
                        System.out.println("YES || NO");

                        gunner = scan.nextLine();
                        switch (gunner) {
                            case "yes":
                                System.out.println("You miss 3 shots but hit the last one");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");

                                break;
                            case "no":
                                System.out.println("You are a good guy continue with the doors");
                                System.out.println("-----------");
                                System.out.println("Which Door do you want to open?");
                                break;
                            default:
                        }
                    }
                    break;

                default:
                    System.out.println("I don't understand");
                    break;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("As you open the door you see that you are in a big house with a lot of rooms.");
        System.out.println("What do you want to do?");
        System.out.println("-------------------------------------------");

        System.out.println("OPTION 1:");
        System.out.println("Bathroom");
        System.out.println("-");
        System.out.println("OPTION 2:");
        System.out.println("Kitchen");
        System.out.println("-");
        System.out.println("OPTION 3:");
        System.out.println("Child room");
        System.out.println("-");
        System.out.println("OPTION 4:");
        System.out.println("Living room");
        System.out.println("-");
        System.out.println("OPTION 5:");
        System.out.println("Leave");
        System.out.println("-");

        ArrayList<String> Fire = new ArrayList<>();
        ArrayList<String> Butcher = new ArrayList<>();
        ArrayList<String> Nintendo = new ArrayList<>();
        ArrayList<String> Lighter = new ArrayList<>();
        ArrayList<String> Medicine = new ArrayList<>();


        Scanner scann = new Scanner(System.in);
        int l = 1;

        while (l == 1) {
            String room = scann.nextLine();
            switch (room) {
                case "Bathroom":
                    System.out.println("You enter the bathroom and take a deodorant with you.");
                    System.out.println("-");
                    Fire.add("Deo");


                    break;

                case "Option 1":
                    System.out.println("You enter the bathroom and take a deodorant.");
                    System.out.println("-");
                    Fire.add("Deo");


                    break;

                case "Kitchen":
                    System.out.println("You enter the kitchen and find a big butcher knife.");
                    System.out.println("-");
                    Butcher.add("Butcher Knife");

                    break;

                case "Option 2":
                    System.out.println("You enter the kitchen and find a big butcher knife.");
                    System.out.println("-");
                    Butcher.add("Butcher Knife");

                    break;

                case "Child room":
                    System.out.println("You enter the child room and find a Nintendo.");
                    System.out.println("-");
                    Nintendo.add("Nintendo 3ds");
                    Lighter.add("Lighter");

                    break;

                case "Option 3":
                    System.out.println("On the way out you see a family picture but you can't remember what happened to them.");
                    System.out.println("-");
                    Nintendo.add("Nintendo 3ds");
                    Lighter.add("Lighter");

                    break;

                case "Living room":
                    System.out.println("You enter the living room and find a lighter.");
                    System.out.println("-");
                    Lighter.add("");


                    break;

                case "Option 4":
                    System.out.println("You enter the living room and find a lighter.");
                    System.out.println("-");
                    Lighter.add("");


                    break;

                case "Leave":
                    System.out.println("-");
                    l = 0;

                    break;

                default:
                    System.out.println("I don't understand **Bip** **Bup**");
                    break;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("As you go out you realize that you know this city and that you are in front of a big city it seems like no one is there.");
        System.out.println("What do you want to do now?");
        System.out.println("-------------------------------------------");
        System.out.println("OPTION 1:");
        System.out.println("Go to the Police station.");
        System.out.println("-");
        System.out.println("OPTION 2:");
        System.out.println("Go to the Hospital.");
        System.out.println("-");
        System.out.println("OPTION 3:");
        System.out.println("Go to your favourite restaurant.");
        System.out.println("-");
        System.out.println("OPTION 4:");
        System.out.println("Go to the supermarket");
        System.out.println("-");
        System.out.println("OPTION 5:");
        System.out.println("Break into another House.");
        System.out.println("-");

        int j = 1;
        while (j == 1) {


            String Outside = scan.nextLine();
            switch (Outside) {
                case "Go to the Police station":
                    System.out.println("As you enter the police station a zombie attacks you.");
                    System.out.println("Do you want to fight or run?");
                    String fight = scan.nextLine();
                    int z = 1;

                    while (z == 1) {

                        if (Butcher.size() == 1 || list.size() == 1) {
                            System.out.println("Do you want to use your weapons?");
                            System.out.println("YES || NO");
                            String kill = scan.nextLine();
                            switch (kill) {
                                case "yes":
                                    System.out.println("You attacked the zombie and smash his head with your foot while he is on the ground. You survived.");
                                    System.out.println("You search the whole building and store some guns in your bag. You are protected by the armor that you found next to the guns.");
                                    System.out.println("-----------");
                                    z = 0;
                                    break;
                                case "no":
                                    System.out.println("-----------");
                                    System.out.println("The zombie kills you.");
                                    System.out.println("-----------");
                                    System.exit(0);
                                    break;

                                default:
                                    break;
                            }
                        } else {
                            switch (fight) {
                                case "fight":
                                    System.out.println("-----------");
                                    System.out.println("YOU DIED");
                                    System.out.println("-----------");
                                    System.exit(0);

                                    break;

                                case "run":
                                    System.out.println("You escaped.");
                                    System.out.println("-----------");
                                    System.out.println("While you are running home you see a garage with a car in it.");
                                    System.out.println("Do you want to break into the house and search for the keys?");
                                    System.out.println("YES || NO");
                                    String jup = scan.nextLine();
                                    System.out.println("-----------");

                                    switch (jup) {
                                        case "yes":
                                            System.out.println("You found the keys for the car.");
                                            System.out.println("Where do you want to drive?");
                                            System.out.println("BEACH||CINEMA");
                                            String drive = scan.nextLine();
                                            switch (drive){
                                                case "Beach":
                                                    System.out.println("You arrive at the beach and see from a far someone who is in the water having fun.");
                                                    System.out.println("You walk up to him and try to talk to him.");
                                                    System.out.println("As he turns around you see that it is a zombie.");
                                                    System.out.println("Finding that out you are so dumbstruck that you can't run away properly.");
                                                    break;
                                                case "Cinema":
                                                    System.out.println("As you enter you see a big dog who is playing around with the arm of a human.");
                                                    System.out.println("The dog seems very happy do you want to stay in the cinema with the dog?");
                                                    System.out.println("STAY||GO AWAY");
                                                    String dodgecoin = scan.nextLine();
                                                    switch (dodgecoin){
                                                        case "stay":
                                                            System.out.println("The dog turns out to be a zombie. He attacks you out of nowhere.");
                                                            System.out.println("YOU DIED");
                                                            break;
                                                        case "go away":
                                                            System.out.println("As you leave the cinema you hear the dog cry.");
                                                            System.out.println("Do you want to go back.");
                                                            System.out.println("YES||NO");
                                                            String dodgeCoin = scan.nextLine();
                                                            System.out.println("-----------");
                                                            switch (dodgeCoin){
                                                                case "yes":
                                                                    System.out.println("You go back because you feel bad.");
                                                                    System.out.println("As you go around the corner to see the dog you recognize that he turned into a zombie.");
                                                                    System.out.println("He catches you and brutally kills you while you scream.");
                                                                    System.out.println("-----------");
                                                                    System.out.println("YOU DIED");
                                                                    System.out.println("-----------");
                                                                    break;
                                                                case "no":
                                                                    System.out.println("Honestly I don't know where to go from here on out XD.");
                                                                    System.out.println("Suicide I guess.");
                                                                    System.exit(0);
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                        case "no":
                                            System.out.println("");
                                            System.exit(0);
                                            break;
                                    }
                                    z = 0;
                                    break;

                                default:
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case "Go to the Hospital":
                    System.out.println("You search for people in the Hospital but can't find anyone.");
                    System.out.println("You take a lot of medicine with you for future injuries.");
                    Medicine.add("");
                    System.out.println("You think that it probably is best to store all of the medicine at home.");
                    System.out.println("As you go home you see an injured person dying on the ground.");
                    System.out.println("Do you want to give him some medicine.");
                    System.out.println("YES||NO");
                    String ana = scan.nextLine();
                    switch (ana) {
                        case "yes":
                            System.out.println("He survived thanks to you.");
                            System.out.println("Do you want to take him with you?");
                            System.out.println("YES||NO");
                            String anane = scan.nextLine();
                            switch (anane){
                                case "yes":
                                    System.out.println("As you two enter your home you see that zombies broke into your home.");
                                    System.out.println("Together you overwhelm the zombies.");
                                    break;
                                case "no":
                                    System.out.println("As you enter your home you see that zombies broke into your home.");
                                    System.out.println("Because you're alone the zombies overwhelm you.");
                                    System.out.println("YOU DIED");
                                    break;
                            }
                            break;

                        case "nein":
                            System.out.println("You die. XO");
                            break;
                    } j = 0;


                    break;
                case "Go to your favourite restaurant":
                    System.out.println("As you enter you see someone. You run up to him and ask him about the current economical and political state of the world.");
                    System.out.println("-----------");
                    System.out.println("JEFF: What is wrong with you? We are in the middle of a Zombie apocalypse how did you miss that?");
                    System.out.println("-----------");
                    System.out.println("You talk with him for a long time and he tells you everything about the current state of the world.");
                    System.out.println("-----------");
                    System.out.println("JEFF: I'm going to the hideout do you want to come with me?");
                    String antwort = scan.nextLine();

                    switch (antwort) {
                        case "yes":
                            System.out.println("JEFF: Then come with me.");
                            System.out.println("You start following him into the hideout.");
                            System.out.println("Everyone is happy to see another human.");
                            System.out.println("You live the rest of your life in the hideout.");
                            System.exit(0);
                            break;
                        case "no":
                            System.out.println("JEFF: To bad are you sure. I hope we will se each other again you seem like a nice dude.");
                            System.out.println("JEFF: disappears into the shadows of the kitchen.");
                            System.out.println("As you go out you get attacked by a zombie. You decided to fight the zombie.");
                            System.out.println("You won the fight but you are so injured that you black out.");
                            System.out.println("You wake up in a room where humans are standing around you.");
                            System.out.println("Jeff tells you that you he found you blacked out in the middle of the city.");
                            System.out.println("You live the rest of your life in the hideout. XD");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("JEFF: What did you say?");
                            break;
                    } j = 0;
                    break;
                case "Break into another House":
                    System.out.println("You search the whole house but the only thing that you find is a sad kid.");
                    System.out.println("Do you want to take care of the kid?");
                    String ent = scan.nextLine();
                    switch (ent) {
                        case "yes":
                            System.out.println("The kid is infected and kills you while you are not looking.");
                            System.exit(0);
                            break;
                        case "no":
                            System.out.println("You go back home and regret your decision for the rest of your life.");
                            System.out.println("You die alone.");
                            System.exit(0);
                            break;

                    }
                    j = 0;
                    break;

                case "Go to the supermarket":
                    System.out.println("While you take the food and water from the shelves of the supermarket.");
                    System.out.println("You see that a zombie is coming to you.");
                    if ( Lighter.size() == 1 && Fire.size() == 1){
                        System.out.println("Do you want to use your lighter and deo to light the zombie on fire?");
                        System.out.println("YES||NO");
                        String an = scan.nextLine();
                        switch (an){
                            case "yes":
                                System.out.println("You won");
                                System.out.println("But the fire from the the burning zombie is spreading.");
                                System.out.println("As you run out you turn around and see that the whole supermarket is burning down.");
                                System.out.println("Because of the fire people know that you are at the supermarket. A group of people come and rescue you.");
                                System.exit(0);
                                break;
                            case "no":
                                System.out.println("The zombie is faster and stronger than you that is why you don't have any chance.");
                                System.out.println("-----------");
                                System.out.println("YOU DIED");
                                System.out.println("-----------");
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("I don't understand XP");
                    break;
            }
        }
    }
}

