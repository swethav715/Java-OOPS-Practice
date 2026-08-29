class Animal{
    String name;
    void sound(){
        System.out.print("Animal sound.");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.print("Dog's sound.");
    }
}
public class Main{
    public static void main(String[] args){
        Animal a=new Animal();
        a.sound();
        Animal d=new Dog();
        d.sound();
        
    }
}
