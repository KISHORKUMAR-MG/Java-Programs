import java.util.*;
public class SortedList{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        boolean isSorted=true;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                isSorted=false;
                break;
            }
        }
        if(!isSorted){
            System.out.print("Not sorted");
        }
        else{
            System.out.print("Sorted");
        }
    }
}
