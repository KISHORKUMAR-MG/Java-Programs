import java.util.*;
public class SecondMaxElement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.print(smax);
    }
}
