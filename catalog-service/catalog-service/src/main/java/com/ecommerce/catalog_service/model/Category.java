package com.ecommerce.catalog_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL) //CascadeType.ALL es para que si se elimina una categoría se eliminen todos los productos asociados a ella
    //o también si se actualiza una categoría se actualicen todos los productos asociados a ella
    @JsonBackReference
    private List<Product> products;

}
