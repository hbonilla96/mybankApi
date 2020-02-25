package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistoryDTO, Long> {
}