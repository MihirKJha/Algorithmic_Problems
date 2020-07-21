package mj.programs.algorithmicProblems;

import java.io.IOException;
import java.util.Scanner;

public class TripletsCompare {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */
        int aSum=0; int bSum=0;
        int[] arr = new int[2];
        int[] a = new int[3];
        int[] b = new int[3];
        a[0]=a0;
        a[1]=a1;
        a[2]=a2;
        b[0]=b0;
        b[1]=b1;
        b[2]=b2;
        
        for(int i=0;i<3;i++){
           if(a[i]>b[i]){
            aSum++;
           }else if(a[i]<b[i]){
            bSum++;
           }
        }
        arr[0]=aSum;
        arr[1]=bSum;
        return arr;
    }
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	Scanner sc = new Scanner(System.in);
        String[] a0A1A2 = sc.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = sc.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
           System.out.println(result[resultItr]);
          }

       // bw.newLine();

        sc.close();
    }
}

