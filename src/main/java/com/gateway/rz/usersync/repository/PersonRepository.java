package com.gateway.rz.usersync.repository;

import com.gateway.rz.usersync.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryRestResource(exported = false)
public interface PersonRepository extends JpaRepository<Person, String> {


    @Query("select t from Person t where ssystemcode = ?1 and state = ?2")
    List<Person> findBySystemcodeAndState(String systemcode, String state);

    @Modifying
    @Transactional
    @Query("update Person set state = ?2 where sid = ?1 ")
    int setState(String sid, String state);
}
