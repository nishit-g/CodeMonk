/* Explanation : Use FastReader method to avoid TLE 
                 A binary number is ODD if last digit is 1
                 A binary number is EVEN if last digit is 0 */


import java.util.Scanner;
import java.lang.Math;

public class BinaryQueries{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        int queries = in.nextInt();
        int[] array = new int[numbers];

        for(int i =0; i<numbers; i++){
            array[i] = in.nextInt();
        }
        
        for(int j=0; j<queries; j++){
            int id = in.nextInt();
            if(id == 1){
                int pos = in.nextInt();
                array[pos-1] ^=1;
            }
            else if(id == 0){
                int l = in.nextInt();
                int r = in.nextInt();
                if(array[r-1]==0){
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
            }
        }
        in.close();
    }
}