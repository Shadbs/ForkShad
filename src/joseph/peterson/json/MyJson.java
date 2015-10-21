package joseph.peterson.json;


import jdk.nashorn.internal.runtime.JSONFunctions;

/**
 * Created by Joseph on 10/20/2015.
 */
public class MyJson {

    public static void main(String[] args) {

        MyJson jason = new MyJson();
        jason.goBaby();
    }

//nasty path
    public void goBaby() {
        JSONFunctions.parse("something", null);
        System.out.println("i dont get JSON in java");
    }
}