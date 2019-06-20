import java.util.*;

public class BabluKiBabli{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int queries = in.nextInt();
        int[] a = new int[size];
        for(int i = 0; i<size; i++){
            if(i==0){a[0] = in.nextInt();}
            else{a[i] = a[i-1] + in.nextInt();}
        }
        while(queries>0){
            int find = in.nextInt();
            int ans = 0;
            int l = 0; int r = a.length-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                //System.out.println("L--> " + l + " MID--> " + mid + " R--> " + r);
                if(find<=a[mid]){
                    ans = mid;
                    r = mid-1;
                }else if(find > a[mid]){
                    l = mid+1;
                }
            }
            System.out.println((ans+1));
            queries--;
        }
        
    }

    
}
