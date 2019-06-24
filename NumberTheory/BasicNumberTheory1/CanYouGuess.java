import java.util.*;

public class CanYouGuess{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while(q>0){
            int sum =1;
            int a = in.nextInt();
            if(a==1){
                sum =0;
            }
            else{
                for(int i = 2; i*i<=a; i++){
                    if(a%i==0){
                        sum+=(i*i==a?i:(i + a/i));
                    }
                }
            }
            System.out.println(sum);
            q--;
        }
        in.close();
    }
}