public class LinkedList {

    private Node head;

    public LinkedList() {
    }

    public void append(int value) {
        if(head == null) {
            head = new Node(value);
            return;
        }

        Node addMe = new Node(value);
        Node front = head;
        
        while(front.next != null) {
            front = front.next;
        } 

        front.next = addMe;
    }

    public String toString() {
        Node front = head;
        StringBuilder sb = new StringBuilder();
        if(front == null) {
            return null;
        }
        while(front.next != null) {
            sb.append(front.value + "->");
            front = front.next;
        }
        sb.append(front.value);

        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.append(1);
        a.append(2);
        a.append(3);
        System.out.println(a);
    }

}
