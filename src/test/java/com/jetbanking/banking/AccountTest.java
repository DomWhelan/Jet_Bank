package com.jetbanking.banking;
import com.jetbanking.exceptions.InvalidAccountTypeException;
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
}
