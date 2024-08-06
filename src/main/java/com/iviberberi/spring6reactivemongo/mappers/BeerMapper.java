package com.iviberberi.spring6reactivemongo.mappers;

import com.iviberberi.spring6reactivemongo.domain.Beer;
import com.iviberberi.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
