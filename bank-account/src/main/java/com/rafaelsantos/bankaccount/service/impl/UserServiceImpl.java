package com.rafaelsantos.bankaccount.service.impl;

import com.rafaelsantos.bankaccount.domain.model.User;
import com.rafaelsantos.bankaccount.domain.repository.UserRepository;
import com.rafaelsantos.bankaccount.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
       if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
           throw new IllegalArgumentException("This account number already exists");
       }
        return userRepository.save(userToCreate);
    }
}
