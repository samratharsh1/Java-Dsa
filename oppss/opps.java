public class opps {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("red");
        System.out.println(p1.getcolor());
        p1.settip(5);

        BankAccount u1=new BankAccount();
        u1.username="samratharshkumar";
        u1.setPassword("samrat@2005");

        student s1=new student();//cunstructor;
        s1.name="samrat";
        s1.age=21;
        // s1.rollno=2300320310165;
        System.out.println(s1.name);

        // student s2=new student();//non paramaterised
        // student s3=new student("samrat"); //paramererised constructor
        // // student s4=
        // student(student s1){ // shallow copy constructer isme array mei only address copy hota hai 
        //     this.name=s1.name;
        //     this.rollno=s1.rollno;
        // }



        doges kutta=new doges();
        kutta.legs=4;
        kutta.eat();
        kutta.breed="labra";
        System.out.println(kutta.breed);
        


        


    }

    // constructor types>>  non paramererised,parameterised,copy;
    // 


    
}


class BankAccount{
    private String password  ;    //private>>default>>protected>>public
    public String username;
    void setPassword(String p){
        password=p;
    }
}

class Pen{//Encapsulation ==> is defined as the wrapping up of data &methods under a single unit it is also called data hiding.
    private String color;
    private int tip;
    // void setColor(String newcolor){
    //     color=newcolor;
    // }
   


    void settip(int t){
        this.tip=t;}

    void setcolor(String c){
       this.color=c;
    }
    int gettip(){
        return this.tip;}

    String getcolor(){
        return this.color;
    }

}
 class student{
    String name;
    int age;
    float percentage;
    void calcPerc(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

 }



 // inheritense

 class animal{//parent class
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
 }

 class fish extends animal {//child class 
    int fins;
    void swim(){
        System.out.println("swim");
    }
 }

 class mammal extends animal {
    int legs;
 }
 class doges extends mammal {
    String breed;
 }