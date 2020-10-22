package ArraysList;

import java.util.ArrayList;
public class C_Array_List {

    public static void main(String[] args) {

        // I have used here Integer object type to store number.
        ArrayList<Integer> diceRoll = new ArrayList<Integer>();
        diceRoll.add(5);
        diceRoll.add(4);
        diceRoll.add(6);
        diceRoll.add(2);
        diceRoll.add(6);
        diceRoll.add(3);
        System.out.println(diceRoll);

        // In the exercise it is defined about string:
        ArrayList<String> taskScheduler = new ArrayList<String>();

        // declaring String to variable:
        String task1 = "Complete the java course of CodeAcademy";
        String task2 = "Learn Operating System";
        String task3 = "Learn Maths and DataStructure";
        String task4 = "Become a successful App developer";

        taskScheduler.add(task1);
        taskScheduler.add(task2);
        taskScheduler.add(task3);
        taskScheduler.add(task4);
        taskScheduler.remove(task1);

        System.out.println(taskScheduler);

    }
}


