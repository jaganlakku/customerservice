package edu.iu.p565.customerservice.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import edu.iu.p565.customerservice.model.*;

@Repository
public class CustomerRepository {
    private List<Customer> customers=new ArrayList<>();

    public List<Customer> findAll(){
        return customers;
    }

    public int create(Customer customer){
        int id = customer.size()+1;
        customer.setId(id);
        customer.add(customer);
        return id;
    }
    
}
