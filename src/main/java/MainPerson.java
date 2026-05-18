import java.security.PKCS12Attribute;

public class MainPerson {
    public static void main(String[] args) {
         Person p1 = new Person();//DEFAULT CONSTRUCTOR создания обьекта 1
         Person p2 = new Person();//создания обьекта 2

         p1.setName("John Doue");
         p1.setID(777);
         p1.setAge(25.022);

         p2.setName("Helene Fischer");
         p2.setID(22111);
         p2.setAge(45);



        System.out.println("Name:"+" "+p1.getName());
        System.out.println("ID:"+" "+p1.getID());
        System.out.println("Age:"+" "+p1.getAge());

        System.out.println("Name:"+" "+ p2.getName());
        System.out.println("ID:"+" "+p2.getID());
        System.out.println("Age:"+" "+p2.getAge());




    }
}
/*
p1-> [name = '' id = '']
 */

