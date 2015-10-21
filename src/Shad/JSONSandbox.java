package com.stanger.shad;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.tests.TestObject;

import java.io.*;
import java.util.HashMap;


/**
 * Created by Shad on 10/14/2015.
 */
public class JSONSandbox implements Serializable{
 public static void main(String[] args) {
// extracts PersonBean and adds the json parameters
         PersonBean newBean = new PersonBean("Shad", "sbstanger@gmail.com", 27, 6, 175);
         try {
             String jsonString = JSONUtilities.stringify(newBean);
             System.out.println(jsonString);
         } catch (JSONException e) {
             e.printStackTrace();
         }
     // extracts TestBean and adds the json parameters, has null value to show the null ability.
        TestBean newerBean = new TestBean("Shad", "Stanger", 8, 10, 1988);
        try{
            String jsonString = JSONUtilities.stringify(newerBean);
            System.out.println(jsonString);
        } catch (JSONException e){
            e.printStackTrace();
        }
     File aFile = new File("C:\\Users\\Shad\\test\\test.txt");
     try{
         FileOutputStream aFileStream = new FileOutputStream(aFile);
         JSONOutputStream jsonOUT = new JSONOutputStream(aFileStream);
         jsonOUT.writeObject(newBean);
         jsonOUT.close();
     }
     catch (Exception e){e.printStackTrace();}

     File aFile2 = new File("C:\\Users\\Shad\\test\\test.txt");
         try{FileInputStream aFileStream2 = new FileInputStream(aFile2);
             JSONInputStream jsonIN = new JSONInputStream(aFileStream2);
             HashMap result = (HashMap)jsonIN.readObject();
             jsonIN.close();
             System.out.println(result);
         }
         catch (Exception e){e.printStackTrace();}
     }
     }

