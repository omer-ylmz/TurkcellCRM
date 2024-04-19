package com.turkcell.CustomerService.api.controllers;

import com.turkcell.CustomerService.business.abstracts.CustomerService;
import com.turkcell.CustomerService.business.dtos.request.create.CreatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.request.update.UptatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.response.create.CreatedCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.get.GetCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.getAll.GetAllCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.updated.UpdatedCustomerResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customerservice/api/v1/customers")
public class CustomersController {

    private CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCustomerResponse add(@Valid @RequestBody CreatedCustomerRequest createdCustomerRequest) {
        return customerService.add(createdCustomerRequest);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedCustomerResponse update(@Valid @RequestBody UptatedCustomerRequest uptatedCustomerRequest) {
        return customerService.update(uptatedCustomerRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetCustomerResponse getById(@PathVariable int id){
        return customerService.getById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllCustomerResponse> getAll(){
        return customerService.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void delete(@PathVariable int id){
        customerService.delete(id);
    }


}
