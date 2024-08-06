package com.iviberberi.spring6reactivemongo.mappers;

import com.iviberberi.spring6reactivemongo.domain.Customer;
import com.iviberberi.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
