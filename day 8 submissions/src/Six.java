class Person{
    String name;
    void change(Person p){
        p.name="Rishaban";
        p=new Person();
        p.name="san";
        System.out.println("Inside method: "+p.name);
    }
}
public class Six {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="max";
        System.out.println("Before method: "+person.name);
        person.change(person);
        System.out.println("After method: "+person.name);

    }
}
