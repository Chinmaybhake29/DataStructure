package LinkedList;

import java.lang.reflect.Array;

public class LinkedListmerge {
	Node1 root;
	void create_list() {
        root = null;//preparing with empty root
    }
	void insert_right(int data) {
        Node1 n = new Node1(data);
        if (root == null)
            root = n;//n becomes 1st so root=
        else {
            Node1 t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
        System.out.println(root.data + " inserted");

    }
	 void print_list() {
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node1 t = root;
	            while (t != null) {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }
	        }
	   }
	  static LinkedListmerge merge(Node1 r1, Node1 r2) {
		  Node1 i,j;
		  LinkedListmerge obj3=new LinkedListmerge();
		  obj3.create_list();
		  i=r1;
		  j=r2;

		   while(i!=null && j!=null)
		  {
		  if(i.data<j.data) {
		  obj3.insert_right(i.data);
		  i=i.next;
		  }
		  else
		  {
		  obj3.insert_right(j.data);
		  j=j.next;
		  }

		  }
		  while(i!=null)
		  {
		  obj3.insert_right(i.data);
		  i=i.next;
		  }
		  while(j!=null) {
		  obj3.insert_right(j.data);
		  j = j.next;
		  }
		  return obj3;
	 }
	 	public static void main(String args[]) {
	 		LinkedListmerge l=new LinkedListmerge();
	 		l.create_list();
	 	
	 		l.insert_right(10);
	 		l.insert_right(20);
	 		l.insert_right(30);
	 		l.insert_right(40);
	 		l.insert_right(66);
	 		
	 		LinkedListmerge l2=new LinkedListmerge();
	 		l2.create_list();
	 		l2.insert_right(34);
	 		l2.insert_right(26);
	 		l2.insert_right(56);
	 		l2.insert_right(67);
	 		l2.insert_right(31);
	 		
	 		System.out.println("Sorted List 1");
	 		l.print_list();
	 		
	 		System.out.println("\n Sorted List 2");
	 		l2.print_list();
	 		
	 		LinkedListmerge l3=new LinkedListmerge();
	 		l3=merge(l.root, l2.root);
	 		l3.print_list();
	 		
	 	}

}
