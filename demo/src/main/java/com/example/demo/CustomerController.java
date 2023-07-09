package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController
{
    private final CustomerRepository customerRepository;



    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomers()
    {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(String name,
        String email,
        Integer age)
    {

        


    }
  

    @PostMapping()
    public void addCustomer(@RequestBody NewCustomerRequest request)
    {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }


    public void deleteCustomer(Integer id)
    {
        customerRepository.deleteById(id);
    }


}




