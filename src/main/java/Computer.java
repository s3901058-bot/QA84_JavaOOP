public class Computer {
    private String company;
    private String mainBoard;
    private int ram;
    private String cpu;
    private int ssd;

    public Computer() {}

    public Computer(String company, String mainBoard, int ram, String cpu, int ssd){
        super();
        this.company = company;
        this.mainBoard = mainBoard;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company !=null)
        this.company = company;
    }

    public String getMainBoard() {

        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        if(mainBoard !=null)
        this.mainBoard = mainBoard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram > 0)
        this.ram = ram;
    }

    public String getCpu() {
         return cpu;
    }

    public void setCpu(String cpu) {
        if(cpu !=null)
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if(ssd > 0)
        this.ssd = ssd;
    }



    @Override
    public String toString() {
        String computerString = ("Company: "+ this.company + " "+
                                 "MainBord: "+ this.mainBoard+ " " +
                                 "RAM: "+ this.ram+ " Gb"+ " "+
                                  "ssd: "+ this.ssd+ " Tb");

        return computerString;
}
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
