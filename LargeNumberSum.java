package mj.programs.algorithmicProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*We can calculate the sum of the elements in the array by traversing the array once, summing
each element as we go. Because this sum can be quite large, we must use a long data type to hold the
value of our sum. A signed −bit integer uses the first bit to represent the sign of the number and
the remaining  bits to represent the magnitude. The range of a 32−bit integer is  to , or . When we add 
several integer values, the resulting sum might exceed this range. Use long long in C/C++ and long in Java.*/


public class LargeNumberSum {

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        /*
         * Write your code here.
         */
        long largeSum  =0 ; 
        for(int i=0;i<n;i++){
            largeSum+= ar[i];
            
        }
        return largeSum;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        long[] ar = new long[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            long arItem = Long.parseLong(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        long result = aVeryBigSum(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

