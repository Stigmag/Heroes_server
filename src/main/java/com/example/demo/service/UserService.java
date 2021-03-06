package com.example.demo.service;



import com.example.demo.game.User;
import com.example.demo.db.entity.UserTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

   UserTable save(UserTable user);


   Optional<UserTable> getByLogin(int user);

    void delete(int id);

    List<UserTable> getAll();



}
