package com.sda.study.springbootpractice.exceptions;

/**
 * @author Bahadir Tasli
 * @Date 3/21/2023
 */
public class AuthorityNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public AuthorityNotFoundException(String name) {
        super(String.format("Authority not found for name: %s", name));
    }
}
