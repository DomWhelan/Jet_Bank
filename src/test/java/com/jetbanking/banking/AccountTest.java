package com.jetbanking.banking;
import com.jetbanking.exceptions.InvalidAccountTypeException;
import com.jetbanking.exceptions.OverdrawnException;
import com.jetbanking.people.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest {


    @Test
    public void ConstructorSuccessTest() throws InvalidAccountTypeException {
        Account testAccount = new Account(1,"Savings", new Client());
        Assertions.assertEquals(1, testAccount.getId());
        System.out.println(testAccount.getCreationDate());
    }

    @Test
    public void ConstructorFailureTest(){
        Account testAccount = new Account();
        Assertions.assertThrows(InvalidAccountTypeException.class, ()-> testAccount.setType("Fail"));
    }

    @Test
    public void AccountWithdrawalSuccessTest() throws OverdrawnException {

        Account testAccount = new Account();
        testAccount.setBalance(1000);

        Assertions.assertEquals(500.00, testAccount.withdraw(500.00));

    }

    @Test
    public void AccountWithdrawalFailureTest() throws OverdrawnException {

        Account testAccount = new Account();
        testAccount.setBalance(500);

        Assertions.assertThrows(OverdrawnException.class, ()-> testAccount.withdraw(600));
    }
}
