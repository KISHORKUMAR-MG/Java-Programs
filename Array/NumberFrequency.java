import java.util.*;
public class NumberFrequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isfound=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isfound=true;
                    break;
                }
            }
            if(isfound==false){
                int count=0;
                for(int k=i;k<n;k++){
                    if(arr[i]==arr[k]){
                        count++;
                    }
                }
                System.out.println(arr[i]+" : "+count);
            }
        }
    }
}
