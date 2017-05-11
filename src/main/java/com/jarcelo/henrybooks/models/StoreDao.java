package com.jarcelo.henrybooks.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StoreDao extends CrudRepository<Store, Long> {

}
