/*
Rohan Parikh
Coder Tester lab
29 September 2020 -
*/

import java.io.*;
import java.lang.Math;
import java.util.*;

public class Main {
    static boolean[] usedCoder = new boolean[33];
    static boolean[] usedTester = new boolean[33];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(usedCoder));
        File file;
        Scanner reply;
        Scanner in = new Scanner(System.in);
        List<String> allStudents = new ArrayList<>();

        String[] studentsAll = allStudents.toArray(new String[33]);

        String fileReader;
        String matchStudents;
        int arrayPlace = 0;
        int numOfStudents;

        try {
            file = new File("C:\\Users\\mpari\\Documents\\coding projects\\Java\\Coder Tester Software Design Program\\src\\SD_ClassList.txt");
            reply = new Scanner(file);

            while (reply.hasNext()) {
                fileReader = reply.next();
                studentsAll[arrayPlace] = fileReader;
                arrayPlace++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("How many students should be in pairs?");
            numOfStudents = in.nextInt();
            int i = 0;
            while (i != numOfStudents) {
                i++;
                String pairs = studentsAll(studentsAll, numOfStudents);
                System.out.println(pairs);
            }
    }

    public static String studentsAll(String[] studentsAll, int numOfStudents) {
        while (true) {
            int randomIndex = (int) (Math.random() * studentsAll.length);
            String randomElement = studentsAll[randomIndex];
            int randomIndex2 = (int) (Math.random() * studentsAll.length);
            String randomElement2 = studentsAll[randomIndex2];
            if ((randomIndex2 != randomIndex) || usedCoder[randomIndex] usedTester[][randomIndex2]) {
                String last = randomElement + "," + randomElement2;
                usedCoder[randomIndex] = true;
                usedTester[randomIndex2] = true;
                return last;
            }
        }
    }
}
