package com.ecommerce.catalog_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToOne //esto es para indicar que es una relación de muchos a uno
    @JoinColumn(name = "category_id") //esto es para indicar que se va a relacionar con la columna category_id
    @JsonBackReference //esto es para evitar que se genere un loop infinito al momento de hacer la serialización
    private Category category;

    private Double price;
    private Integer stock;

}
