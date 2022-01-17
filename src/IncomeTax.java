import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your salary = ");
        int salary=obj.nextInt();
        float incomeTax= calculateIncomeTax(salary);
        System.out.println("Income Tax is = "+incomeTax);
    }

    private static float calculateIncomeTax(int salary) {
        float tax=0.0f;
        if (salary<=50000){
            return tax;
        } else if (salary<=60000){
            tax=salary*0.10f;
            return tax;
        }else if (salary<=150000){
            tax=salary*0.20f;
            return tax;
        }else {
            tax=salary*0.30f;
            return tax;
        }
    }
}
