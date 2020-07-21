package mj.programs.algorithmicProblems;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
      long a=(long)arr[0]+arr[1]+arr[2]+arr[3];
      long b=(long)arr[1]+arr[2]+arr[3]+arr[4];
      long c=(long)arr[0]+arr[2]+arr[3]+arr[4];
      long d=(long)arr[0]+arr[1]+arr[2]+arr[4];
      long e=(long)arr[0]+arr[1]+arr[3]+arr[4];
      List<Long> arrLong = Arrays.asList(a,b,c,d,e);
      Comparator<Long> compr = (o1, o2)-> o1>o2?1:-1;
      Collections.sort(arrLong, compr);
      System.out.print(arrLong.get(0)+" "+ arrLong.get(arrLong.size()-1));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}

