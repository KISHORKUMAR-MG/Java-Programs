import java.util.*;
public class LeftRotateByKTimes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        while(k>0){
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
            System.out.println();
            k--;
        }
    }
}
