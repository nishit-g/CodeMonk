import java.util.*;

public class TheConfusedMonk{
    public static void main(String[] args) {
        /*
         * 1. Find the product of all the elements of the array. 2. Find the gcd of the
         * array. 3. Use the power rule to not cause the integer overflow. 4. Use the
         * modulo operation.
         */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long[] a = new long[size];
        long m = 1000000007;
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        long gcd = findG(a[0], a[1]);
        for (int i = 2; i < size; i++) {
            gcd = findG(a[i], gcd);
        }
        long ans =(a[1]%m * a[0]%m)%m;
        for(int i=2; i<size;i++){
            ans = (a[i]%m * ans%m)%m;
        }
        System.out.println("Product--> " + ans + " GCD--> " + gcd);
        long ans1 = calculatePower(ans, gcd);
        System.out.println(ans1);
        in.close();
    }

    static long findG(long a1, long b1) {
        long a = (a1 < b1) ? a1 : b1; // min of both elements
        long b = (a1 < b1) ? b1 : a1; // max of both elements

        if (a == 0) {
            return b;
        }
        return findG(b % a, a);
    }

    static long calculatePower(long n, long a){
        if(a==0)
            return 1;

        else if(a%2==0){
            return calculatePower((n*n), a/2);
        }else{
            return n*calculatePower((n*n), (a-1)/2);
        }
    }
}