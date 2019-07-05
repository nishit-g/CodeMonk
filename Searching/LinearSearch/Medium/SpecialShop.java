import java.util.*;

//Need Improvement

public class SpecialShop{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        while(testCases>0){
            int n = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int a = (c<d)? c : d;
            int b = (a==c)? d : c;

            long sum = Long.MAX_VALUE;  

            for(int i = n ; i>-1; i--){
                long k = a*i*i + b*(n-i)*(n-i);
                if(k<sum){
                    sum = k;
                }
            }
            System.out.println(sum);
            testCases--;
        }
    }
}