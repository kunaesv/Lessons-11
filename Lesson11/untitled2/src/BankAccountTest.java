import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }
    @Test
    public void shouldBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        account.block();
        assertTrue(account.isBlocked());
    }
    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("a", "b");
        String[] fullName = account.getFullName();
        assertEquals("a", fullName[0]);
        assertEquals("b", fullName[1]);
    }

    @Test
    public void shouldReturnCorrectAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("USD");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("USD", account.getCurrency());
    }
}
