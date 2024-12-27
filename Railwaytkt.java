/*The person is booking the railway ticket based on their age and the number of tickets they want to purchase.The 
prices are regular price : rs.50, senior citizen (Age 60 and above) price : rs.30 and for the children 
age 12 and below price is :rs.20.Find out total cost based on the their age and the number of tickets and display it. */

import java.util.*;
class Railway{
    public static void main(String[]ar){
        Scanner th=new Scanner(System.in);
        int total=0;
        do{
            System.out.println("Enter age: \n To exit enter -1");
            int age=th.nextInt();
            if(age<=12 && age>=1){
                total+=20;
            }
            else if(age>=60){
                total+=30;
            }
            else if(age==-1){
                break;
            }
            else{
                total+=50;
            }
        }while(true);
        System.out.println("Total price for all tickets is: "+total);
    }
} 