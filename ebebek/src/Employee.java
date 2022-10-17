public class Employee {

    protected String name;
    protected float salary;
    protected int workHours;
    protected int hireYear;


    Employee(String name, float salary, int workHours, int hireYear ){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }


    public float tax(){

       float tax = this.salary>1000 ? (float) (this.salary*3/100):0;
       return  tax;

    }



    public float bonus(){

        if(this.workHours>40){
            return ((this.workHours-40)*30);
        }else{
            return 0;
        }
    }



    public float raiseSalary(){

        int todaysYear = 2021;
        int workingYear = todaysYear - this.hireYear;
        float totalSalary = (float) (this.salary + this.bonus() - this.tax());

        float extra=0;


        if(workingYear < 10){

            extra = (float) (totalSalary*5/100);

        }else if(workingYear >9 && workingYear <20){

            extra = (float) (totalSalary*10/100);

        }else{

            extra = (float) (totalSalary*15/100);

        }


        this.salary += extra;
        return extra;
    }



    @Override
    public String  toString(){

        String infoText;
        infoText = "ADI:             " + this.name + "\n";
        infoText += "MAAŞI:          " + this.salary + "\n";
        infoText += "ÇALIŞMA SAATİ:  " + this.workHours + "\n";
        infoText += "BAŞLANGIÇ YILI: " + this.hireYear + "\n";
        infoText += "VERGİ:          " + tax() + "\n";
        infoText += "BONUS:          " + this.bonus() + "\n";
        infoText += "MAAŞ ARTIŞI:    " + this.raiseSalary() + "\n";
        infoText += "VERGİ VE BONUSLARLA BİRLKİKTE MAAŞ :    " + (this.salary + this.bonus() - this.tax()) + "\n";
        infoText += "TOPLAM MAAŞ :   " + (this.salary + this.bonus()) + "\n";

        return infoText;

    }

}
