package com.leftoverlift.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leftoverlift.entity.Vendors;

public interface BusinessRegDao extends JpaRepository<Vendors, Integer> {

	Optional<Vendors> findByEmail(String email);
}
