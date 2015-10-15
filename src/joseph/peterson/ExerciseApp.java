package joseph.peterson;

import java.util.Scanner;

public class ExerciseApp{
    //this instance calls the controller class and is used to pass the information.
    private ExerciseAppController controller = new ExerciseAppController();
    public static void main(String[]args){
        //this is an instance that im creating so that we can run the program
        ExerciseApp theApp = new ExerciseApp();
        //this calls the go method using the instance we created above
        theApp.go();
    }

    public void go(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter your email");
        String email = in.nextLine();

        System.out.println("Enter your age");
        int age = in.nextInt();

        System.out.println("Enter your height");
        int height = in.nextInt();

        System.out.println("Enter your weight");
        int weight = in.nextInt();

        //Below is what im going to do with the information that was inputted.
        controller.storePerson(name, email, age, height, weight);
        controller.getAllPersons();
        System.out.println();

    }
}
