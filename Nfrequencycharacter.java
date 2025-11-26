import java.util.*;
public class Nfrequencycharacter{
	public static void main(String[] args) {
	    try(Scanner sc=new Scanner(System.in)){
	    String s=sc.nextLine();
	    int n=sc.nextInt();
	    for(int i=0;i<s.length();i++){
	        
	        char c=s.charAt(i);
	        boolean found=false;
	        for(int k=0;k<i;k++){
	            if(s.charAt(k)==c){
	                found=true;
	                break;
	            }
	        }
	        if(found==true) continue;
	        int count=0;
	        for(int j=0;j<s.length();j++){
	            if(c==s.charAt(j)){
	                count++;
	            }
	        }
	        if(count==n){
	            System.out.print(c+" ");
	        }
	    }
    }
	}
}
/*input: kishorkumar  2
output: k r
*/
