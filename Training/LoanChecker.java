package Training;
import java.util.*;
class LoanChecker{
    public static void main(String[] args){
        Scanner th=new Scanner(System.in);
        int age=th.nextInt();
        int salary=th.nextInt();
        int emi=th.nextInt();
        if(age>=21){
            if(salary>=21000){
                if(emi<=700){
                    System.out.print("Eligible for Loan");
                }
                else{
                    System.out.print("Not Eligible due to high emi");
                }
            }
            else{
                System.out.print("Not Eligible due to Low Salary");
            }
        }
        else{
            System.out.print("Not Eligible due to Age Criteria");
        }
        th.close();
    }
}