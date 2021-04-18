package com.example.db_html_rest.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "customer")
public class Customer {

    @Id
    @Getter
    @Setter
    int ID;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    int age;

    public Customer() {

    }

    public Customer(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
