package com.zzk;

/**
 * @Description: 数组中重复的数字
 * @author: zhangzhikai
 * @date: 2019/4/15 下午12:56
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Ex03 {

	/**
	 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
	 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
	 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
	 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
	 */
	public boolean duplicate(int numbers[], int length, int [] duplication) {
		/**
		 * 思路是将数组重排，将数字放到对应下标中，如果相同则为重复，如果不相同，则继续遍历。
		 */
		for (int i = 0; i < length; i++) {
			// 当前所指向的数字
			int index = numbers[i];
			if (index == i) {
				continue;
			}
			if (index == numbers[index]) {
				duplication[0] = index;
				return true;
			}
			// 交换
			swap(numbers, index, i);
		}
		return false;
	}

	/**
	 * 交换数组两个下标的值
	 */
	public void swap(int [] numbers, int from, int to) {
		int temp = numbers[from];
		numbers[from] = numbers[to];
		numbers[to] = temp;
	}

}
