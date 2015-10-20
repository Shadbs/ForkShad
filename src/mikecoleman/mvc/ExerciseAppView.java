package mikecoleman.mvc;

import javax.swing.*;

/**
 * Created by Mike on 10/15/2015.
 */
public class ExerciseAppView {

    private ExerciseAppController baseController;
    private MyPersonBean personBeans;


    public ExerciseAppView(ExerciseAppController baseController) {
        this.baseController = baseController;
    }

    public void displayInformation() {
        JOptionPane.showMessageDialog(null, "A popup message");
        JOptionPane.showMessageDialog(null, "Name: " + baseController.getAppModel().getName()
                + " email: " + baseController.getAppModel().getEmail() + " Age: " + baseController.getAppModel().getAge()
                + " Height: " + baseController.getAppModel().getHeight() + " Weight: " + baseController.getAppModel().getWeight());

    }



//    public void displayPeople(){

//        JOptionPane.showMessageDialog(null, baseModel.toString());
//    }


}
