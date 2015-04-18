package test;

public class hasLoop {
	class Node{
		int data;
		Node next;
	}
	//判断是否有环
	boolean isLoop(Node head){
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				break;
			}
		}
		if(fast==null || fast.next==null){
			return false;
		}else{
			return true;
		}
	}
}
