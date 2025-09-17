import java.util.*;
public class CharacterFoundOrNot {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            String str=sc.nextLine();
            char target=sc.next().charAt(0);
            System.out.print(linearsearch(str,target));
        }
    }
    static boolean linearsearch(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
