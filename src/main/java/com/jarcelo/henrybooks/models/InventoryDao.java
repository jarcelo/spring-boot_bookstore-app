package com.jarcelo.henrybooks.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InventoryDao extends CrudRepository<Inventory, Long> {
	List<Inventory> findByStoreId(long storeId);
}
