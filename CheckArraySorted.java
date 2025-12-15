import java.util.*;
public class SortingArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                found=false;
                break;
            }
        }
        if(found==true){
            System.out.print("sorted");
        }
        else{
            System.out.print("not sorted");
        }
    }
}
