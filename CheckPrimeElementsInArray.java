import java.util.*;
public class CheckPrimeElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                boolean isfound=true;
                int num=arr[i][j];
                if(num<=1){
                    isfound=false;
                }
                else{
                    for(int k=2;k<=num/2;k++){
                        if(num%k==0){
                            isfound=false;
                            break;
                        }
                    }
                }
                if(isfound){
                    System.out.println("Element at ("+i+", "+j+") is a prime number.");
                }
            }
        }
        sc.close();
    }
}
