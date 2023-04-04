class Nodes{
    int data;//to store data
    Nodes next;//to store next address | the datatype of next is class name 
    Nodes prev;
    public Nodes(int value){//constructer
        this.data=value;
        next=null;
        prev=null;
    }
}

class doubleLinked{
    public void addelement(Nodes head,int data){
        Nodes new_node = new Nodes(data);
        Nodes curr = head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=new_node;
        new_node.prev=curr;
    }
    public void delelement(Node head){
        Node curr = head;
        while(curr.next.next != null){
            curr=curr.next;
        }
        curr.next=null;
        System.out.println();
    }
    public void printll(Nodes head){
        Nodes curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }
}

public class Doublelinkedlist {
    public static void main(String args[]){
        doubleLinked ll=new doubleLinked();
        Nodes head= new Nodes(10);
        ll.addelement(head,20);
        ll.addelement(head,30);
        ll.addelement(head,40);
        ll.printll(head);
        // ll.delelement(head);
        // ll.printll(head);
        // head=ll.addeleAtstart(head, 50);
        ll.printll(head);
    }
}
