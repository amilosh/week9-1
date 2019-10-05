package by.milosh.repository;

import by.milosh.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByCode(Integer code);
}
