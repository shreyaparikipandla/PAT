class Node{
    int data;//to store data
    Node next;//to store next address | the datatype of next is class name 
    public Node(int value){//constructer
        this.data=value;
        next=null;
    }
}

class Linked{
    public Node addeleAtstart(Node head,int data){
        Node first= new Node(data);
        Node temp=head;
        head=first;
        head.next=temp;
        return head;
    }
    public void addelement(Node head,int data){
        Node new_node = new Node(data);
        Node curr = head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=new_node;
    }
    public void delelement(Node head){
        Node curr = head;
        while(curr.next.next != null){
            curr=curr.next;
        }
        curr.next=null;
        System.out.println();
    }
    public void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }
    Node revll(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

}

public class linkedlist {
    public static void main(String args[]){
        Linked ll=new Linked();
        Node head= new Node(10);
        ll.addelement(head,20);
        ll.addelement(head,30);
        ll.addelement(head,40);
        ll.printll(head);
        ll.delelement(head);
        ll.printll(head);
        head=ll.addeleAtstart(head, 50);
        ll.printll(head);
        head=ll.revll(head);
        ll.printll(head);
    }
}
//homework: deleting , inserting at a particular index , value