package com.damul.api.auth.repository;

import com.damul.api.auth.entity.Terms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TermsRepository extends JpaRepository<Terms, Long> {
    List<Terms> findAll();
}
