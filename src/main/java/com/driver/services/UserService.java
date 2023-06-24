package com.driver.services;

import com.driver.model.User;

public interface UserService {

    public User subscribe(Integer userId, Integer serviceProviderId);

    public User register(String username, String password, String countryName) throws Exception;
}