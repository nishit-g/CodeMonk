import java.util.*;

public class SquareTransaction{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] a = new int[size];
        int[] sum = new int[size];
        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
            if(i==0){sum[0]=a[0];}
            else{
                sum[i]=sum[i-1]+a[i];
            }
        }
        for(int i =0; i<size; i++){
            System.out.print(sum[i]+ " ");
        }
        System.out.println("");
        int queries = in.nextInt();
        while(queries>0){
            int find = in.nextInt();
            int ans = -1;
            for(int j = 0; j<size; j++){
                if(sum[j]>=find){
                    ans = j+1;
                    break;
                }
            }
            System.out.println(ans);
            queries--;
        }
    }
}