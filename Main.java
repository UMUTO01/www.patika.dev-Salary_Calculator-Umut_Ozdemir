public class Main {

    public static void main(String[] args) {

        employe channel =  new employe("Kemal",2000.0,45,1985);

        channel.Printer();


       
    }



}


class employe{
    String name;

    double salary;

    int workhours;

    int HireYear;

    double tax=0;

    double bonus;

    double TotalAmount;
    double RiseSalary;

    public employe(String Name, double Salary, int Workhours, int HireYear){
        this.name = Name;

        this.salary = Salary;

        this.workhours = Workhours;

        this.HireYear = HireYear;
    }


    public void tax(){
        if(salary>1000.00){
            tax = (3*salary)/100;
        }
        else{
            tax = 0;
        }

    }


    public void raiseSalary(){
        if(2024-HireYear>9 && 2024-HireYear< 20){
            RiseSalary += (salary*1)/10
            ;
        }
        if(2024-HireYear>19){
            RiseSalary += (salary*15)/100;
        }
        if(2024-HireYear<10){
            RiseSalary += (salary*5)/100;
        }

    }

    public void bonus(){
        if(workhours>40){

            bonus += (workhours-40)*30;
        }
    }

    public void Total(){

        TotalAmount += (salary+bonus)-tax;
    }

    public void NewTotal(){
        TotalAmount += RiseSalary;
    }

    public void Printer(){

        System.out.println("Name of the worker is: "+ name);
        System.out.println("The salary of the worker is: "+ salary);
        System.out.println("The work hours of the worker is: "+ workhours);
        System.out.println("The start year of the worker is: "+ HireYear);
        tax();
        System.out.println("The tax that will be paid is equal to: "+ tax);
        bonus();
        System.out.println("The bonuses are equal to: "+ bonus);
        raiseSalary();
        System.out.println("The rise amount of the salary is equal to:"+ RiseSalary);
        Total();
        System.out.println("With taxes and bonuses it is equals to: "+ TotalAmount);
        NewTotal();
        System.out.println("Overall salary is: "+ TotalAmount);



    }


}