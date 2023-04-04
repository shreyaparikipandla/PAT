public class dsa {
    public static void main(String[] args ){
        Backaccount myacc = new Backaccount();
        myacc.username="shreya";
        myacc.setpassword("abc");
        Pen p1=new Pen();
        p1.setcolor("yellow");
        p1.settip(5);
        System.out.println(myacc.username);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        }
}
//The access modifiers in Java specifies the accessibility or s
//cope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
class Backaccount{
    String username;
    private String password;
    public void setpassword(String pwd){
        password= pwd;
    }
}

class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;//this --current object 
    }
    int gettip(){
        return this.tip;//getter 
    }
    void setcolor(String newcolor){
        this.color=newcolor;//setter 
    }
    void settip(int tip){
        this.tip= tip;
    }
}
