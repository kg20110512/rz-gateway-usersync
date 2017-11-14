package com.gateway.rz.usersync.repository;

import com.gateway.rz.usersync.entity.Org;
import com.gateway.rz.usersync.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryRestResource(exported = false)
public interface OrgRepository extends JpaRepository<Org, String> {

    @Query("select t from Org t where ssystemcode = ?1 and state = ?2")
    List<Person> findBySystemcodeAndState(String systemcode, String state);

    @Modifying
    @Transactional
    @Query("update Org set state = ?2 where sid = ?1 ")
    int setState(String sid, String state);

}
