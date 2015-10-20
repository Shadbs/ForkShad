package mikecoleman.mvc;


import java.util.Scanner;

/**
 * Created by Mike on 10/15/2015.
 */
public class ExerciseAppController {
    // Directly referenced from the main method to start program here
    public void start() {
        appView.displayInformation();
        makePerson();
    }

    // Instantiate all necessary classes for controller to have access to all parts of the program
    private ExerciseAppView appView;
    private MyPersonBean people;
    private ExerciseAppModel theModel;

    public ExerciseAppController() {
        appView = new ExerciseAppView(this);
        people = new MyPersonBean("Mike", "michaelrcoleman@hotmail.com", 26, 71, 180);
        theModel = new ExerciseAppModel();
    }

    public MyPersonBean getAppModel() {
        return people;
    }

    // Method to store user input to create new instances of MyPersonBean, call addPerson method
    public void storePerson(String name, String email, int age, int height, int weight) {
        MyPersonBean newPerson = new MyPersonBean(name, email, age, height, weight);
        theModel.addPerson(newPerson);
    }


    // Method to create new users for the ExerciseApp
    public void makePerson() {
        String name;
        String email;
        int age;
        int height;
        int weight;

        // Change loop value for how many users you want to add
        for (int i = 0; i < 2; i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your name");
            name = input.nextLine();
            System.out.println("Please enter your email");
            email = input.nextLine();
            System.out.println("Please enter your age");
            age = input.nextInt();
            System.out.println("Please enter your height");
            height = input.nextInt();
            System.out.println("Please enter your weight");
            weight = input.nextInt();

            // Call storePerson method and pass in the user inputs
            this.storePerson(name, email, age, height, weight);
        }
        // Output the arrayList persons containing all MyPersonBeans created
        System.out.println(theModel.persons);


//        // A different way to output the arrayList persons containing all MyPersonBeans created
//        for(MyPersonBean allPersons:theModel.persons){
//            System.out.println(allPersons);
//        }


    }


}
