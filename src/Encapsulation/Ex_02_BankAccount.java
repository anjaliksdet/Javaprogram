package Encapsulation;

public class Ex_02_BankAccount {
    static void main() {
        bankDetails accountDetails= new bankDetails("Anjali","123456");
        String a = accountDetails.getUserName();
        System.out.println(a);

        boolean isCashier= true;

        accountDetails.setUserName("Momo" ,true);
        System.out.println(" name changed to " +accountDetails.getUserName());
    }
}

class bankDetails{
    private String accountNo;
    private String userName;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName,boolean isCashier) {
        if (isCashier) {
            this.userName = userName;
        }
        else {
            System.out.println("cant change name ");
        }
    }

    bankDetails(String name, String accno) {

    this.userName= name;
    this.accountNo= accno;

}
}
