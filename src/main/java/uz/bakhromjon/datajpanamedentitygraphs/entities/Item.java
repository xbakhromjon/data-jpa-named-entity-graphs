package uz.bakhromjon.datajpanamedentitygraphs.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Item {

    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private List<Characteristic> characteristics = new ArrayList<>();

    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

