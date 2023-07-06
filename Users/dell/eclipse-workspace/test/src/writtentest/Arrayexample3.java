package writtentest;

public class Arrayexample3 {
	    public static int minimumAbsoluteDifference(int[] nums) {
	        int n=nums.length / 2;
	        int minDiff=Integer.MAX_VALUE;
	        int[] partition=new int[n];
	        for (int i=0;i<(1<<nums.length);i++) {
	            int sum1=0;
	            int sum2=0;
	            int size=0;
	            for (int j=0;j<nums.length;j++) {
	                if ((i&(1 << j))!= 0) {
	                    if (size<n) {
	                        sum1=sum1+nums[j];
	                    } else {
	                        sum2=sum2+nums[j];
	                    }
	                    size++;
	                }
	            }
	            int diff=Math.abs(sum1 - sum2);
	            minDiff=Math.min(minDiff, diff);
	        }

	        return minDiff;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {2,-1,0,4,-2,-9};
	        int minDiff = minimumAbsoluteDifference(nums);
	        System.out.println(minDiff);
	    }
	
}
