package Reflection;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionCheker cheker = new ReflectionCheker();
        Rabbit rabbit = new Rabbit();

        cheker.showClassName(rabbit);
        cheker.showClassFields(rabbit);
        cheker.showClassMethods(cheker);
        cheker.showFieldsClassAnnotations(rabbit);


        cheker.fillPrivetFileds(rabbit);
        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());


       Object clone = cheker.createNewObject(rabbit);
       cheker.showClassName(clone);
    }
}
