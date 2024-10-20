package LinkedList;

import java.util.Scanner;

public class queuetobindec {

	public static void main(String args[]) {
		Queue_Class q=new Queue_Class();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bits data");
		int size=sc.nextInt();
		q.create_Queue(size);
		
		for (int i = 0; i < size; i++) {
			q.Enqueue(sc.nextInt());
		}
		int sum=0;
		while(size!=0)
		{
			sum=sum+
		}
	}
}
