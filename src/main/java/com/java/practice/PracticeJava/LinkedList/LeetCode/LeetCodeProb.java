package com.java.practice.PracticeJava.LinkedList.LeetCode;

public class LeetCodeProb {

      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode listNode= new ListNode(10);
            listNode.next=new ListNode(20);
            listNode.next.next=new ListNode(30);


            return listNode;
      }


}

class Solution{
      public static void main(String[] args) {


            ListNode listNode1= new ListNode(10);
            listNode1.next=new ListNode(20);
            listNode1.next.next=new ListNode(30);

            ListNode listNode2= new ListNode(10);
            listNode2.next=new ListNode(20);
            listNode2.next.next=new ListNode(30);

            ListNode listNode=Solution.addTwoNumbers(listNode1, listNode2);

            while (listNode !=null){
                  System.out.println(listNode.val);
                  listNode=listNode.next;
            }

      }

      public static ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
            ListNode listNode= new ListNode(0);

            while (listNode != null || listNode2 !=null){

                  //listNode.next=
            }

            return listNode;
      }
}

class ListNode {
      int val;
      ListNode next;

      ListNode(int x) {
            val = x;
      }

      @Override
      public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next.val +
                    '}';
      }
}