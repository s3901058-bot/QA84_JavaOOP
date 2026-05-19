public class PersonHW4 {
    private String name;
    private int age;
    private double id;

    public PersonHW4() {}

    public PersonHW4(String name, int age, double id) {
        super();
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name)
    {
        if(name != null)
        this.name = name;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 70)
        this.age = age;
    }

    public void setId(double id) {
        if(id >= 0)
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double isId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Age: " + age
                + ", Id: " + id;
    }
}
