import java.util.*;

public class SuperReducedString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s = in.next();
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            s1.push(s.charAt(i));
        }
        char c1, c2;
        while(!s1.empty()){
            c1 = s1.pop();
            if(s1.empty()){s2.push(c1);break;}
            else {
                c2 = s1.pop();
            }

            if(c1==c2){continue;}
            else{
                s2.push(c1);
                s1.push(c2);
            }
        }

        String res = "";
        while(!s2.empty()){
            res +=s2.pop();
        }
        if(res=""){System.out.println("Empty String");}
        else{
            System.out.println(res);
        }
    }
}