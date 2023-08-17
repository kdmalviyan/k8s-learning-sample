package com.sfd.k8s.expensesservice.repository;

import com.sfd.k8s.expensesservice.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kuldeep
 */
@Repository
public class ExpenseRepository {
    private final Map<Long, Expense> EXPENSES = new HashMap<>();
    public Expense save(final Expense expense) {
        EXPENSES.put(expense.getId(), expense);
        return expense;
    }

    public Collection<Expense> list() {
        return EXPENSES.values();
    }
}
