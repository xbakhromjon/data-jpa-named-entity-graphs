package uz.bakhromjon.datajpanamedentitygraphs.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.bakhromjon.datajpanamedentitygraphs.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @EntityGraph(attributePaths = {"characteristics"})
    Item findByName(String name);
}

