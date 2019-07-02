import java.util.*;

public class MonkAndPolynomial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while(testCases>0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long k = in.nextLong();
            if(k-c==0 || k-c==1){
                System.out.println(k-c);
            }else{
                long ans =0;
                long l =0; long r = 10000;
                while(l<=r){
                    long mid = l + (r-l)/2;
                    System.out.println("L--> " + l + " MID--> " + mid + " R--> " + r);
                    long value = a*mid*mid+b*mid+c;
                    System.out.println("Value of Polynomial--> " +value);
                    if(value<k){
                        l = mid +1;
                    }else if(value>=k){
                        ans = mid;
                        r = mid-1;
                    }
                }
                System.out.println(ans);
            }
            testCases--;
        }
    }
}