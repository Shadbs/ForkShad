package com.stanger.shad;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;

import java.io.Serializable;

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
        TestBean newerBean = new TestBean("Shad", null, 8, 10, 1988);
        try{
            String jsonString = JSONUtilities.stringify(newerBean);
            System.out.println(jsonString);
        } catch (JSONException e){
            e.printStackTrace();
        }

     }
 }
