package com.turkcell.CustomerService.business.concretes;

import com.turkcell.CustomerService.business.abstracts.CustomerService;
import com.turkcell.CustomerService.business.dtos.request.create.CreatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.request.update.UptatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.response.create.CreatedCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.get.GetCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.getAll.GetAllCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.updated.UpdatedCustomerResponse;
import com.turkcell.CustomerService.core.utilities.mapping.ModelMapperService;
import com.turkcell.CustomerService.dataAccess.abstracts.CustomerRepository;
import com.turkcell.CustomerService.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    @Override
    public CreatedCustomerResponse add(CreatedCustomerRequest createdCustomerRequest) {
        //TODO: Kontrol yapısı kurmalıyız daha önce olup olmadığı kontrolü
        Customer customer = this.modelMapperService.forRequest().map(createdCustomerRequest,Customer.class);
        customer.setCreatedDate(LocalDateTime.now());
        Customer createdCustomer = customerRepository.save(customer);
        CreatedCustomerResponse createdCustomerResponse = this.modelMapperService.forResponse().map(createdCustomer,CreatedCustomerResponse.class);
        return createdCustomerResponse;

    }

    @Override
    public UpdatedCustomerResponse update(UptatedCustomerRequest uptatedCustomerRequest) {
        //TODO: createddate ve nationalyNo için iş kuralı yazılacak, veritabanında bunları null yapmayacak
        Customer customer = this.modelMapperService.forRequest().map(uptatedCustomerRequest,Customer.class);
        customer.setUpdatedDate(LocalDateTime.now());
        Customer updatedCustomer = customerRepository.save(customer);
        UpdatedCustomerResponse updatedCustomerResponse = this.modelMapperService.forResponse().map(updatedCustomer,UpdatedCustomerResponse.class);
        return updatedCustomerResponse;
    }

    @Override
    public GetCustomerResponse getById(int id) {
        Optional<Customer> foundCustomer = customerRepository.findById(id);
        if (foundCustomer.isPresent()) {
            GetCustomerResponse getCustomerResponse = modelMapperService.forResponse().map(foundCustomer.get(), GetCustomerResponse.class);
            return getCustomerResponse;
        } else {

            throw new RuntimeException("Müşteri bulunamadı");
        }
    }

    @Override
    public List<GetAllCustomerResponse> getAll() {
        List<Customer> customers = customerRepository.findAll();
        List<GetAllCustomerResponse> getAllCustomerResponses = new ArrayList<GetAllCustomerResponse>();
        for (var customer : customers){
            GetAllCustomerResponse getAllCustomerResponse = this.modelMapperService.forResponse().map(customer,GetAllCustomerResponse.class);
            getAllCustomerResponses.add(getAllCustomerResponse);
        }
        return getAllCustomerResponses;
    }

    @Override
    public void delete(int id) {
        Optional<Customer> foundCustomer = customerRepository.findById(id);
        if (foundCustomer.isPresent()) {
            customerRepository.delete(foundCustomer.get());
        } else {

            throw new RuntimeException("Müşteri bulunamadı");
        }
    }
}
