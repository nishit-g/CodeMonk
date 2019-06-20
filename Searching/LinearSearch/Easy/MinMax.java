import java.util.*;

public class MinMax{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        long[] a = new long[size];

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum=0;
        for(int i = 0; i<size; i++){
            a[i] = in.nextInt();
            if(a[i]<min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
            sum +=a[i];
        }

        System.out.println((sum-max) + " " +  (sum-min));

    }
}