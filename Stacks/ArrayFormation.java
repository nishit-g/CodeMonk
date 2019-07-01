import java.util.*;

public class ArrayFormation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] prime = new int[size];
        Stack s = new Stack();
        int j =0;
        for(int i =0; i<size; i++){
            int x = in.nextInt();
            if(isPrime(x)){
                prime[j]=x;
                j++;
            }else{
                s.push(x);
            }
        }

        for(int i =0; i<j; i++){
            System.out.print(prime[i] + " ");
        }
        System.out.println("");
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    static boolean isPrime(int x){
        if(x<=1){return false;}
        if(x<=3){return true;}
        if(x%2==0 || x%3==0){return false;}
        for(int i=5; i*i<=x; i+=6){
            if(x%i==0 || x%(i+2)==0){return false;}
        }
        return true;
    }

    static class Stack{
        final int sf = 10000001;
        int[] a = new int[sf];
        int top;

        Stack(){
            top=-1;
        }

        boolean isEmpty(){
            return (top<0);
        }

        boolean push(int x ){
            if(top>sf-1){System.out.println("Stack Overflow"); return false;}
            else{
                int i = ++top;
                a[i] = x;
                //System.out.println("Pushed Element--> " + x + " at index--> " + i);
                return true;
            }
        }

        int pop(){
            if(top==-1){System.out.println("Stack Underflow"); return 0;}
            else{
            int i1 = top--;
            int temp = a[i1];
            //System.out.println("Popped Element--> " + temp + " from index--> " + i1); 
            return temp;
            }
        }

        int peek(){
            if(top<0){System.out.println("Stack Underflow");
            return -1;}
            else{return a[top];}
        }
    }
}