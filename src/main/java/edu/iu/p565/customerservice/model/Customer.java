package edu.iu.p565.customerservice.model;

public class Customer {

    private int id;
    private String name;
    private String email;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void add(Customer customer) {
    }

    public int size() {
        return 0;
    }
    
}
