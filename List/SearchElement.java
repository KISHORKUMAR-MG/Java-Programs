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
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        boolean found=false;
        int index=0;
        for(int i=0;i<list.size();i++){
            if(target==list.get(i)){
                found=true;
                index=i;
            }
        }
        if(found==true){
            System.out.print("Founded at "+index);
        }
        else{
            System.out.print("Not Founded");
        }
    }
}
