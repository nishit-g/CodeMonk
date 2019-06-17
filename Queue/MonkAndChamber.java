import java.util.*;

public class MonkAndChamber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        Queue<Integer> q = new ArrayDeque<Integer>();
        int[]arr = new int[100005];


        for(int i =0; i<n; i++){
            //For powers
            arr[i] = in.nextInt();
            //Spider's index
            q.add(i);
        }
        int k=0;
        while(k<x){
            int maxPower=-1; 
            int maxIndex =0;
            int[] next = new int[x+1];
            int size = q.size();

            for(int i =0; i<Math.min(x,size); i++){
                next[i] = q.peek();
                q.remove();
                if(arr[next[i]] > maxPower){
                    maxPower = arr[next[i]];
                    maxIndex = next[i];
                }
            }
            System.out.print((maxIndex+1)+" ");
            for(int i =0; i<Math.min(x, size); i++){
                if(next[i]==maxIndex){continue;}
                else{
                    if(arr[next[i]]!=0){arr[next[i]]--;}
                    q.add(next[i]);
                }
            }

            k++;
        }
        in.close();

    }
}