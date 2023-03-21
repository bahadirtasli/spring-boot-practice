package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Bahadir Tasli
 * @Date 3/21/2023
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}
