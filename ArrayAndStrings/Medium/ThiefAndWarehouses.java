import java.util.*;

public class ThiefAndWarehouses{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();

        while(testCases>0){
            
            int size = in.nextInt();
            long[] array = new long[size];
            for(int i =0; i<size; i++){
                array[i] = in.nextLong();
            }

            long max = 0;

            for(int j = 0; j<size; j++){
                long tempMax = 0;

                if(j==0){
                    max = forward(array,j,max);
                    //System.out.println("Forward Case : " + max);
                    //System.out.println("----------------------------------------");
                }
                else if(j==size-1){
                    max = backward(array, j , max);
                }
                else if(array[j]<=array[j+1] && array[j] <= array[j-1]){
                    max= mixAndJam(array,j,max);
                    //System.out.println("ForBack Case : "  + max);
                    //System.out.println("----------------------------------------");
                }
                else if(array[j]>array[j-1] && array[j] <= array[j+1]){
                    max = forward(array, j , max);
                    //System.out.println("Another Forward Case : " + max);
                    //System.out.println("----------------------------------------");
                }
                else if(array[j]<=array[j-1] && array[j] > array[j+1]){
                    max = backward(array, j, max);
                    //System.out.println("Backward Case : " + max);
                    //System.out.println("----------------------------------------");
                }
                else if(array[j]>array[j+1] && array[j]>array[j-1]){
                    tempMax = array[j];
                    if(max<tempMax){
                        max = tempMax;
                    }
                    //System.out.println("Lone Wolf Case : "  + max);
                    //System.out.println("----------------------------------------");
                }
                
            }

            System.out.println(max);

            testCases--;
        }

    }


    public static long forward(long[] a, int j, long max ){
        long count =0;
        for(int i=j; i<a.length; i++){
            if(a[i]>=a[j]){
                //System.out.println("Current status --> a[i] : " + a[i] + " a[j] : " + a[j]);
                count++;
            }
            else{
                //System.out.println("GOT Count : "  + count);
                if(max<a[j]*count){
                    max = a[j]*count;
                }
                return max;
            }
        }
        return max;
    }

    public static long backward(long[] a, int j, long max ){
        long count =0;
        for(int i=j; i>=0; i--){
            if(a[i]>=a[j]){
                //System.out.println("Current status --> a[i] : " + a[i] + " a[j] : " + a[j]);
                count++;
            }
            else{
                //System.out.println("GOT Count : "  + count);
                if(max<a[j]*count){
                    max = a[j]*count;
                }
                return max;
            }
        }
        return max;
    }

    public static long mixAndJam(long[] a, int j , long max){
        long forCount = 0;
        long backCount = 0;
        for(int fori =j; fori<a.length; fori++){
            if(a[fori]>=a[j]){
                forCount++;
            }else{
                break;
            }
        }
        
        for(int i = j; i>=0; i--){
            if(a[i]>=a[j]){
                backCount++;
            }else{
                break;
            }
        }

        //System.out.println("Forward Count ----> " +  forCount + " Backward Count ----> " + backCount);

        if(max < a[j]*(forCount+backCount -1)){
            max = a[j]*(forCount+backCount -1);
        }
        
        return max;
    }

}