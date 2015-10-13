package mike.coleman;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Mike on 10/12/2015.
 * This will create a Set of foods as a log of what the person has ate.
 */
public class FoodHashSet {
    public static void main(String[] args) {

        // HashSet does not remember order you put these values into the set, LinkedHashSet does
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("Banana");
        mySet.add("Captain Crunch");
        mySet.add("Cookies");
        mySet.add("Milk");
        mySet.add("Grapes");


        Set<String> mySet2 = new LinkedHashSet<>();
        mySet.add("Doritos");
        mySet.add("Taquitos");


        // Sets can't have duplicate elements, so attempting to add one does nothing
        mySet.add("Grapes");
        // Prints out the elements in the Set
        System.out.println(mySet);

        // Checks if selected fruit is in the set
        boolean isContained = mySet.contains("Grapes");
        if(isContained){
            System.out.println("The requested food is part of the Set");
        }
        else{
            System.out.println("The requested food was not found in the Set");
        }
        // Removes an element from the Set
        mySet.remove("Cookies");
        System.out.println(mySet);

        // Checks how many unique elements are in the Set
        System.out.println(mySet.size());

        // This would clear the Set of all current elements
        //mySet.clear();

        // Checks if the set is empty or not and returns a boolean value
        System.out.println(mySet.isEmpty());

        // This adds everything from mySet2 into mySet
        mySet.addAll(mySet2);
        System.out.println(mySet);

    }
}
