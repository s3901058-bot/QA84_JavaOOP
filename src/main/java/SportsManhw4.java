public class SportsManhw4 extends PersonHW4 {
    private String sport;
    private boolean status;

    public SportsManhw4() {}

    public SportsManhw4(String name, int age, double id, String sport, boolean status ) {
        super(name, age, id);
        this.sport = sport;
        this.status = status;

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
                + ", Sport: " + sport
                + ", Status: " + status;
    }
}