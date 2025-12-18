import java.util.*;
public class NumberFrequency
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[] = new int[n]; 
		 
		 for(int i=0;i<n;i++)
		 {
		     arr[i] = obj.nextInt();
		 }
		 
		 
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 
		 
		 for(int i=0;i<n;i++)
		 {
		     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		 }
		 
		 
		 for(Integer key:map.keySet())
		 {
		     if(map.get(key)>1)
		     System.out.println(key+" "+map.get(key));
		 }
	}
}
