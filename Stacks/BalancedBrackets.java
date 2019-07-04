import java.util.*;

public class BalancedBrackets{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Stack stack = new Stack();
        int testCases = in.nextInt();
        while(testCases>0){
            String s = in.next();
            for(int i =0; i<s.length(); i++){
                stack.push(s.charAt(i));
            }
            int count=0;
            for(int i =0 ; i<s.length()/2; i++){
                char f = stack.pop();
                System.out.println("Comparing " + s.charAt(i) + " and " +f );
                if(s.charAt(i) == f){
                    count++;
                    System.out.println("Count--> " + count);
                    if(count==(s.length()/2)){
                        System.out.println("YES");
                        break;
                    }
                }
                else{System.out.println("NO");break;}
            }
            testCases--;
        }
    }

    static class Stack{
        static final int size = 1001;
        int top;
        char[] a = new char[size];

        Stack(){
            top = -1;
        }

        boolean isEmpty(){
            return (top<0);
        }

        boolean push(char x){
            if(top>size-1){System.out.println("Stack Overflow");return false;}
            else{a[++top]=x; System.out.println("Pushed Element--> " + x + " at Index--> " + (top+1));return true;}
        }

        char pop(){
            if(top<0){System.out.println("Stack Underflow"); return '0';}
            else{char temp = a[top--];System.out.println("Deleting Element--> " +temp);return temp;}
        }

        char peek(){
            if(top<0){System.out.println("Stack Underflow");return '0';}
            else{return a[top];}
        }
    }
}