import java.util.*;
public class RemoveDuplicates{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }
        List<String> unique=new ArrayList<>();
        for(String s:list){
            if(!unique.contains(s)){
                unique.add(s);
            }
        }
        System.out.print(unique);
    }
}
