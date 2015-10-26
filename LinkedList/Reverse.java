public class Reverse {

	public static void main(String[] args) {
		LinkedList abc = new LinkedList();
		abc.append(1);
		abc.append(2);
		abc.append(3);
		abc.append(4);
		System.out.println(abc);
		reverse(abc);
		System.out.println(abc);
		System.out.println(reverseRecursive(abc).value);
	}

	public static void reverse(LinkedList a) {
		Node front = a.getHead();
		Node prev = null;
		Node after = null;

		while(front != null) {
			after = front.next;
			front.next = prev;
			prev = front;
			front = after;
		}
		a.setHead(prev);
	}

}
