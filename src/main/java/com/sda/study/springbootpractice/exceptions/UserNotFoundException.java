package com.sda.study.springbootpractice.exceptions;

/**
 * @author Bahadir Tasli
 * @Date 3/21/2023
 */
public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String username) {
        super(String.format("User not found for username: %s!", username));
    }
}
