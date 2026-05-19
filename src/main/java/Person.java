public class Person {
    private String name;
    private int id;
    private double age;

    //setters
    public Person() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setID(int id) {
        if (id > 0)
            this.id = id;
        {
        }
    }

    public void setAge(double age) {
        if (age > 0)
            this.age = age;
        {
        }
    }

    // getters
    public String getName() {
        return name;

    }

    public int getID() {
        return id;

    }

    public double getAge() {
        return age;

    }

}



/*


_________________________________________
1. for all Computer

company (String)
MainBoard (String)
RAM (int)
CPU(String)
cdd(int)
set /get

MainComputer -> main
create 3 objects Computer
user setters and getters for printing

__________________________________________

2.Advance
for your choose

HW2

                   PersonHW4 [name,id,age]
                |              |           |
          Employershw4       SportsManhw4   Patienthw4
        [company,salary]  [Sport]      [idCardInsurance]
            |
         SalesEmployee
         [bonus]



 */

