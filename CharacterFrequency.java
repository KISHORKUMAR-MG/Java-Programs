import java.util.*;
public class CharacterFrequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            if(map.get(key)%2!=0)
            System.out.println(key+" "+map.get(key));
        }
    }
}
