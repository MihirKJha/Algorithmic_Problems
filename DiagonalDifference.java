package mj.programs.algorithmicProblems;

import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
    	int sumD1=0;int sumD2=0;
    	int jCnt=a.length-1;
    	//Calculating Sum of First Diagonal
    	for(int i=0;i<a.length;i++){
    		   sumD1+=a[i][i];
    	}
    	System.out.println(sumD1);
    	//Calculating Sum of Second Diagonal
    	for(int i=0;i<a.length;i++){
 		   sumD2+=a[i][jCnt--];
 		} 
    	System.out.println(sumD2);
		return Math.abs(Math.subtractExact(sumD1, sumD2));
       }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

       /* bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();*/
        System.out.println(result);
    }
}