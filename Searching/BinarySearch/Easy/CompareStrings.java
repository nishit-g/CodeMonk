import java.util.*;
import java.lang.String;

public class CompareStrings{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int queries = in.nextInt();
        String a = in.next();
        String b = in.next();

        while(queries>0){
            int index = in.nextInt();
            char[] dis = b.toCharArray();
            dis[index-1] = '1';
            b = String.valueOf(dis);

            //System.out.println(b);
            if(b.compareTo(a)>=0){
                System.out.println("YES");
            }else{System.out.println("NO");}
            queries--;
        }
    }
}