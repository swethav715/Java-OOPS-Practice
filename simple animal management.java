class Animal{
    String name;
    String species;
    Animal(){
        
    }
    Animal(String name,String species){
        this.name=name;
        this.species=species;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Species: "+species);
    }
    void sound(){
        System.out.print("some sound");
    }
}
class Lion extends Animal{
    
   Lion(){
       super("singam","lion");
   }
    @Override
    void sound(){
        System.out.println("Roar..");
    }
   
}

public class Main{
    public static void main(String[] args){
        Animal a1=new Animal("Tommy","Dog");
        Animal a2=new Animal("simba","Lion");
        a1.display();
        a2.display();
        Animal l=new Lion();
        l.sound();
        l.display();
       
    }
}
