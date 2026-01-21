import java.util.*;
class MaximumSubarray {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=currentsum+nums[i];
            if(temp<nums[i]){
                currentsum=nums[i];
            }
            else{
                currentsum=temp;
            }
            if(max<currentsum){
                max=currentsum;
            }
        }
        System.out.print(max);
    }
}
