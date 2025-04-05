package com.codedecode.foodcatalogue.mapper;

import com.codedecode.foodcatalogue.dto.FoodItemsDTO;
import com.codedecode.foodcatalogue.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDTOtoFoodItem(FoodItemsDTO foodItemsDTO);

    FoodItemsDTO mapFoodItemToFoodItemDTO(FoodItem foodItem);
}
