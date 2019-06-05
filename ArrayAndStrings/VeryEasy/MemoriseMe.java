import java.util.Scanner;

public class MemoriseMe{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int array[] = new int[10001];

        for(int i = 0; i<totalNumber; i++){
            int temp = in.nextInt();
            array[temp]++;
        }

        int queries = in.nextInt();

        for(i = 0; i<queries; i++){
            int t = in.nextInt();
            if(array[t] !=0){
                System.out.println(array[t]);
            }else{
                System.out.println("NOT PRESENT");
            }
        }

    }
}