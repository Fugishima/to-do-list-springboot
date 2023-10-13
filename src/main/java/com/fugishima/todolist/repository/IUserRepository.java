package com.fugishima.todolist.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fugishima.todolist.model.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
