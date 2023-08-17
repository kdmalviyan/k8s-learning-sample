package com.sfd.k8s.expensesservice.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kuldeep
 */
@Data
public class Expense {
    private Long id;
    private String comment;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private double amount;
    private String category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense expense = (Expense) o;

        if (getId() != null ? !getId().equals(expense.getId()) : expense.getId() != null) return false;
        return getCategory() != null ? getCategory().equals(expense.getCategory()) : expense.getCategory() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        return result;
    }
}
