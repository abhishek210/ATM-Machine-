import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account  {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<>();
    public void getLogin() throws IOException{
        int x = 1;
        do
          {
            try {
                data.put(952141, 191904);
                data.put(989947, 71976);
                System.out.println("Welcome to the ATM Project");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt());
                System.out.print("Enter your PIN Number : ");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                System.out.println("\n" + "Invalid Character(s).only Number." + "\n");
                x=2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }
            else
               System.out.println("\n" + "Wrong custtomer number or pin number" + "\n");
              
          } while (x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you want to access : ");
        System.out.println("Type 1 - checking Account");
        System.out.println("Type 2 - saving Account");
        System.out.println("Type 3 - exit");
        int selection  = menuInput.nextInt();
        switch (selection) {
            case 1 :
                   getChecking();
                   break;
            case 2 :
                   getSaving();
                   break; 
            case 3 :
                   System.out.println("Thank you for using this ATM , bye. \n");
                   break; 
            default :
                   System.out.println("\n"+"Invalid choice"+"\n");
                   getAccountType();     
        }

    }
    public void getChecking(){
        System.out.println("Checking Account : ");
        System.out.println("Type 1 - view balance");
        System.out.println("Type 2 - withdraw fund");
        System.out.println("Type 3 - Deposit fund");
        System.out.println("Type 4 - exit");
        System.out.print("choice");
        int selection = menuInput.nextInt();
        switch (selection) {
            case 1 :
                   System.out.println("checking account balance :"+ moneyFormat.format(getCheckingBalance()));
                   getAccountType();
                   break;
            case 2 :
                   getCheckingWithdrawInput();
                   getAccountType();
                   break; 
            case 3 :
                   getCheckingDepositInput();
                   getAccountType();
                   break; 
            case 4 :
                   System.out.println("Thank you for using this ATM, bye. ");
                   break; 
            default :
                   System.out.println("\n"+"Invalid choice"+"\n");
                   getChecking();     
        }
    }
    public void getSaving(){
        System.out.println("saving account : ");
        System.out.println("Type 1 - view balance");
        System.out.println("Type 2 - withdraw fund");
        System.out.println("Type 3 - Deposit fund");
        System.out.println("Type 4 - exit");
        System.out.print("choice");
        int selection = menuInput.nextInt();
        switch (selection) {
            case 1 :
                   System.out.println("saving account balance :"+ moneyFormat.format(getCheckingBalance()));
                   getAccountType();
                   break;
            case 2 :
                   getSavingWithdrawInput();
                   getAccountType();
                   break; 
            case 3 :
                   getSavingDepositInput();
                   getAccountType();
                   break; 
            case 4 :
                   System.out.println("Thank you for using this ATM, bye. ");
                   break; 
            default :
                   System.out.println("\n"+"Invalid choice"+"\n");
                   getChecking();     
        }

    }

    
}
