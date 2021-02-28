package com.crud.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
