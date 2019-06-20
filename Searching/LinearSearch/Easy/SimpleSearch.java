import java.util.*;

public class SimpleSearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] a = new int[size];
        for(int i = 0 ; i<size; i++){
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        for(int i = 0 ; i<size; i++){
            if(k==a[i]){
                System.out.println(i);
                break;
            }
        }
    }
}