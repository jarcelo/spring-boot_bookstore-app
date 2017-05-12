package com.jarcelo.henrybooks.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InventoryDao extends CrudRepository<Inventory, Long> {

}
