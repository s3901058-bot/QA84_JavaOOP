public class Employershw4 extends PersonHW4{
    private String company;
    private int salary;

    public Employershw4(){}

    public Employershw4(String name, int age, long id, String company, int salary) {
        super(name, age, id);
        this.company = company;
        this.salary = salary;
    }

    public void setCompany(String company) {
        if(company != null)
        this.company = company;
    }

    public void setSalary(int salary) {
        if(salary >= 16 && salary <= 17)
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Company: " + company + ", salary : " + salary;
    }

    }
