/**
* Assessment:   Create a banking system to handle a transaction, 
*               using JDBC Transaction to make transaction consistent.
* Date: Jan 27, 2023
* Course & Section #: 22S_CST8288_012
* Description: This Application provides Menu-Driven Console interface
*               that user can perform functions like create Account, Deposit,
*               Withdraw, and View Balance.
*/
package Banking;

/**
 * This class contains information of a client
 * @author VyTran
 */
public class Customer {
    private String lastName;
    private String firstName;
    private String SIN;
    private String password;
    private Account account;

    public Customer(String firstName, String lastName, String SIN, String password, Account account){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SIN = SIN;
        this.password = password;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return "Customer Information\n"+
                "First name: "+ firstName +"\n"+
                "Last name: "+ lastName +"\n"+
                "Social Insurance Number: "+ SIN +"\n"+
                account.toString();
    }

    public Account getAccount() {
        return account;
    }
    
    public String clientInfo(){
        return  "First name: "+ firstName +
                ", Last name: "+ lastName +
                ", Social Insurance Number: "+ SIN +
                ", Account number: " + account.getAccountNumber()+
                ", Balance: "+ getAccount().getBalance();
    }
}
