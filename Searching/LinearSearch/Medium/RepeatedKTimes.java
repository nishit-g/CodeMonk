import java.util.*;

public class RepeatedKTimes{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
            b[a[i]]++;
        }

        int k = in.nextInt();
        int min = 999999;
        for(int i =0; i<size; i++){
            if(b[i]==k){
                if(i<min){
                    min = i;
                }
            }
        }

        System.out.println(min+1);
        
    }
}