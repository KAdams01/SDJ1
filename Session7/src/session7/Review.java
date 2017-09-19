package session7;

import java.util.ArrayList;

public class Review {

	public static void main(String[] args) {
		int[] nums=new int[25];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i<25;i++)
		{
			nums[i]=((i+1)*2);
			list.add(new Integer(nums[i]));
			System.out.print(list.get(i)+" ");
		}
		System.out.println("");
		printWithEnhanced(nums);
	}

	private static void printWithEnhanced(int[] nums) {
		for(int i : nums)
		{
			System.out.print(i + " ");
		}
	}
}