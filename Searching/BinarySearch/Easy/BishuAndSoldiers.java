import java.util.*;

public class BishuAndSoldiers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[size];
        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int queries = in.nextInt();
        while(queries>0){
          int power = in.nextInt();
          int sum =0;
          int index = 0;
          for(int i =0; i<a.length; i++){
              if(a[i]<=power){
                  sum+=a[i];
                  index++;
              }
          }
          System.out.println(index+ " " + sum);
            queries--;
        }
    }
}