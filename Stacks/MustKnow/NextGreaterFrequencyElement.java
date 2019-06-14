import java.util.*;

public class NextGreaterFrequencyElement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while(testCases>0){
            int size = in.nextInt();
            int[] a = new int[size];
            int max = Integer.MIN_VALUE;
            for(int i =0; i<size; i++){
                a[i]=in.nextInt();
                if(max<a[i]){max=a[i];}
            }
            int[] freq = new int[max+1];
            for(int i =0; i<size; i++){
                freq[a[i]]++;
            }
            int[] rs = new int[size];
            rs = NextGreaterFrequency(a,freq);
            for(int i =0; i<size; i++){System.out.print(rs[i] + " ");}
            testCases--;
        }
        
    }

    static int[] NextGreaterFrequency(int[] a, int[] freq){
        int len = a.length;
        Stack<Integer> s = new Stack<Integer>();
        int[] res = new int[len];
        s.push(0);
        for(int i =1; i<len;i++){
            if(freq[a[s.peek()]] > freq[a[i]]){
                s.push(i);
            }
            else{
                while(freq[a[s.peek()]]<freq[a[i]] && s.size()>0){
                    res[s.peek()]  = a[i];
                    s.pop();
                }
                s.push(i);
            }
        }

        while(s.size()>0){
            res[s.peek()] = -1;
            s.pop();
        }

        return res;
    }
}