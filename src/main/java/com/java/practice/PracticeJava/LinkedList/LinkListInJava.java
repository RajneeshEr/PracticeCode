package com.java.practice.PracticeJava.LinkedList;



class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

class Test{

    public static void main(String[] args) {
        LinkListInJava list=new LinkListInJava();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(50);
        list.append(60);

        LinkListInJava list1=new LinkListInJava();
        list1.append(70);
        list1.append(20);
        list1.append(30);
        list1.append(50);
        list1.append(60);

        Node reverseNode = list.reverseAdjucentNode(list);
        System.out.println(reverseNode);

        //list.appendAfterTheParticularNode(list.head,50,400);
    }
}


public class LinkListInJava {
    private int count;
    Node head;
    public LinkListInJava() {
        this.head = null;
        this.count = 0;
    }
    public LinkListInJava(Node head) {
        this.head = head;
        this.count=1;
    }

    public Node append(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            this.head = newNode;
            return this.head;
        }

        Node last = this.head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        return this.head;
    }

    public Node reverseAdjucentNode(LinkListInJava list){

        Node temp =list.head;
        int coun = 0;
        while (temp !=null && temp.next !=null){
            coun++;
            if (coun % 2 != 0){
                int k=temp.data;
                temp.data=temp.next.data;
                temp.next.data=k;
            }
            temp=temp.next;
        }

        return list.head;
    }

    public void appendAfterTheParticularNode(Node head, int givenNodeData, int newNodeData){
        Node currentNode=head;
        boolean flag = false;

        while (currentNode != null){
            if(currentNode.data == givenNodeData){
                flag=true;
                Node nodeAddAfter = currentNode.next;
                currentNode.next = new Node(newNodeData);
                Node newNode=currentNode.next;
                newNode.next = nodeAddAfter;
                this.count+=1;
                return;
            }else {
                head=head.next;
                currentNode=head;
            }
        }
        if (!flag){
            System.out.println("Data is not found in list : "+givenNodeData);
        }
    }
}