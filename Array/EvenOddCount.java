import java.util.*;
public class EvenOddCount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int odd_count=0;
        int even_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_count++;
            }
            else if(arr[i]%2!=0){
                odd_count++;
            }
        }
        System.out.println("Even : "+even_count);
        System.out.print("Odd : "+odd_count);
    }
}
