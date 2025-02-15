import JunitTestingPrograms.TestingBankTransactions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestBankTransactions {
    @Test
    public void testDeposit() {
        TestingBankTransactions testingBankTransactions = new TestingBankTransactions();
        testingBankTransactions.deposit(1000);
        assertEquals(2000, testingBankTransactions.getBalance());
    }
    @Test
    public void testWithdraw() {
        TestingBankTransactions testingBankTransactions = new TestingBankTransactions();
        testingBankTransactions.withdraw(300);
        assertEquals(700, testingBankTransactions.getBalance());
    }
    @Test
    public void testwithInsufficientFunds() {
        TestingBankTransactions testingBankTransactions = new TestingBankTransactions();
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> testingBankTransactions.withdraw(5000));
        assertEquals("Insufficient FUNDS", exception.getMessage());
    }
    @Test
    public void testWithdrawAmount() {
        TestingBankTransactions testingBankTransactions = new TestingBankTransactions();
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> testingBankTransactions.withdraw(-50));
        assertEquals(" Withdraw amount should be greater than 0", exception.getMessage());
    }
    @Test
    public void testDepositAmount() {
        TestingBankTransactions testingBankTransactions = new TestingBankTransactions();
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> testingBankTransactions.deposit(-1000));
        assertEquals("Deposit must be positive", exception.getMessage());
    }



}
