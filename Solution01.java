package mj.programs.algorithmicProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution01 {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] a) {
    	
    	//Arrays.asList(ar).forEach(i -> System.out.println(i));
    	
		
		int sum=0;
		int[] b = new int[a.length];
		int j=0;
		for(int i= a.length-1; i>=0;i-- ){
			b[j++]=a[i];
		}
        /*
         * Write your code here.
         */
		return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

