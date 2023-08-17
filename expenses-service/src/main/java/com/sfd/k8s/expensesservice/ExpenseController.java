package com.sfd.k8s.expensesservice;

import com.sfd.k8s.expensesservice.model.Expense;
import com.sfd.k8s.expensesservice.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author kuldeep
 */
@RestController
@RequestMapping(value = "expense")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService service;
    @PostMapping
    public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense) {
        return ResponseEntity.ok(service.save(expense));
    }

    @GetMapping
    public ResponseEntity<Collection<Expense>> getAll() {
        return ResponseEntity.ok(service.list());
    }
}
