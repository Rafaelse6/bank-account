package com.rafaelsantos.bankaccount.domain.repository;

import com.rafaelsantos.bankaccount.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
