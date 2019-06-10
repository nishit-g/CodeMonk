import java.util.*;

public class RoyAndSymmetricLogos{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        while(testCases>0){
            int size = in.nextInt();
            int[][] a = new int[size][size];    //int a[row_index][col_index]

            for(int i =0; i<size; i++){     //row
                String s = in.next();
                for(int j=0; j<size; j++){  //column
                    a[i][j] = s.charAt(j);
                }
            }
            boolean x = xaxis(a,size);
            boolean y = yaxis(a,size);
            if(x==true && y == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            testCases--;
        }
    }

    static boolean xaxis(int[][]a, int size){
        boolean res = false;

        for(int i =0; i<size/2; i++){
            for(int j =0; j<size; j++){
                //System.out.println("X-axis");
                //System.out.println("Checking for ---->" + a[i][j] + " and : " + a[size-1-i][j]);
                if(a[i][j]!=a[size-1-i][j]){
                    return false;
                }else{
                    if(j==size-1 && i == (size/2)-1){
                        //System.out.println("Didn't see that coming.");
                        return true;}
                }
            }
        }

        //System.out.println("OVER");
        return res;
    }

    static boolean yaxis(int[][]a, int size){

        boolean res = false;

        for(int j =0; j<size/2; j++){
            for(int i =0; i<size; i++){
                //System.out.println("Y-axis");
                //System.out.println("Checking for ---->" + a[i][j] + " and : " + a[size-1-i][j]);
                if(a[i][j]!=a[i][size-1-j]){
                    return false;
                }else{
                    if(i==size-1 && j==(size/2)-1){
                        //System.out.println("Didn't see that coming.");
                        return true;}
                }
            }
        }

        //System.out.println("OVER-y");
        return res;

    }
}