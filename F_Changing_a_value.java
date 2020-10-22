package ArraysList;

import java.util.ArrayList;
public class F_Changing_a_value {

    // code written by me:
    public static void main(String[] args) {

        /*
        ArrayList<String> animalName = new ArrayList<String>();
        animalName.add("donkey");
        animalName.add("dog");
        animalName.add("elephant");
        animalName.add("camel");
        animalName.add("cow");


        ArrayList<String> birdName = new ArrayList<String>();
        birdName.add("parrot");
        birdName.add("cock");
        birdName.add("pigeon");
        birdName.add("peacock");
        birdName.add("duck");


        animalName.set(0, "buffalo");
        birdName.set(2, "eagle");
        System.out.println("There are the lists of recent animal we have:");
        System.out.println(animalName.toString() + "\n");
        System.out.println("There are the lists of recent birds in our farm:");
        System.out.println(birdName.toString());

        */


        // code from codeAcademy:

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Set each to-do below:
        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlocksToDos.toString() + "\n");
        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos.toString());
    }
}
