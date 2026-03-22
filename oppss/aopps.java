public class aopps {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2,3,4));

        animal d=new animal();
        d.eat();
        kutta k=new kutta();
        k.eat();

        student bk=new student();
        bk.name="saaaa";
        System.out.println(bk.name);

        horse h=new horse();
        h.eat();
        h.walk();

        chick c=new chick();
        c.eat();
        c.walk();


       Queesn q= new Queesn();
       q.moves();

        
    }


    
    
}

class animal{
    void eat(){
        System.out.println("eats");
    }
}

class kutta extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}



class Calculator {
        int sum(int a,int b, int c, int d){
            return(a+b+c+d);
        }
        int sub(int a,int b, int c, int d){
            return(a-b-c-d);
        }
    }

abstract class dogesh{
    void eat(){
        System.out.println("eatttttttttttt");
    }
    abstract void walk();
}

class horse extends dogesh{
    void walk(){
        System.out.println("tabdak tabdak tabdak........");
    }
}

class chick extends dogesh{
    void walk(){
        System.out.println("pak pak pakak  pak pak pakak ......");
    }
}




interface Chess{//interface class cannot have body
    void moves();
}
class Queesn implements Chess{
    public void moves(){
        System.out.println("up down left right digonal");
    }
}
class rook implements Chess{
    public void moves(){
        System.out.println("up down left right");
    }
}
