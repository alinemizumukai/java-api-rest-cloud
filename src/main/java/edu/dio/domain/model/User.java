package edu.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Destination> destination;
    @OneToOne(cascade = CascadeType.ALL)
    private Budget budget;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Expense> expense;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Destination> getDestination() {
        return destination;
    }

    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public List<Expense> getExpense() {
        return expense;
    }

    public void setExpense(List<Expense> expense) {
        this.expense = expense;
    }
}
