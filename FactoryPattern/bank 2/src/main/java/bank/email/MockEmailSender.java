package bank.email;

import bank.domain.Customer;

public class MockEmailSender implements IEmailSender {
    @Override
    public void sendEamil(Customer customer) {
        System.out.println("Send mock email to customer: "+customer.getName());
    }
}