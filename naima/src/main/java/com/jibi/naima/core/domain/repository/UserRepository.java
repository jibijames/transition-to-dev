package com.jibi.naima.core.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jibi.naima.core.domain.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
