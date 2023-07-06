package writtentest;

import java.util.Arrays;

public class Arrayexample2 {
	    public static void main(String[] args) {
	        int[] nums= {-36,36};
	        int result=minimumAbsoluteDifference(nums);
	        System.out.println(result);
	    }
         public static int minimumAbsoluteDifference(int[] nums) {
	        Arrays.sort(nums);
	        int n=nums.length / 2;
	        int sum1=0;
	        int sum2=0;

	        for (int i=0;i<n;i++) {
	            sum1=sum1+nums[i];
	            sum2=sum2+ nums[i + n];
	        }
         return Math.abs(sum1 - sum2);
	    }
	

}




