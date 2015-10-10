package joseph.peterson;

import java.util.ArrayList;


/**
 * Created by Joseph on 10/7/2015.
 */
public class ExerciseAppModel {
    //This class will hold an array list and
    //the methods to add or remove a person or get all persons
    ArrayList persons = new ArrayList();
    public void addPerson(PersonBean aPerson){
        this.persons.add(aPerson);
    }
    //methods do something and return. getters and setters are specific methods that get info and store it.
    // public int RemovePerson(){
    // return this.RemovePerson;
    // }

}
