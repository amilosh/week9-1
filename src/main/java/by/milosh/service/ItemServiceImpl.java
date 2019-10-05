package by.milosh.service;

import by.milosh.mapper.ItemMapper;
import by.milosh.model.Item;
import by.milosh.model.dto.ItemDto;
import by.milosh.model.dto.ItemRequestDto;
import by.milosh.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemDto findByCodeAndLanguage(ItemRequestDto itemRequestDto) {
        Item item = itemRepository.findByCode(itemRequestDto.getCode());
        return ItemMapper.getInstance().toDto(item, itemRequestDto.getLanguage());
    }
}
