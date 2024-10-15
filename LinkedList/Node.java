package LinkedList;

public class Node {
	int data;
    Node next;//self ref:ref refering to own type
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
