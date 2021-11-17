package es.urjc.code.ejem1.domain.repository;

import es.urjc.code.ejem1.domain.dto.FullShoppingCartDTO;

public interface ShoppingCartRepository {
	FullShoppingCartDTO findById(Long id);

	FullShoppingCartDTO save(FullShoppingCartDTO shoppingCart);

	void deleteById(Long id);
	
}
