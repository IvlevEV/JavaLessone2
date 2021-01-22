package Lessone2;

import java.util.Arrays;

public class TestingClass {

    public static void main(String[] args) throws MyExceptions {

        // Option 1. A 4x4 matrix // no exceptions
        String[][] input = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        // Option 2. A 4х5 matrix // MyArraySizeException

        String[][] input1 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}};

        // Option 3. A 4x4 matrix instead of a number // MyArrayDataException
        String[][] input2 = new String[][]{
                {"1", "2", "3", "@"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};


        MassArray summa = new MassArray();


//        System.out.println("The result of the calculation of the amount: " + MassArray.sum(input));
//        System.out.println("The result of the calculation of the amount: " + MassArray.sum(input1));
        System.out.println("The result of the calculation of the amount: " + MassArray.sum(input2));


    }
}




