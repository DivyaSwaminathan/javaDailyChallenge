package daily.codingExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class MajorityElementArray {

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		/*find the number of occurances for each element
		 * get the value and compare with max value 
		 * when value is greater than existing max , replace with current value 
		 */
	Map<Integer,Integer> myMap=new HashMap<Integer,Integer>();
	
	for(int i=0;i<nums.length;i++) {
		if(myMap.containsKey(nums[i])){
			myMap.put(nums[i], myMap.get(nums[i]) +1);
		}
		else {
			myMap.put(nums[i], 1);
			
		}
	}
int maxOccur=1;
int maxOccurInteger=0;
for (Entry<Integer,Integer> et: myMap.entrySet()) {
	if(et.getValue() > maxOccur)
	{
		maxOccur=et.getValue();
		maxOccurInteger=et.getKey();
	}
}

System.out.println(maxOccurInteger);
	}
}





/*
Java Problem (6/20)

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/