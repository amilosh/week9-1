package by.milosh.mapper;

import by.milosh.model.Attribute;
import by.milosh.model.Item;
import by.milosh.model.Language;
import by.milosh.model.dto.ItemDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemMapper {

    private static final ItemMapper INSTANCE = new ItemMapper();

    public static ItemMapper getInstance() {
        return INSTANCE;
    }

    public ItemDto toDto(Item item, Language language) {
        return ItemDto.builder()
                .itemName(getItemNameByLanguage(item, language))
                .attributeNames(getAttributeNamesByLanguage(item, language))
                .build();
    }

    private String getItemNameByLanguage(Item item, Language language) {
        String itemName;
        switch (language) {
            case EN:
                itemName = item.getNameEn();
                break;
            case RU:
                itemName = item.getNameRu();
                break;
            default:
                itemName = "";
        }
        return itemName;
    }

    private Set<String> getAttributeNamesByLanguage(Item item, Language language) {
        Set<Attribute> attributes = item.getAttributes();
        Set<String> attributeNames;
        switch (language) {
            case EN:
                attributeNames = attributes.stream().map(a -> a.getNameEn()).collect(Collectors.toSet());
                break;
            case RU:
                attributeNames = attributes.stream().map(a -> a.getNameRU()).collect(Collectors.toSet());
                break;
            default:
                attributeNames = new HashSet<>();
        }
        return attributeNames;
    }
}
