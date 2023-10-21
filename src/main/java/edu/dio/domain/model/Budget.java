package edu.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity( name = "tb_budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name = "additional_limit",precision = 2, scale = 13)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
