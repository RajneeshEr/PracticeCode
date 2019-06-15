package com.java.practice.PracticeJava.LinkedList;

class Test{

    public static void main(String[] args) {

        LinkListInJava list=new LinkListInJava();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(50);

        /*Print the list through while loop*/
       /* while (list.head != null){
            System.out.println("List : "+ list.head.data);
            list.head=list.head.next;
        }*/

       /*Append value after some value, */
        list.appendAfterTheParticularNode(list.head,90,400);

        while (list.head != null){
            System.out.println("List After adding : "+ list.head.data);
            list.head=list.head.getNext();
        }


    }
}

/*Basic structure of Linked List
* Node contain data and every new data itself a node
* */
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


/*Linked List Property
*
* */
public class LinkListInJava {
    private int count;
    Node head;

    // constructors
    public LinkListInJava() {
        this.head = null;
        this.count = 0;
    }

    public LinkListInJava(Node head) {
        this.head = head;
        this.count=1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void append(int data){
        Node current=this.head;
        if(this.head == null){
            this.head =new Node(data);
            count+=1;
            return;
        }
        while (current.getNext() != null){
            current=current.getNext();
        }
        current.setNext(new Node(data));
        count+=1;
    }

    public void appendAfterTheParticularNode(Node head, int givenNodeData, int newNodeData){
        Node currentNode=head;

        boolean flag = false;
        while (currentNode != null){
            if(currentNode.data == givenNodeData){
                flag=true;
                Node nodeAddAfter = currentNode.next;
                currentNode.next = new Node(newNodeData);
                Node newNode=currentNode.getNext();
                newNode.next = nodeAddAfter;
                this.count+=1;
                return;
            }else {
                head=head.getNext();
                currentNode=head;
            }
        }
        if (!flag){
            System.out.println("Data is not found in list : "+givenNodeData);
        }
    }
}