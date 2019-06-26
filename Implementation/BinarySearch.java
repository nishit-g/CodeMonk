import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Enter your elements");
        for(int i =0; i<size; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = in.nextInt();
        int pos = binarySearch(a,x);
        System.out.println("Your element was found at position---> " + pos);
    }

    public static int binarySearch(int[] a, int x){
        int left = 0;
        int right = a.length-1;

        while(left<=right){
            int mid = left + (right - left)/2;
            System.out.println("Left---> " + left +" Mid---> " + mid + " Right---> " + right);
            if(x == a[mid]){
                return mid;
            }
            if (x<a[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}