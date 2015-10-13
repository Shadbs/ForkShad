package mike.coleman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * Created by Mike on 10/11/2015.
 * This will contain a log of weights of the person as entered by the user.
 */
public class WeightCollections {
    public static void main(String[] args) {
        // This just creates an ArrayList weightLog with the following weights
        ArrayList<Integer> weightLog = new ArrayList();
        // Creates an iterator to count through the weight values
        ListIterator<Integer> weightLogIterator = null;
        weightLog.add(180);
        weightLog.add(190);
        weightLog.add(170);
        weightLog.add(165);
        weightLog.add(162);
        weightLog.add(162);

        // This adds a weight of 180 into index 2 while pushing the others down an index
        weightLog.add(2,180);

        // This lets you replace a weight of 185 in the first index
        weightLog.set(0,185);

        // This lets you remove the weightLog in index 5
        weightLog.remove(5);

        // This checks if a particular weight exists in the weightLog ArrayList
        boolean exists = weightLog.contains(180);
        if (exists){
            System.out.println("The requested element exists");
        }
        else {
            System.out.println("The requested element does not exist");
        }

        // Print weightLog to the console
        System.out.println(weightLog);

        //This lets you clear all indexes of the arrayList weightLog
        //weightLog.clear();

        // Uses weightLogIterator to show recorded weights
        weightLogIterator = weightLog.listIterator();
        System.out.println("These are the recorded weights in entered order");
        while(weightLogIterator.hasNext()){
            System.out.println(weightLogIterator.next());
        }
        System.out.println("These are the recorded weights in reverse order");
        while(weightLogIterator.hasPrevious()){
            System.out.println(weightLogIterator.previous());
        }

        // This sorts the weightLog collection entries in ascending order
        Collections.sort(weightLog);
        for(int weight: weightLog){
            System.out.println(weight);
        }


    }
}
