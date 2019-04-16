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
		if (str.length() == 0) {
			return "";
		}
		// 空格数目
		int spaceNum = 0;
		// 1.第一次遍历，获取空格数目
		int length = str.length();
		final char space = ' ';

		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == space) {
				++spaceNum;
			}
		}
		int newLength = str.length() + spaceNum * 2;
		// 扩充长度
		str.setLength(newLength);
		// 定义两个"指针"
		int p1 = length - 1;
		int p2 = newLength - 1;
		while (p1 != p2) {
			char begin = str.charAt(p1);
			if (begin == space) {
				// 填充%20
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');
				p1--;
			} else {
				// 复制
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
