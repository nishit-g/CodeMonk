import java.util.Scanner;
import java.lang.Math.*;

public class CanYouSolveThis{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        while(testCases>0){
            int size = in.nextInt();
            int[] array = new int[size];

            int minAdd = Integer.MAX_VALUE;
            int maxAdd = Integer.MIN_VALUE;

            int minSub = Integer.MAX_VALUE;
            int maxSub = Integer.MIN_VALUE;

            for(int i = 0; i<size; i++){
                array[i] = in.nextInt();
                int add = array[i] + i;
                int sub = array[i] - i;

                if(add>maxAdd){
                    maxAdd = add;
                }
                if(add<minAdd){
                    minAdd = add;
                }
                if(sub<minSub){
                    minSub = sub;
                }
                if(sub>maxSub){
                    maxSub = sub;
                }
            }

            //System.out.println(maxAdd + " " + minAdd);
            //System.out.println(maxSub + " " + minSub);

            int result = Math.max(maxAdd-minAdd, maxSub - minSub);
            System.out.println(result);
            testCases--;
        }
    }
}