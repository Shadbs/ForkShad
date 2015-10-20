package mikecoleman.mvc;

/**
 * Created by Mike on 10/15/2015.
 * This class contains the main method of the program and gets us out to the controller where method start() is called
 */
public class ExerciseAppRunner {
    public static void main(String[] args) {
        ExerciseAppController baseApp = new ExerciseAppController();
        baseApp.start();

    }
}
