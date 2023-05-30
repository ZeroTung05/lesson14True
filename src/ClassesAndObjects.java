public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Андрей";
        person1.age = 19;
        System.out.println("еня зовут "+ person1.name + ","+ "мне "+ person1.age+"лет");

        Person person2 = new Person();
        person2.name = "Александр";
        person2.age = 20;
        System.out.println("еня зовут "+ person2.name + ","+ "мне "+ person2.age+"лет");
    }
}
class Person{
    String name;
    int age;

    //У классса могут быть:
    //1 Даннык ( поля)
    //2 Действия, которые он может совершать
}
