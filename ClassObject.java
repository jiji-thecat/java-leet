class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    void greet(){
        System.out.println("Hello my name is "+this.name);
    }
}

public class ClassObject{
    public static void main(String[] args){
        Person p = new Person("Hanako");
        p.greet();
    }
}