package com.example.demo.dto;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id = (long) 1;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;

}
