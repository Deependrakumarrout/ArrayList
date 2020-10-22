package ArraysList;

import JavaMethod.H_toString;

import java.util.ArrayList;
public class H_Indexof {
    // Here if i want to know the index of an ArrayList then i can use the function name indexof();
   /*
    ArrayList<String> schoolName = new ArrayList<String>();
    public ArrayList<String> getSchoolName() {
        schoolName.add("Love dale school");
        schoolName.add("Vimala convent school");
        schoolName.add("Abcs");
        schoolName.add("The Dronachariya school");
        System.out.println(schoolName.indexOf("Abcs"));
        schoolName.remove("Abcs");
        return schoolName;
    }

        public static void main(String[] args) {
            H_Indexof name = new H_Indexof();
            System.out.println(name.getSchoolName());

    }
    */

        // There code are of code academy:
    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("listen to Dr. Watson for amusement");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        sherlocksToDos.remove("visit the crime scene");

        // Calculate to-dos until case is solved:
        System.out.println(sherlocksToDos.size());

        // Change the value printed:
        System.out.println(sherlocksToDos.indexOf("solve the case"));

    }


}
