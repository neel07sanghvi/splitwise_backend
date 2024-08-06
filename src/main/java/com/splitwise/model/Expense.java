package com.splitwise.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    private String description;

    @ManyToOne
    @JoinColumn(name = "paid_by_user_id", nullable = false)
    private User paidBy;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @ElementCollection
    @CollectionTable(name = "expense_splits", joinColumns = @JoinColumn(name = "expensie_id"))
    @MapKeyJoinColumn(name = "user_id")
    @Column(name = "amount")
    private Map<User, BigDecimal> splits;

    private LocalDate createdAt;
}
