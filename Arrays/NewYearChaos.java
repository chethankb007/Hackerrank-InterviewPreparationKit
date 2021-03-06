import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
         int swap = 0;

         for(int i=arr.length-1;i>=0;i--)
         {
             if(arr[i] != (i+1))
             {
                 if(arr[i-1] == (i+1))
                 {

                     swap = swap+1;

                     swapElem(arr,i-1,i);
                    
                 }
                 else if(arr[i-2] == (i+1))
                 {
                     swap = swap+2;
                     swapElem(arr,i-2,i-1);
                     swapElem(arr,i-1,i);
                 }
                 else{
                     System.out.println("Too chaotic");
                     return;
                 }
             }
         }
         System.out.println(swap);
       
    }
    static void swapElem(int[]arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
