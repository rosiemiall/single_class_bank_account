import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private int accountNumber;
    private double accountBalance;
    private String accountType;

    private double accountOverdraft;

    public BankAccount(String inputFirstName, String inputLastName,
                       String inputDateOfBirth, int inputAccountNumber) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = LocalDate.parse(inputDateOfBirth);
        this.accountNumber = inputAccountNumber;
        this.accountBalance = 0;
        this.accountType = "current";
        this.accountOverdraft = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = LocalDate.parse(newDateOfBirth);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

    public double deposit(double newDeposit) {
        this.accountBalance += newDeposit;
        return this.accountBalance;
    }

    public double withdrawal(double newWithdrawal) {
        if(this.accountBalance-newWithdrawal >= 0-this.accountOverdraft){
            return this.accountBalance -= newWithdrawal ;
        }
        return this.accountBalance;
    }

    public void payInterest() {
        if (accountType.equals("current")) {
            this.accountBalance *= 1.05;
        }
        if (accountType.equals("savings")) {
            this.accountBalance *= 1.1;
        }
        if (accountType.equals("student")) {
            this.accountBalance *= 1.2;
        }
//        return this.accountBalance;
    }

    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType(String newType) {
        this.accountType = newType;
    }

    public double getAccountOverdraft() {
        return this.accountOverdraft;
    }
    public void setAccountOverdraft(double newOverdraft) {
        this.accountOverdraft = newOverdraft;
    }

}
