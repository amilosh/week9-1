package by.milosh.service;

import by.milosh.model.dto.ItemDto;
import by.milosh.model.dto.ItemRequestDto;

public interface ItemService {

    ItemDto findByCodeAndLanguage(ItemRequestDto itemRequestDto);
}
