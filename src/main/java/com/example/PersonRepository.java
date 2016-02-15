package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brian Casteel on 2/13/2016.
 */
public interface PersonRepository extends CrudRepository<Person, String> {
    Person findByName(String name);
    Iterable<Person> findByTeammatesName(String name);
}
