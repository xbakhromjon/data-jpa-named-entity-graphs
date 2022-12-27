package uz.bakhromjon.datajpanamedentitygraphs.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Characteristic {

    @Id
    private Long id;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;


    public Characteristic(Long id, String type, Item item) {
        this.id = id;
        this.type = type;
        this.item = item;
    }
}