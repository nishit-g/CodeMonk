import java.util.*;

public class MicroAndSweet{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        while(testCases>0){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n][m];
            int sx = in.nextInt()-1;
            int sy = in.nextInt()-1;
            int ex = in.nextInt()-1;
            int ey = in.nextInt()-1;

            a[sx][sy]=1;
            while(true){
                //Right
                if(sy+1<m && a[sx][sy+1]==0){
                    //System.out.println("Starting sx---> "+sx+ " sy----> "+sy);
                    //System.out.println("Giving Right");
                    a[sx][sy+1] = 1;
                    if(sx==ex && sy==ey){
                        System.out.println("Right");
                        break;
                    }
                    sy+=1;
                    //System.out.println("Ending sx---> "+sx+ " sy----> "+sy);
                }

                //Left
                else if(sy-1>-1 && a[sx][sy-1]==0){
                    //System.out.println("Starting sx---> "+sx+ " sy----> "+sy);
                    //System.out.println("Giving Left");
                    a[sx][sy-1] = 1;
                    if(sx==ex && sy == ey){
                        System.out.println("Left");
                        break;
                    }
                    sy-=1;
                    //System.out.println("Ending sx---> "+sx+ " sy----> "+sy);
                }

                //Front
                else if(sx-1>-1 && a[sx-1][sy]==0){
                    //System.out.println("Starting sx---> "+sx+ " sy----> "+sy);
                    //System.out.println("Giving Front");
                    a[sx-1][sy] = 1;
                    if(sx==ex && sy == ey){
                        System.out.println("Front");
                        break;
                    }
                    sx-=1;
                    //System.out.println("Ending sx---> "+sx+ " sy----> "+sy);
                }

                //Back
                else if(sx+1<n && a[sx+1][sy]==0){
                    //System.out.println("Starting sx---> "+sx+ " sy----> "+sy);
                    //System.out.println("Giving Back");
                    a[sx+1][sy] = 1;
                    if(sx==ex && sy == ey){
                        System.out.println("Front");
                        break;
                    }
                    sx+=1;
                    //System.out.println("Ending sx---> "+sx+ " sy----> "+sy);
                }

                //Over
                else{
                    if(sx==ex && sy == ey){
                        System.out.println("Over");
                        break;
                    }
                    continue;
                }
            }

            testCases--;
        }
    }
}