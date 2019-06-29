import java.util.*;

public class GoldenRectangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count =0;
        while(num>0){

            double l = in.nextDouble();
            double b = in.nextDouble();
            double ration = l/b;
            if(ration<=1.7 && ration>=1.6){
                count++;
            }
            num--;
        }
        
        System.out.println(count);
    }
}