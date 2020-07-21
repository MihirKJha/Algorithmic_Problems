package mj.programs.algorithmicProblems;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
    	int cntPos=0;int cntNeg=0;int cntZero=0;
    	for(int i:arr){
    		if(i==0){
    			cntZero++;	
    		}else if(i>0){
    			cntPos++;
    		}else if(i<0){
    			cntNeg++;
    		}
    	}
    	
    	System.out.println((float)cntPos/arr.length);
    	System.out.println((float)cntNeg/arr.length);
    	System.out.println((float)cntZero/arr.length);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
