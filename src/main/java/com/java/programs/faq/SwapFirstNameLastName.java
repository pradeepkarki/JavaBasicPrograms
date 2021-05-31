package com.java.programs.faq;

/**
 *
 * Change name from fname Mname Lname to lName Fname middleName
 *
 *
 */
public class SwapFirstNameLastName {

    public static void main(String[] args) {

        String name="pradeep kumar karki";
        String temp="";
        String[] nameArr = name.split(" ");

        String fName = nameArr[0];
        String mName = nameArr[1];
        String lName = nameArr[2];

        temp = fName;
        fName= lName;
        lName =mName;
        mName = temp;

        System.out.println(fName +"-"+mName+"-"+lName);



    }

}
