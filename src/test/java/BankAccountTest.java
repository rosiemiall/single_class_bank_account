import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void canGetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        String result = bankAccount.getFirstName();
        String expected = "John";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setFirstName("Phil");
        String result = bankAccount.getFirstName();
        String expected = "Phil";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetLastName(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        String result = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetLastName(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setLastName("James");
        String result = bankAccount.getLastName();
        String expected = "James";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.parse("1950-05-05");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setDateOfBirth("2000-03-03");
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.parse("2000-03-03");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        int result = bankAccount.getAccountNumber();
        int expected = 123456789;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountNumber(987654321);
        int result = bankAccount.getAccountNumber();
        int expected = 987654321;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetAccountBalance(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountBalance(50);
        double result = bankAccount.getAccountBalance();
        double expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetAccountBalance(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountBalance(500);
        double result = bankAccount.getAccountBalance();
        double expected = 500;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canDeposit(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.deposit(400);
        double result = bankAccount.getAccountBalance();
        double expected = 400;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canWithdrawal(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountBalance(500.50);
        bankAccount.withdrawal(400);
        double result = bankAccount.getAccountBalance();
        double expected = 100.50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canPayInterest(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountBalance(500);
        bankAccount.payInterest();
        double result = bankAccount.getAccountBalance();
        double expected = 500*1.05;
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void canGetAccountType(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountType("savings");
        String result = bankAccount.getAccountType();
        String expected = "savings";
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canSetAccountType(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountType("savings");
        String result = bankAccount.getAccountType();
        String expected = "savings";
        assertThat(result).isEqualTo(expected);
    }


        @Test
    void checkDifferentAccountTypes(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountBalance(100);
        bankAccount.setAccountType("student");
        double balance = bankAccount.getAccountBalance();
        bankAccount.payInterest();
        double result = bankAccount.getAccountBalance();
        double expected = balance * 1.2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void hasOverdraft(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
            "1950-05-05", 123456789);
        bankAccount.setAccountBalance(200);
        bankAccount.setAccountOverdraft(1000);
        bankAccount.withdrawal(300);
        double result = bankAccount.getAccountBalance();
        double expected = -100;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void canGetAccountOverdraft(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountOverdraft(100);
        double result = bankAccount.getAccountOverdraft();
        double expected = 100;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canSetAccountOverdraft(){
        BankAccount bankAccount = new BankAccount("John", "Smith",
                "1950-05-05", 123456789);
        bankAccount.setAccountOverdraft(500);
        double result = bankAccount.getAccountOverdraft();
        double expected = 500;
        assertThat(result).isEqualTo(expected);
    }
}
