package com.qa.oddity;


import java.util.ArrayList;
import java.util.List;

public class Oddity {
	public List<Integer> oddity(int[] nums) {
		List<Integer> numList = new ArrayList<Integer>();
		for (int i =0; i<nums.length;i++) {
			if(nums[i]%2!=0) {
				numList.add(nums[i]);
			}
		}
		return numList;
		
		
		
		

	}

}
