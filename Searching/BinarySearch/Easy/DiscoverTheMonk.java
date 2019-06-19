import java.util.*;

public class DiscoverTheMonk{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int queries = in.nextInt();
        int[] a = new int[size];
        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        while(queries>0){
            int x = in.nextInt();
            boolean ans = binarySearch(a,x);
            if(ans==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            queries--;  
        }
    }

    static boolean binarySearch(int[] a, int x){
        boolean ans = false;
        int l = 0; int r = a.length-1;

        while(l<=r){
            
            int mid = l + (r-l)/2;
            //System.out.println("R--> " + r + " MID--> " + mid + " L--> " + l);
            if(x==a[mid]){
                ans = true;
                break;
            }
            else if(x<a[mid]){r = mid-1;}
            else if (x>a[mid]){l = mid+1;}
        }
        
        return ans;
    }
}