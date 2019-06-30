import java.util.*;

//Needs improvement

public class TheOldMonk{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while(testCases>0){
            int size = in.nextInt();
            long[] a = new long[size];
            long[] b = new long[size];

            for(int i =0; i<size; i++){
                a[i] = in.nextLong();
            }
            for(int i =0; i<size; i++){
                b[i] = in.nextLong();
            }
            long max = 0;
            for(int i =0; i<size; i++){
                long find = a[i];
                long index = binarySearch(b, find);
                System.out.println(" ");
                System.out.println("For element-->" + a[i] + " best index in second array is--> " + index);
                long diff = index-i;
                System.out.println("A's pos--> " + i + " diff--> " + diff);
                System.out.println(" ");
                if(max<diff){
                    max = diff;
                }
            }

            System.out.println(max);

            testCases--;
        }
    }

    static long binarySearch(long[] a, long find){
        long index = 0;
        long r = a.length-1; long l = 0;
        while(l<=r){
            long mid = l + (r-l)/2;
            System.out.println("L--> " + l + " MID--> " + mid + " R--> " + r);
           if(find<=a[mid]){
               index = mid;
                l = mid+1;
            }else if(find > a[mid]){
                r = mid-1;
            }

        }
        
        return index;
    }
}