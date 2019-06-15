import java.util.*;

public class Mystery{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while(q>0){
            int num = 0;
            int x = in.nextInt();
                for(int i =1; i*i<=x; i++){
                    if(x%i==0){
                        if(i*i==x){
                            num+=1;
                        }else{
                            num+=2;
                        }
                    }
                }
            System.out.println(num);
            q--;
        }
        in.close();
    }
}