/*
    Partially accepted.
    Solved using only arrays.
    Need to reduce time complexity.
*/  

import java.util.*;

public class TheAmazingRace{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while(testCases>0){
            
            int size = in.nextInt();
            int[] a = new int[size];
            for(int i =0; i<size; i++){
                a[i] = in.nextInt();
            }

            int max=0;
            int maxIndex = 0;
            int[] sight = new int[size];

            for(int i = 0 ; i<a.length; i++){
                if(i==0){
                    sight[i] = forward(a,i);
                }
                else if(i== a.length-1){
                    sight[i] = backward(a,i);
                }
                else {
                    int forwardSight = forward(a,i);
                    int backwardSight = backward(a,i);
                    sight[i] = forwardSight+backwardSight;    
                }
            }
            // for(int i =0; i<size; i++){
            //     System.out.print(sight[i]+" ");
            // }
            
            for(int i =0; i<sight.length; i++){
                if(max<sight[i]){
                    max = sight[i];
                    maxIndex = i;
                }
            }
            maxIndex++;
            // System.out.println(" ");
            // System.out.println("Maximum sight is : " + max +" having and index of : " + maxIndex);
            System.out.println(maxIndex);
            testCases--;
        }
    }

    public static int forward(int[] a, int j){
        int count =0;
        int sight = 0;
        for(int i = j+1; i<a.length; i++){
            if(a[j]>a[i]){
                count++;
            }
            else if(a[j] == a[i]){
                sight = (count+1)*(j+1);
                return sight;
            }
            else{
                count++;
                sight = count*(j+1);
                return sight;
            }
            //System.out.println("Current value of Count : " + count + " for index  : " + j );
        }
        return (count)*(j+1);
    }

    public static int backward(int[] a, int j){
        int count =0;
        int sight = 0;
        for(int i = j-1; i>=0; i--){
            if(a[j]>a[i]){
                count++;
            }
            else if(a[j] == a[i]){
                sight = (count+1)*(j+1);
                return sight;
            }
            else{
                sight = (count+1)*(j+1);
                return sight;
            }
        }
        return (count)*(j+1);
    }
}