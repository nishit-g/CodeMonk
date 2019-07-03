import java.util.*;

public class SumitAndChocolates{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int boxes = in.nextInt();
        int[] sum = new int[boxes];
        for(int i = 0; i<boxes; i++){
            if(i==0){sum[0]=in.nextInt();}
            else{sum[i] = sum[i-1] + in.nextInt();}
        }
        for(int i:sum){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        // int[]index = new int[sum[sum.length-1]];
        // for(int i =0; i<index.length; i++){
        //     index[i] +=1;
        // }
        // for(int i :index){
        //     System.out.print(i+" ");
        // }

        int queries = in.nextInt();
        while(queries>0){
            int find = in.nextInt();
            int ans = binarySearch(sum,find);
            System.out.println((ans+1));
            queries--;
        }
    }

    static int binarySearch(int[] a, int find){
        int ans = -1;
        int l = 0; int r = a.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            System.out.println("L--> " + l + " MID--> " + mid + " R--> " + r);
            if(a[mid] == find){
                ans = mid;
                break;
            }else if(find<a[mid]){
                ans = mid;
                r = mid-1;
            }else if(find > a[mid]){
                l = mid+1;
            }

        }

        return ans;
    }
}