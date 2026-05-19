public class Lesson_6_MainBooks
{
    public static  void main(String[] args)
    {
        Book book= new Book("Der Weg zurück","Remarque",400,10045);
        System.out.println(book.toString());

        FictionBook Fb= new FictionBook("Vii","Gogol",230,12567,"Horror");
        System.out.println(Fb);

        EducationBook Eb= new EducationBook("Geometry","Pifagor",300,8975,"Geometry");
        System.out.println(Eb);

        KidsFictionBook Kb= new KidsFictionBook("Kids","Autor",300,8975,"Kinds",8);
        System.out.println(Kb);



        /*
        HW4____________________________________________________________________
         */

        PersonHW4 mainPerson= new PersonHW4("John Doe",25,150.06000);
        System.out.println(mainPerson);
        Employershw4 Employers= new Employershw4("John Doe",25,150.06000,"Microsoft",10000);
        System.out.println(Employers);
        SalesEmployee SalesEmployee1= new SalesEmployee("John Doe",25,150.06000,"Microsoft",10000,152);
        System.out.println(SalesEmployee1);
        SportsManhw4 SportsMan= new SportsManhw4("John Doe",25,150.06000,"Running",true);
        System.out.println(SportsMan);
        Patienthw4 Patient= new Patienthw4("John Doe",25,150.06000,452007752);
        System.out.println(Patient);


          /*
        HW4____________________________________________________________________



                   PersonHW4 [name,id,age]
                |              |           |
          Employershw4       SportsManhw4   Patienthw4
        [company,salary]  [Sport, status]      [idCardInsurance]
            |
         SalesEmployee
         [bonus]


 */


    }
}
