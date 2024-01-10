package com.rafaelsantos.bankaccount.service;

import com.rafaelsantos.bankaccount.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
