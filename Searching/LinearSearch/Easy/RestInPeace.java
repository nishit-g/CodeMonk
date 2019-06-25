import java.util.*;

public class RestInPeace{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while(testCases>0){
            int k = in.nextInt();
            if(k%21==0){
                System.out.println("The streak lives still in our heart!");
            }else{
                String s = Integer.toString(k);
                if(s.contains("21")){
                    System.out.println("The streak is broken!");
                }else{
                    System.out.println("The streak lives still in our heart!");
                }
            }
            testCases--;
        }
    }
}