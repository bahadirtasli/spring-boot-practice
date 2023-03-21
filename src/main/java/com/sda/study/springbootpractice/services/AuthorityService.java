package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.AuthorityNotFoundException;
import com.sda.study.springbootpractice.models.Authority;

import java.util.List;

/**
 * @author Bahadir Tasli
 * @Date 3/21/2023
 */
public interface AuthorityService {
    /**
     * To fina all authorities
     *
     * @return a list of authorities
     */
    List<Authority> findAllAuthorities();

    /**
     * To find authority by name
     *
     * @param name Authority name
     * @return Authority
     */
    Authority findAuthorityByName(String name) throws AuthorityNotFoundException;

    /**
     * To create a new authority
     *
     * @param authority Authority
     */
    void createAuthority(Authority authority);
}
