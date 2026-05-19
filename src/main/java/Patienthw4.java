public class Patienthw4 extends PersonHW4{
    private  int idCardInsurance;

    public Patienthw4() {}

    public Patienthw4(String name, int age, double id, int idCardInsurance) {
        super(name, age, id);
        this.idCardInsurance = idCardInsurance;
    }

    public int getIdCardInsurance() {
        return idCardInsurance;
    }

    public void setIdCardInsurance(int idCardInsurance) {
        if(idCardInsurance > 0 )
        this.idCardInsurance = idCardInsurance;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", id Card Insurance: " + idCardInsurance;
    }
}

