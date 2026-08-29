class Animal{
    private int age;
    public void setage(int age){
        if(age>0){
            this.age=age;
        }
        
    }
    public int getage(){
        return age;
    }
}
public class Main{
    public static void main(String[] args){
        Animal a=new Animal();
        a.setage(5);
        System.out.println(a.getage());
       
    }
}
