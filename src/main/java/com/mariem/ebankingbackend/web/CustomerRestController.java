package com.mariem.ebankingbackend.web;

import com.mariem.ebankingbackend.dtos.CustomerDTO;
import com.mariem.ebankingbackend.exceptions.CustomerNotFoundException;
import com.mariem.ebankingbackend.services.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerRestController {
    private BankAccountService bankAccountService;

    @GetMapping(path = "/customers")
    public List<CustomerDTO> customers(){
        return bankAccountService.listCustomers();
    }

    @GetMapping(path = "/customers/{id}")
    public CustomerDTO getCustomer(@PathVariable(name = "id") Long customerId) throws CustomerNotFoundException {
        return bankAccountService.getCustomer(customerId);
    }


    @PostMapping(path = "/customers")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO request){
        return bankAccountService.saveCustomer(request);
    }

    @PutMapping(path = "/customers/{id}")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO,
                                    @PathVariable(name = "id") Long customerId){
        customerDTO.setId(customerId);
        return bankAccountService.saveCustomer(customerDTO);
    }

    @DeleteMapping(path = "/customers/{id}")
    public void deleteCustomer(@PathVariable(name = "id") Long customerId){
        bankAccountService.deleteCustomer(customerId);
    }
}
