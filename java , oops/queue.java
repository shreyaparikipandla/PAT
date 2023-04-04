import java.util.ArrayList;
public class queue {
    public static void main(String args[]){
        queues q= new queues();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.printqueue();
        q.deque();
        q.printqueue();
    }
}

class queues{
    ArrayList<Integer> que=new ArrayList<Integer>();
    int size=5;
    public void enque(int element){
        if(que.size()==size){
            System.out.println("overflow:stack is full");
        }
        else{
            que.add(element);
        }
    }
    public void deque(){
        if(isEmpty()){
            System.out.println("underflow: stack is empty");
        }
        else{
            que.remove(que.remove(0));
        }
    }
    public boolean isEmpty(){
        if(que.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printqueue(){
        for (int i = 0; i < que.size(); i++)
            System.out.print(que.get(i)+" ");
            System.out.println();
    }
    public void printrev(){
        for(int i=que.size()-1;i>=0;i--){
            System.out.print(que.get(i)+" ");
        }
    }
}
