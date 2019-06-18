import java.util.*;

/*Improve for the corner case when only 1 city is there*/

public class SelectionOfCities{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        while(test-->0){
            long x = in.nextLong();
            long ans = cal(2,x) -1;
            System.out.println(ans);
        }
    }

    static long cal(long a, long b){
        if(b==0){
            return 1;
        }
        else if(b%2==0){
            return cal(a*a, b/2);
        }
        else return a*cal(a*a, (b-1)/2);
    }
}