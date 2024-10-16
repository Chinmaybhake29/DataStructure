package LinkedList;

public class circular {
	Node root, last;//linked list uses container ship-uses has a relation

    void create_list() {
        root = last = null;//preparing with empty root
    }

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;//n becomes 1st so root
            last.next=root;
        } else {
            n.next = root;//1
            root = n;//2
            last.next=root;
        }
        System.out.println(root.data + " inserted");

    }

    void delete_left() {
        if (root == null) {
            System.out.println("Empty List");
        }
        else {
            Node t;
            t = root;//1
            if(root==last)//single node
                root=last=null;
            else
            {
                root = root.next;//2
                last.next=root;//3
            }
            System.out.println(t.data + " deleted");
        }
    }
    void insert_right(int data) {
    	   Node n = new Node(data);
           if (root == null)
           {
               root = last=n;//n becomes 1st so root
               last.next=root;
           }
           else
           {
               last.next=n;//1
               last=n;//2
               last.next=root;//3

           }
           System.out.println(data + " inserted");

    }

    void delete_right() {
    	if (root == null)
            System.out.println("Empty List");
        else {
            Node t, t2;
            t = t2 = root;//1
            if(root==last)
                root=last=null;
            else
            {
                while (t != last) //2
                {
                    t2 = t;
                    t = t.next;
                }
                last=t2;//3
                last.next=root;//4
            }
            System.out.println(t.data + " deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            do{
                System.out.print("|" + t.data + "|->");
                t = t.next;
            } while (t != root);
        }
    }

    void search_list(int data) {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
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
            Node t, t2;
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
        Node n = new Node(new_data);
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
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
        Node n = new Node(new_data);
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            Node t2=root;
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
}
