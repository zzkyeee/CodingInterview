package com.zzk;

/**
 * @Description: 替换空格
 * @author: zhangzhikai
 * @date: 2019/4/16 下午11:10
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Ex05 {

	/**
	 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
	 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	 */
	public static String replaceSpace(StringBuffer str) {
		/**
		 * 先获取空格数扩充字符串，然后考虑通过从后往前遍历，时间复杂度为o(n)，若从前往后则需要o(n^2)
		 */
		if (str.length() == 0) {
			return "";
		}
		// 字符串中的空格数目
		int spaceNum = 0;
		// 1.第一次遍历，获取空格数目
		int length = str.length();
		final char space = ' ';

		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == space) {
				++spaceNum;
			}
		}
		// 2.扩充长度，因为要填充%20，减去已存在的一个空格长度，则每个空格数需要多两个空格位
		int newLength = str.length() + spaceNum * 2;
		str.setLength(newLength);
		int p1 = length - 1;
		int p2 = newLength - 1;
		while (p1 != p2) {
			char begin = str.charAt(p1);
			// 3.1 若p1对应的字符为空格，则p2所对应的下标开始填充%20
			if (begin == space) {
				// 填充%20
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');
				p1--;
			} else {
				// 3.2 不是空格则直接复制
				str.setCharAt(p1--, space);
				str.setCharAt(p2--, begin);
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(replaceSpace(new StringBuffer("We Are Happy.")));
	}

}
