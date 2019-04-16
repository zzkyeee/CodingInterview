package com.zzk;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description: 从尾到头打印链表
 * @author: zhangzhikai
 * @date: 2019/4/17 上午12:08
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Ex06 {

	static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
	 */
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		// 方法1 通过栈保存，若只需要打印亦可利用递归，但是如果函数调用层级很深，可能出现StackOverflowError
		if (null == listNode) {
			return new ArrayList<Integer>();
		}
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;

		System.out.println(printListFromTailToHead(node1));
	}
}
