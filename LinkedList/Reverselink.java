package LinkedList;

public class Reverselink {
	Node1 root;
	Stack_class obj;

	void create_list() {
	root = null;//preparing with empty roo 
	}
	void reverse()
	{
	int length=0;
	if (root == null)
	System.out.println("List Empty");
	else{

	Node1 t = root;
	while (t != null) {
	length++;
	t = t.next;
	}
	//create stack of size of length //read all elements and push on stack //traverse again linked list to write back the data on linked list 
	}

	}

	void insert(int data) {
	Node1 n = new Node1(data);
	if (root == null)
	root = n;//n becomes 1st so root= else 
	{
	Node1 t = root;
	while (t.next != null) {
	t = t.next;
	}
	t.next = n;
	}
	System.out.println(data + " inserted");

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

	public static void main(String args[]) 
	{
	Reverselink list1 = new Reverselink();
	list1.create_list();
	list1.insert(10);
	list1.insert(15);
	list1.insert(20);
	list1.insert(25);
	System.out.println("List Has");
	list1.print_list();
	
}
}
