package uz.bakhromjon.datajpanamedentitygraphs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.bakhromjon.datajpanamedentitygraphs.entities.Characteristic;
import uz.bakhromjon.datajpanamedentitygraphs.entities.Item;
import uz.bakhromjon.datajpanamedentitygraphs.repositories.CharacteristicRepository;
import uz.bakhromjon.datajpanamedentitygraphs.repositories.ItemRepository;

import java.util.Optional;

@SpringBootApplication
public class DataJpaNamedEntityGraphsApplication implements CommandLineRunner {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CharacteristicRepository characteristicRepository;


    public static void main(String[] args) {
        SpringApplication.run(DataJpaNamedEntityGraphsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Item item = new Item(1L, "item");
        item = itemRepository.save(item);

        Characteristic char1 = new Characteristic(1L, "type", item);
        Characteristic char2 = new Characteristic(2L, "type", item);

        characteristicRepository.save(char1);
        characteristicRepository.save(char2);

        item = itemRepository.findByName("item");

        Optional<Characteristic> optionalCharacteristic = characteristicRepository.findById(1L);
        Characteristic characteristic = optionalCharacteristic.get();
    }
}
