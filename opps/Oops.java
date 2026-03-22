 
public class oops {
    public static void main(String[] args) {
        // Pen p1=new Pen();//created a pen object p1
        // p1.setColor("blue");
        // System.out.println(p1.color);
        // p1.setTip(7);
        // System.out.println(p1.tip);
        // p1.setColor("yellow");
        // System.out.println(p1.color);
        // p1.color="green";
        // System.out.println(p1.color);

        // BankAccount per1=new BankAccount();
        // per1.name="samrat";
        // per1.gender='m';
        // per1.phoneno= 8004995367L;
        // per1.fathername="Ashok Kumar Sharma";
        // per1.accountno=123456789;
        // System.out.println(per1);
        // per1.setPassword("samrat#123");
        // System.out.println(per1.getName());

        // access modifiers
        // private within the class
        // default within the class and pakage
        // protected within the class package and outside pakage subclass
        // public every where

        student s1=new student("samrat",165);
        student s2=new student("lucky",1);
        student s3=new student(s1);
        System.out.println(s1.name+" "+s1.rollno);
        System.out.println(s2.name+" "+s2.rollno);
        System.out.println(s3.name);


    }
    
} 
class student{
    String name;
    int rollno;
    student(String name,int roln){ //constructor creation
        this.name=name;
        this.rollno=roln;

    }

    student(student s1){//copy constructor
        this.name=s1.name;
        this.rollno=s1.rollno;
    }
}



class BankAccount{
    private String password;
    long accountno;
    public String name;
    char gender;
    long phoneno;
    String fathername;
    public void setPassword(String pwd){
        password=pwd;
    }
    String getName(){
        return this.name;
    }

}


class Pen{
    //properties & functions
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

