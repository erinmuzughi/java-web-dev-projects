package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        Divide(x, y);

        int a = 5;
        int b = 0;
        Divide(a, b);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Bob", "MyCoolProgram");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            String studentName = student.getKey();
            String fileName = student.getValue();
            int points = 0;

            try {
                int result = CheckFileExtension(fileName);
                // Handle points assignment based on the result
                if (result == 1) {
                    points = 1; // +1 for valid file names
                    System.out.println(studentName + " has a valid file name that does end in '.java' and has received: " + points + " points.");
                } else if (result == 0) {
                    System.out.println(studentName + " has a valid file name but it does end in '.java' so they have received: " + points + " points.");
                }

            } catch (InvalidFileNameException e) {
                points = -1;
                System.out.println(studentName + " has an invalid file name and has received: " + points + " points: " + e.getMessage());
            }

        }
    }

        public static void Divide ( int x, int y)
        {
            int grade;
            try {
// performing division and storing th result
                grade = x / y;
                System.out.println("Division process has been done successfully.");
                System.out.println("Result came after division is: " + grade);
            }
// handling the exception in the catch block
            catch (java.lang.ArithmeticException e) {
                System.out.println("Should avoid dividing by 0 " + e);
            }
        }

        public static int CheckFileExtension (String fileName) throws InvalidFileNameException {
            int numPoints = 0;
            if (fileName.endsWith(".java")) {
                numPoints = 1;
            } else if (fileName.isEmpty() || fileName == null) {
                throw new InvalidFileNameException("File name is not valid, contains either an empty string or is null.");
            }
                return numPoints;
        }
    }