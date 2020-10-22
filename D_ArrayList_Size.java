package ArraysList;

import java.util.ArrayList;
public class D_ArrayList_Size {

    public static void main(String[] args) {
        // There all below codes i have written by myself:
/*

        ArrayList<String> addedItem = new ArrayList<String>();
        // String addedItem1 = ;
         addedItem.add("Fortune rice");
         System.out.println(addedItem.size());
         addedItem.add("Refine oil");
         System.out.println(addedItem.size());
         addedItem.add("salt");
         System.out.println(addedItem.size());
*/
        // This is also i had written:

        ArrayList<String> vendorVegetable = new ArrayList<String>();
        vendorVegetable.add("potato");
        vendorVegetable.add("tomato");
        vendorVegetable.add("onion");
        vendorVegetable.add("garlic");
        vendorVegetable.add("cabbage");

        System.out.println(vendorVegetable.size());

        ArrayList<String> vendorFruits = new ArrayList<String>();
        vendorFruits.add("banana");
        vendorFruits.add("apple");
        vendorFruits.add("graphs");
        vendorFruits.add("lemon");
        vendorFruits.add("watermelon");
        vendorFruits.add("orange");

        System.out.println(vendorFruits.size());

        System.out.println("So the fruits vendor has the highest item of total is: " + vendorFruits.size());
    }
}
