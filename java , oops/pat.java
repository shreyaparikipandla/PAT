import java.util.Scanner;
class student{
    int roll=10;
    String name="student1";
    public void display(){
        System.out.println(name);
    }
} 
class insta{
    String username="shreya@iare";
    private String password="1234";//making password private 
    public void updatepass(String newpass){//setter
        password=newpass;
    }
    public String getpass(){//getter
        return password;
    }

}//setter and getter shld be public at all costs

public class pat {
    public static int add(int a,int b){
        return a+b;//static is declared no need to create object 
    }
    public int mul(int n,int m){
        return n*m;//static isnt declared  , have to create new object 
    }
    public static void main(String args[]){
        System.out.println("hello");
        student s1=new student();
        student s2=new student();
        s1.name="shreya";//s1 name will be changed to shreya whereas s2 will print student1
        s2.display();//to call a method outside a class 
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(add(10,20));
        pat ob=new pat();//new object 
        System.out.println(ob.mul(10,20));
        insta i1=new insta();//new object for insta class
        System.out.println(i1.username);
        System.out.println(i1.getpass());//getter is used to print the private things in the class
        i1.updatepass("5678");//updating the password to 5678
        System.out.println(i1.getpass());



        try (Scanner s = new Scanner(System.in)) {
            int p=s.nextInt();
            int q=s.nextInt();
            try{
                System.out.println(p/q);
            }
            catch(Exception e){
                System.out.println("oops");
            }
            finally{//finally will always execute 
                System.out.println("finally");
            }
        }
        System.out.println("program executed");

    }
}
