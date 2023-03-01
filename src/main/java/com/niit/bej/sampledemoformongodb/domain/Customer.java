package com.niit.bej.sampledemoformongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Customer {
    @Id
    private int custID;
    private String custName;
    private String custEmailId;
    private Address custAddress;

    private String custType;

    public Customer() {
    }

    public Customer(int custID, String custName, String custEmailId, Address custAddress, String custType) {
        this.custID = custID;
        this.custName = custName;
        this.custEmailId = custEmailId;
        this.custAddress = custAddress;
        this.custType = custType;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public Address getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(Address custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custID == customer.custID && Objects.equals(custName, customer.custName) && Objects.equals(custEmailId, customer.custEmailId) && Objects.equals(custAddress, customer.custAddress) && Objects.equals(custType, customer.custType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custID, custName, custEmailId, custAddress, custType);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custEmailId='" + custEmailId + '\'' +
                ", custAddress=" + custAddress +
                ", custType='" + custType + '\'' +
                '}';
    }
}
