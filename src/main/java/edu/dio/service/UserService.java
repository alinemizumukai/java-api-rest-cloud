package edu.dio.service;

import edu.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
