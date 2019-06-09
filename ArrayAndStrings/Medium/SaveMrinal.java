/*
    Partially accepted.
    Learn about MO's algorithm.
*/


import java.util.*;

public class SaveMrinal{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] a = new int[size];

        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
        }

        int testCases = in.nextInt();

        while(testCases>0){
            int start = in.nextInt();
            int end = in.nextInt();
            int[] b = new int[10000001];
            int count =0;

            for(int i =start-1; i<end; i++){
                if(b[a[i]] == 0){
                    b[a[i]]++;
                    count++;
                }else continue;
            }
            System.out.println(count);
            testCases--;
        }
    }
}