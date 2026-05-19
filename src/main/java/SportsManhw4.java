public class SportsManhw4 extends PersonHW4 {
    private String sport;

    public SportsManhw4() {}

    public SportsManhw4(String name, int age, double id, String sport) {
        super(name, age, id);
        setSport(sport);
    }

    public void setSport(String sport) {
        if (sport != null) {
            this.sport = sport;
        }
    }

    public String getSport() {
        return sport;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Sport: " + sport;
    }
}