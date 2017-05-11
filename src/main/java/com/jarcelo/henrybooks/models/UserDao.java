package com.jarcelo.henrybooks.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Double>{

}
