package com.sda.study.springbootpractice.handlers;

import com.sda.study.springbootpractice.utils.Constants;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @author Bahadir Tasli
 * @Date 3/15/2023
 */
public class AuditAwareHandler implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() /*Set the value for CreatedBy & Lastmodified by*/ {
        return Optional.of(Constants.Audit.DEFAULT_AUDITOR);
    }
}
