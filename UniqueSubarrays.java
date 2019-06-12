import java.util.Scanner;
import java.lang.Math.*;

/*Need Optimization*/

public class UniqueSubarrays{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        //Detect Duplicate
        //Calculate the weight and repeat

        

        while(testCases>0){
            int size = in.nextInt();
            int[] array = new int[size];
            double[] temp = new double[1000000000];
            int count=0;
            long finalResult =0;

            for(int i =0; i<size; i++){
                array[i] = in.nextInt();
                
                if(temp[array[i]]==0){
                    count++;
                    temp[array[i]]++;
                }  
                else
                {
                    int tempResult = Count(count);
                    finalResult+=tempResult;
                    count =0;
                    tempResult =0;
                }

                if(i == size-1){
                    finalResult +=Count(count);
                } 
                    
            }
            testCases--;
            System.out.println(finalResult);
        }

    }

    public static long Count(int n){
        long tempResult =0;
        int num = n;
        
        for(int j =1; j<=num; j++,n--)
        {
            if(j==1 || j==num){
                tempResult += num;
            }
            else {
                tempResult+=n*j;
            }
        }
        return tempResult;
    }       
}