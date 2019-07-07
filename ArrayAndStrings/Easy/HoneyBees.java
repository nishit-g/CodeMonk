import java.util.*;

public class HoneyBees{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        while(testCases>0){
            int n = in.nextInt();   //rows
            int m = in.nextInt();   //columns
            int[][]a = new int[n][m];
            for(int i =0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = in.nextInt();
                }
            }

            int queries = in.nextInt();
            while(queries>0){
                int id = in.nextInt();
                int row = in.nextInt();
                int col = in.nextInt();
                int res =0;


                if(col%2==0){
                    if(id==1){
                        if(col-1>-1){
                            if(row-1>-1){res+=a[row-1][col-1];}
                            if(row>-1){res+=a[row][col-1];} 
                        }
                        if(col+1<=m-1){
                            if(row-1>-1){res+=a[row-1][col+1];}
                            if(row>-1){res+=a[row][col+1];} 
                        }
                        if(col>-1){
                            if(row+1<=n-1){res+=a[row+1][col];}
                            if(row-1>-1){res+=a[row-1][col];}
                        }
    
                        System.out.println(res);
                    }
                    else if(id==2){
                        if(col-2>-1){
                            if(row-1>-1){res+=a[row-1][col-2];}
                            if(row+1<=n-1){res+=a[row+1][col-2];}
                            res+=a[row][col-2];
                        }
                        if(col-1>-1){
                            if(row-2>-1){res+=a[row-2][col-1];}
                            if(row+1<=n-1){res+=a[row+1][col-1];}
                        }
                        if(col>-1){
                            if(row-2>-1){res+=a[row-2][col];}
                            if(row+2<=n-1){res+=a[row+2][col];}
                        }
                        if(col+2<=m-1){
                            if(row-1>-1){res+=a[row-1][col+2];}
                            if(row+1<=n-1){res+=a[row+1][col+2];}
                            res+=a[row][col+2];
                        }
                        if(col+1<=m-1){
                            if(row-2>-1){res+=a[row-2][col+1];}
                            if(row+1<=n-1){res+=a[row+1][col+1];}
                        }
                        System.out.println(res);
                    }
    
                }

                else if(col%2!=0){
                    if(id==1){
                        if(col-1>-1){
                            if(row+1<=n-1){res+=a[row+1][col-1];}
                            if(row>-1){res+=a[row][col-1];} 
                        }
                        if(col+1<=m-1){
                            if(row+1<=n-1){res+=a[row+1][col+1];}
                            if(row>-1){res+=a[row][col+1];} 
                        }
                        if(col>-1){
                            if(row+1<=n-1){res+=a[row+1][col];}
                            if(row-1>-1){res+=a[row-1][col];}
                        }
    
                        System.out.println(res);
                    }
                    else if(id==2){
                        if(col-2>-1){
                            if(row-1>-1){res+=a[row-1][col-2];}
                            if(row+1<=n-1){res+=a[row+1][col-2];}
                            res+=a[row][col-2];
                        }
                        if(col-1>-1){
                            if(row+2<=n-1){res+=a[row+2][col-1];}
                            if(row-1>-1){res+=a[row-1][col-1];}
                        }
                        if(col>-1){
                            if(row-2>-1){res+=a[row-2][col];}
                            if(row+2<=n-1){res+=a[row+2][col];}
                        }
                        if(col+2<=m-1){
                            if(row-1>-1){res+=a[row-1][col+2];}
                            if(row+1<=n-1){res+=a[row+1][col+2];}
                            res+=a[row][col+2];
                        }
                        if(col+1<=m-1){
                            if(row+2<=n-1){res+=a[row+2][col+1];}
                            if(row-1>-1){res+=a[row-1][col+1];}
                        }
                        System.out.println(res);
                    }
                }
                
                queries--;
            }

            testCases--;
        }
    }
}