
import java.util.*;
class Solution {
    public static  void runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=nums[i];
            }
            else{
            nums[i]+=nums[i-1];
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int x:nums){
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());
        
    }

public static void main(String args[]) throws Exception{

int nums[]={1,2,3,4,5};
System.out.println(Arrays.toString(nums));
runningSum(nums);
}
}