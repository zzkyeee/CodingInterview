package com.zzk;

/**
 * @Description: 二维数组中的查找
 * @author: zhangzhikai
 * @date: 2019/4/15 下午9:01
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Ex04 {


	/**
	 * 在一个二维数组中（每个一维数组的长度相同），
	 * 每一行都按照从左到右递增的顺序排序，
	 * 每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 */
	public static boolean Find(int target, int [][] array) {
		int height = array.length;
		int width = array[0].length;
		// 横坐标
		int i = 0;
		// 纵坐标
		int j = width - 1;
		while (i < height && j >= 0) {
			if (target == array[i][j]) {
				return true;
			} else if (target < array[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] array = {{1, 2, 8, 9}, {4, 7, 10, 13}};
		System.out.println(Find(7, array));
	}
}
