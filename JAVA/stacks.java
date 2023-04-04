import java.util.ArrayList;

public class stacks {
    public static void main(String args[]){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

//implementing stack
        stack ob = new stack();
        ob.push(5);
        ob.push(6);
        ob.pop();
        ob.push(8);
        ob.printstack();
        ob.printrev();
        System.out.println(ob.isEmpty()); 
    }
}

class stack{
    ArrayList<Integer> stk= new ArrayList<Integer>();
    int size=5;
    public void push(int element){
        if(stk.size()==size){
            System.out.println("overflow:stack is full");
        }
        else{
            stk.add(element);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("underflow: stack is empty");
        }
        else{
            stk.remove(stk.size()-1);
        }
    }
    public int peek(){
        if(isEmpty()){
            return stk.get(stk.size());
        }
        else{
            System.out.println("stack is empty");
            return -1;

        }    
    }
    public boolean isEmpty(){
        if(stk.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printstack(){
        for (int i = 0; i < stk.size(); i++)
            System.out.print(stk.get(i)+" ");
            System.out.println();
    }
    public void printrev(){
        for(int i=stk.size()-1;i>=0;i--){
            System.out.print(stk.get(i)+" ");
        }
    }
}

//reverse everyy 3 elements in the stack
// 123456
// 321654
