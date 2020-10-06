/*
Rohan Parikh
Coder Tester lab
29 September 2020 -
*/



//Status update for 6 October 2020
/*
The pairing method now works! Just to aplhabitize it and i think i need to give the user
the option to sort it a specific way, not too sure.
 */
import java.io.*;
import java.lang.Math;
import java.util.*;

public class Main {
    // Arrays to see if the randomindex has already been used
    static boolean[] usedCoder = new boolean[33];
    static boolean[] usedTester = new boolean[33];

    public static void main(String[] args) {
        //printing out to make sure the values are starting out as false
        System.out.println(Arrays.toString(usedCoder));
        // intiizligin variables and creating array list
        File file;
        Scanner in = new Scanner(System.in);
        List<String> allStudents = new ArrayList<>();

        //String[] studentsAll = allStudents.toArray(new String[33]);

        BufferedReader br;
        int numOfStudents;


            //Reading file into an array using bufferreader
        try {
            file = new File("C:\\Users\\mpari\\Documents\\coding projects\\Java\\Coder Tester Software Design Program\\src\\SD_ClassList.txt");
            br = new BufferedReader(new FileReader(String.valueOf(file)));
            while (br.ready()) {
                allStudents.add(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Asking user for how many students do they want
        System.out.println("How many students should be in pairs?");
            numOfStudents = in.nextInt();
            int i = 0;
            while (i != numOfStudents) {
                i++;

                // method
                String pairs = studentsAll(allStudents, numOfStudents);
                System.out.println(pairs);
            }
    }

    public static String studentsAll(List<String> allStudents, int numOfStudents) {
        while (true) {
            //common variable for randomindex
            int studentsAllLength = allStudents.size();
            //random index and inputting arraylist value into a string
            int randomIndex = (int) (Math.random() * studentsAllLength);
           // String randomElement = allStudents.get(randomIndex); Trying to see if using array directly instead of array will work better
            int randomIndex2 = (int) (Math.random() * studentsAllLength);
            //String randomElement2 = allStudents.get(randomIndex2);
            if ((!usedTester[randomIndex] && !usedCoder[randomIndex2]) && randomIndex != randomIndex2)
            {
                System.out.println(randomIndex);
                System.out.println(randomIndex2);
                System.out.println(Arrays.toString(usedCoder));
                System.out.println(Arrays.toString(usedTester));
                String last = allStudents.get(randomIndex) + "," + allStudents.get(randomIndex2);
                usedCoder[randomIndex2] = true;
                usedTester[randomIndex] = true;
                return last;
            }
        }
    }
}
