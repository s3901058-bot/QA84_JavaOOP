public class PersonHW4 {
    private String name;
    private int age;
    private long id;

    public PersonHW4() {}

    public PersonHW4(String name, int age, long id) {
        super();
        this.name = name;
        this.age = age;
        setId(id);
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

    public void setId(long id) {
        if (id >= 1000000000000000L && id <= 9999999999999999L) {
            this.id = id;
        } else {
            this.id = -1;
        }
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
        String idText;  // временная переменная для текста, который будет выводиться вместо ID

        if (id == -1) {
            idText = "Invalid ID"; // если айди невалидный вместо -1 выводим текст
        } else {
            idText = String.valueOf(id);//  если айди валидный превращаем число id в строку
        }

        return "Name: " + name
                + ", Age: " + age
                + ", Id: " + idText;
    }
}