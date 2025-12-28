import java.util.*;
public class MoveAllZeroToEnd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ind=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[ind]=arr[i];
                ind++;
            }
        }
        for(int i=0;i<ind;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=ind;i<n;i++){
            arr[i]=0;
            System.out.print(arr[i]+" ");
        }
    }
}
