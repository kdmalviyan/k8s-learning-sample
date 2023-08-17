package com.sfd.k8s.expensesservice.service;

import com.sfd.k8s.expensesservice.model.Expense;
import com.sfd.k8s.expensesservice.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author kuldeep
 */
@Service
@RequiredArgsConstructor
public class ExpenseService {
    private static final AtomicLong COUNTER = new AtomicLong(0);
    private final ExpenseRepository repository;
    public Expense save(final Expense expense) {
        Long id = COUNTER.addAndGet(1);
        expense.setId(id);
        return repository.save(expense);
    }

    public Collection<Expense> list() {
        return repository.list();
    }
}
