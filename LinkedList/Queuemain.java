package LinkedList;

import java.util.Scanner;


public class Queuemain {
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		 	DynamicDequeue d=new DynamicDequeue();
		 	d.create_Queue();
		 	
		 	int ch,e;
	        do {
	        	System.out.println("\n1.Insert\n2.Dequeue\n3.print queue");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter element:");
    				e = sc.nextInt();
					d.Enqueue(e);;
					break;
				case 2:
					
					d.Dequeue();
					break;
				case 3:
					d.print_queue();
					break;
				default:
					break;
				}
			} while (ch!=0);
	}
}
