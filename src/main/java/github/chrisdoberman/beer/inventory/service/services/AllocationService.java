package github.chrisdoberman.beer.inventory.service.services;

import github.chrisdoberman.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
