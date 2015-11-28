class Node{
	int value;
	Node next=null;
	public Node(int n){
		this.value=n;
	}
}
//1->2->3->4->5->6
//k=2  2->1->4->3->6->5
//k=3  3->2->1->6->5->4
//k=4  4->3->2->1->5->6
public class reversLink{
	public static void main(String[] args) {
		Node head=new Node(1);
		Node temp=head;
		for(int i=2;i<7;i++){
			temp.next=new Node(i);
			temp=temp.next;
		}
		// head=revLink(head);
		int [] result=revArrrayFromLink(resolveLinkToArray(head),6,4);
		head=resolveArrayToLink(result);
		while(head!=null){
			System.out.println(head.value);
			head=head.next;
		}

	}
	//翻转链表
	private static Node revLink(Node head){
		Node pre=head;
		Node cur=head.next;
		Node ne;
		pre.next=null;
		while(cur!=null){
			ne=cur.next;
			cur.next=pre;
			pre=cur;
			cur=ne;
		}
		head=pre;
		return head;
	}


	private static void reversArray(int [] array,int from,int to){
		while(from<to){
			int temp=array[from];
			array[from++]=array[to];
			array[to--]=temp;
		}
	}

	private static int [] revArrrayFromLink(int [] array,int n,int k){
		int t=n/k;//取区间值
		int i=1;
		while(i<=t){
			reversArray(array,k*(i-1),i*k-1);
			i++;
		}
		return array;
	}

	private static int [] resolveLinkToArray(Node head){
		int [] array=new int[6];
		int index=0;
		while(head!=null){
			array[index++]=head.value;
			head=head.next;
		}		
		return array;
	}

	private static Node resolveArrayToLink(int [] array){
		Node head=new Node(array[0]);
		Node temp=head;
		for(int i=1;i<array.length;i++){
			temp.next=new Node(array[i]);
			temp=temp.next;
		}
		return head;
	}

}