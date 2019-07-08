import java.util.*;

public class GridAndPhrase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        char[][]a = new char[n][m];

        for(int i =0; i<n; i++){
            String s = in.next();
            for(int j =0; j<m; j++){
                a[i][j] = s.charAt(j);
            }
        }
        int count =0;
        for(int i =0; i<n;i++){
            for(int j =0; j<m; j++){
                if(a[i][j]=='s'){
                    //Horizontal
                    if(j+3<=m-1){
                        while(true){
                            //System.out.println("Working at the Horizontal");
                            if(a[i][j+1]=='a'&&a[i][j+2]=='b'&&a[i][j+3]=='a'){
                                count++;
                                //System.out.println("Count--->" + count);
                                break;
                            }else{
                                break;
                            }
                        }
                    }

                    //Vertical
                    if(i+3<=n-1){
                        //System.out.println("Working at the Vertical");
                        while(true){
                            if(a[i+1][j]=='a'&&a[i+2][j]=='b'&&a[i+3][j]=='a'){
                                count++;
                                //System.out.println("Count--->" + count);
                                break;
                            }else{
                                break;
                            }
                        }
                    }

                    
                    //S-E diagonal
                    if(j+3<=m-1 && i+3<=n-1){
                        while(true){
                            //System.out.println("Working at the SE Diagonal");
                            if(a[i+1][j+1]=='a'&&a[i+2][j+2]=='b'&&a[i+3][j+3]=='a'){
                                count++;
                                //System.out.println("Count--->" + count);
                                break;
                            }else{
                               break;
                            }
                        }
                    }


                    //N-E diagonal
                    if(j+3<=m-1 && i-3>-1){
                        while(true){
                            //System.out.println("Working at the NE Diagonal");
                            if(a[i-1][j+1]=='a'&&a[i-2][j+2]=='b'&&a[i-3][j+3]=='a'){
                                count++;
                                //System.out.println("Count--->" + count);
                                break;
                        }else{
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}