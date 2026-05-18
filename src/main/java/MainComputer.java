public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", "ASUS ROG STRIX B550-A", 32, "R7 5800X3D", 1);

        System.out.println(computer.toString());
        Computer computer2 = new Computer("Microsoft", "Annadue X99 P4 ", 64, "INTEL Core i7-4820K", 2);

        System.out.println(computer2.toString());
        Computer computer3 = new Computer("Msi", "B650", 64, "R5 7600", 3);

        System.out.println(computer3.toString());
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





 */