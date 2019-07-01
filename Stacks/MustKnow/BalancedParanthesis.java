import java.util.*;

public class BalancedParanthesis{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while(testCases>0){
            String e = in.next();
        boolean ans = false;
        Stack<Character> s = new Stack<Character>();

        for(int i=0; i<e.length(); i++){
            char c = e.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                s.push(c);
            }
            if(c=='}' || c==']' || c==')'){
                if(s.empty()){
                    ans = false;
                }

                else {
                    char p = s.pop();
                    if(p=='{' && c=='}'){ ans = true;}
                    else if(p=='[' && c==']'){ans = true;}
                    else if(p=='(' && c==')'){ans = true;}
                    else {ans = false;}
                }
            }   
        }

        if(s.empty() && ans){System.out.println("Balanced");}
        else{System.out.println("Not Balanced");}
        testCases--;
        }
        
    }
}