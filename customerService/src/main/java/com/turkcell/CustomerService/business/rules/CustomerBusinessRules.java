package com.turkcell.CustomerService.business.rules;

import com.turkcell.CustomerService.business.messages.Messages;
import com.turkcell.CustomerService.core.business.abstracts.MessageService;
import com.turkcell.CustomerService.core.crossCuttingConcerns.exceptions.types.BusinessException;
import com.turkcell.CustomerService.dataAccess.abstracts.CustomerRepository;
import com.turkcell.CustomerService.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerBusinessRules {
    CustomerRepository customerRepository;
    MessageService messageService;

    public void nationalityNoCanNotBeDuplicated(String nationalityNo ){
        Optional<Customer> customer = customerRepository.findByNationalityNo(nationalityNo);
        if(customer.isPresent()){
            throw new BusinessException(messageService.getMessage((Messages.CustomerErrors.CustomerWithThisIDNumberExist)));
        }
    }


    public void customerShouldBeExist(int customerId) {
        Optional<Customer> foundOptionalCustomer = customerRepository.findById(customerId);
        if (foundOptionalCustomer.isEmpty()) {
            throw new BusinessException(messageService.getMessage(Messages.CustomerErrors.CustomerShouldBeExists));
        }
    }
}
