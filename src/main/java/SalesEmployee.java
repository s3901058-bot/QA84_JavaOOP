public class SalesEmployee extends Employershw4 {
    private int bonus;

    public SalesEmployee() { }

    public SalesEmployee(String name, int age, double id, String company, int salary, int bonus) {
        super(name, age, id, company, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return super.toString()
                + ", Bonus: " + bonus;
    }
}
