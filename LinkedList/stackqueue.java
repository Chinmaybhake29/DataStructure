package LinkedList;

public class stackqueue {
	private Stack_class s1;
	private Stack_class s2;
	
	public stackqueue(int data) {
		s1=new Stack_class();
		s2=new Stack_class();
		s1.create_Stack(data);
		s2.create_Stack(data);
	}
	public void Equeuefull(int e) {
		if(s1.is_Full()) {
			System.out.println("is full");
			return;
		}
		s1.push(e);
		System.out.println(e);
	}
	public int dequeue(int e1) {
		if(s1.is_Empty() && s2.is_Empty()) {
			System.out.println("is empty");
			return 0;
		}
		if(s2.is_Empty()) {
			while(!s1.is_Empty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public void print_list(int e) {
		if (s1.is_Empty() && s2.is_Empty()) {
            System.out.println("Queue is Empty!");
            return;
        }
		if(!s2.is_Empty()) {
			s2.print_Stack();
		}
		if(!s1.is_Empty()) {
			Stack_class s=new Stack_class();
			s.create_Stack(e);
		}
	}

    
}
