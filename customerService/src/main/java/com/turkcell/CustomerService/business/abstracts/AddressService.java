package com.turkcell.CustomerService.business.abstracts;

import com.turkcell.CustomerService.business.dtos.request.create.CreatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.request.update.UptatedCustomerRequest;
import com.turkcell.CustomerService.business.dtos.response.create.CreatedCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.get.GetCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.getAll.GetAllCustomerResponse;
import com.turkcell.CustomerService.business.dtos.response.updated.UpdatedCustomerResponse;

import java.util.List;

public interface AddressService {
    CreatedCustomerResponse add(CreatedCustomerRequest createdCustomerRequest);

    UpdatedCustomerResponse update(UptatedCustomerRequest uptatedCustomerRequest);

    GetCustomerResponse getById(int id);

    List<GetAllCustomerResponse> getAll();

    void delete(int id);
}
