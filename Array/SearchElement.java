import java.util.*;
public class SearchElement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                index=i;
                break;
            }
        }
        System.out.print(index);
    }
}
