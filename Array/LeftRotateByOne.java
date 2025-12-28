import java.util.*;
public class LeftRotateByOne{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ind=0;
        int end=arr[0];
        for(int i=1;i<n;i++){
            arr[ind]=arr[i];
            ind++;
        }
        arr[n-1]=end;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
