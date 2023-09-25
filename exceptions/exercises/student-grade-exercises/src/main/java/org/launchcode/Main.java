package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        Divide (x, y);

        int a = 5;
        int b = 0;
        Divide (a, b);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(String.valueOf(studentFiles));
    }

    public static void Divide(int x, int y)
    {
        int grade;
        try
        {
// performing division and storing th result
            grade = x / y;
            System.out.println("Division process has been done successfully.");
            System.out.println("Result came after division is: " + grade);
        }
// handling the exception in the catch block
        catch(java.lang.ArithmeticException ex)
        {
            System.out.println("Should avoid dividing by 0 " + ex);
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        int numPoints;
        if (fileName.endsWith(".java") ) {
            return numPoints = 1;
        } else if (fileName.isEmpty() || fileName == null) {
            return numPoints = -1;
        }
        return numPoints = 0;
    }
}