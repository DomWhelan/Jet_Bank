package com.jetbanking.banking;
import com.jetbanking.people.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest {

    @Test
    public void constructorTest(){
        Account testAccount = new Account(1,"Savings", new Customer());
        Assertions.assertEquals(1, testAccount.getId());
    }
}
