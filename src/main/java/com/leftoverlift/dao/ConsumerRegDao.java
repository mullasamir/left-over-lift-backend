package com.leftoverlift.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leftoverlift.entity.Consumers;

public interface ConsumerRegDao extends JpaRepository<Consumers, Integer> {

	Optional<Consumers> findByEmail(String email);

}
