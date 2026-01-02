import java.util.*;
public class LongestIncreasingSubsequence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int max_length=1;
        int c_length=1;
        int last_index=0;
        for(int i=1;i<n;i++){
            if(list.get(i)>list.get(i-1)){
                c_length++;
            }
            else{
                c_length=1;
            }
            if(c_length>max_length){
                max_length=c_length;
                last_index=i;
            }
        }
        ArrayList<Integer> nlist=new ArrayList<>();
        for(int i=last_index-max_length+1;i<=last_index;i++){
            nlist.add(list.get(i));
        }
        System.out.print(nlist);
    }
}
/*input 1:1  10
output 1:[10]
input2:8   1 2 3 2 4 5 6 1
output 2:[2,4,5,6]
input 3:5 5 4 3 2 1
output 3:[5]
*/
