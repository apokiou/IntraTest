package com.example.Intrasoft.repo;

import com.example.Intrasoft.data.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId);
    List<Transaction> findByAccountIdAndTypeAndTransactionDateAfter(Long accountId, String type, LocalDateTime date);
}
