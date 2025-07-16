package com.leftoverlift.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leftoverlift.entity.Consumers;

public interface ConsumerRegDao extends JpaRepository<Consumers, Integer> {

}
