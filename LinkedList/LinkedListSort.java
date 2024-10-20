package LinkedList;

public class LinkedListSort {
	  Node1 root;//linked list uses container ship-uses has a relation

	    void create_list() {
	        root = null;//preparing with empty root
	    }

	    void insert_left(int data) {
	        Node1 n = new Node1(data);
	        if (root == null) {
	            root = n;//n becomes 1st so root
	        } else {
	            n.next = root;//1
	            root = n;//2
	        }
	        System.out.println(root.data + " inserted");

	    }

	    void delete_left() {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	            Node1 t;
	            t = root;//1
	            root = root.next;//2
	            System.out.println(t.data + " deleted");
	        }
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

	    void delete_right() {
	        if (root == null)
	            System.out.println("Empty List");
	        else {
	            Node1 t, t2;
	            t = t2 = root;//1
	            while (t.next != null) {
	                t2 = t;
	                t = t.next;
	            }
	            if (t == root)//single node
	                root = null;//reset root as only node left
	            else
	                t2.next = null;
	            System.out.println(t.data + " deleted");
	        }
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

	    void search_list(int data) {
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node1 t = root;
	            while (t != null) {
	                if (t.data == data)//match found
	                {
	                    System.out.println(t.data + " found in list");
	                    break;
	                }
	                t = t.next;
	            }
	            if (t == null)//not found
	                System.out.println(data + " not found in list");
	        }
	    }

	    void delete_element(int data)
	    {
	        if (root == null)
	            System.out.println("List Empty");
	        else
	        {
	            Node1 t, t2;
	            t2 = t = root;
	            while (t != null)
	            {
	                if (t.data == data)//match found
	                {
	                    System.out.println(t.data + " found in list");
	                    if (t == root)//case 1
	                        root = root.next;
	                    else if (t.next == null)//case 2
	                        t2.next = null;
	                    else//case 3: in between
	                        t2.next = t.next;
	                    System.out.println(t.data + " deleted");
	                    break;//stop the loop
	                }
	                t2=t;
	                t = t.next;
	            }
	            if (t == null)//not found
	                System.out.println(data + " not found in list");
	        }
	    }
	    void insert_after(int key,int new_data) {
	        Node1 n = new Node1(new_data);
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node1 t = root;
	            while (t != null) {
	                if (t.data == key)//match found
	                {
	                    System.out.println(t.data + " found in list");
	                    n.next = t.next;//1
	                    t.next = n;
	                    System.out.println(new_data + " inserted in list");
	                    break;
	                }
	                t = t.next;
	            }
	            if (t == null)//not found
	                System.out.println(key + " not found in list");

	        }
	    }
	    void insert_before(int key,int new_data) {
	        Node1 n = new Node1(new_data);
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node1 t = root;
	            Node1 t2=root;
	            while (t != null)
	            {
	                if (t.data == key)//match found
	                {
	                    if(t==root)
	                    {
	                        n.next=root;
	                        root=n;
	                        System.out.println(new_data + " inserted in list before root");
	                    }
	                    else {
	                        System.out.println(t.data + " found in list");
	                        n.next = t;//1
	                        t2.next = n;
	                        System.out.println(new_data + " inserted in list");
	                    }
	                       break;
	                }
	                t2=t;
	                t = t.next;
	            }
	            if (t == null)//not found
	                System.out.println(key + " not found in list");

	        }
	    }
	    void buble_sort(int a[]) {
			Node1 i,t,t2 = null;
			int temp=0;
			for (i = root; i.next!=null; i=i.next) {
				for (t = root; t.next!=null; t=t.next) {
					t2=t.next;
					if(t2==null)
						break;
					if (t.data > t2.data) {
						temp = t.data;
						t.data = t2.data;
						t2.data = temp;
					}
				}
			}
		}
}
