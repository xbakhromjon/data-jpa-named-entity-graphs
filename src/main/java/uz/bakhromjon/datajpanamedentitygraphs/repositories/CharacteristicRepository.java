package uz.bakhromjon.datajpanamedentitygraphs.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.datajpanamedentitygraphs.entities.Characteristic;

import java.util.Optional;

@Repository
public interface CharacteristicRepository extends JpaRepository<Characteristic, Long> {
    @EntityGraph(attributePaths = {"item"})
    Optional<Characteristic> findById(Long id);

}
