import java.util.*;

public class AddAlternate{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int[][] a = new int[3][3];
        int sum1=0,sum2=0;
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                a[i][j] = in.nextInt();
                if((i+j)%2==0){
                    sum1 +=a[i][j]; 
                }else {
                    sum2 +=a[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        
    }
    
}