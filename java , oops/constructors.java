//constructs shld have same name as class
//ans also no return type 
//constrcutors execute while creating the objects**
//consts are of 2 types  non arguments and parametarized
class students{
    String sname;
    int sroll;
    public students(){
        System.out.println("object is being constructed");//this will print first 
    }
    public students(int a){
        System.out.println("another const");
    }
    public students(String name,int roll){
        this.sname=name;
        this.sroll=roll;
    }
    public void display(){
        System.out.println(sname+" "+sroll);
    }
    public void print(String sname, int sroll){
        System.out.println(sname+" "+sroll);
    }
}
public class constructors {
    public static void main(String[] args){
        students s=new students("shreya",101);
        s.display();
        s.print("pragna",1002);
    }
}
/*if there are 2 variables 1 local and 1 global  variable with the same name but diff values 
we use this keyword
this.variable will return the value of global variable */
//array list 