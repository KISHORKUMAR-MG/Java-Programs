import java.util.*;
public class StringFrequency{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String[] s = n.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
