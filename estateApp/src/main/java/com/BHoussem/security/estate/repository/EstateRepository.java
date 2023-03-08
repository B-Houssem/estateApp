package com.BHoussem.security.estate.repository;

import com.BHoussem.security.estate.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstateRepository extends JpaRepository<Estate, Long> {

    List<Estate> findByType(String type);
}
