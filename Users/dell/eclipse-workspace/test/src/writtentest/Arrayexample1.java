package writtentest;

import java.util.Arrays;

public class Arrayexample1 {
	    public static void main(String[] args) {
	        int[] nums={3,9,7,3};
	        int n=nums.length / 2;
	        int minDiff=Integer.MAX_VALUE;
	        for (int i=0;i<=n;i++) {
	         int diff = Math.abs(Arrays.stream(nums,i,i + n).sum()-Arrays.stream(nums,i + n,nums.length).sum()); 
	            minDiff=Math.min(minDiff,diff);
	        }
	        
	        System.out.println(minDiff);
	    }
		

	

}
