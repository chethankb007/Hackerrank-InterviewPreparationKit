import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
                int N=sc.nextInt();
                int M=sc.nextInt();
                
                long A[]=new long[N+2];
                
      
                int queries[][] = new int[M][3];
                for(int i=0;i<M;i++)
                {
                        queries[i][0]= sc.nextInt();
                        queries[i][1]= sc.nextInt();
                        queries[i][2]= sc.nextInt();
                }
                        
                for(int i=0;i<queries.length;i++)
                {
                       int a = queries[i][0];
                       int b = queries[i][1];
                       int k = queries[i][2];
                    
                        A[a]+=k;
                        A[b+1]-= k;
                    }
                    long max = findMax(A);
                    System.out.println(max);
    }
    static long findMax(long[] arr)
    {
        long sum = 0;
        long max = Long.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            sum += arr[i];
            max = Math.max(sum,max);
        }
        return max;
    }
}
