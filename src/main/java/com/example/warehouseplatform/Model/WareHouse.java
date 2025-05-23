package com.example.warehouseplatform.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class WareHouse {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @NotEmpty(message = "Please enter store type")
    @Pattern(regexp = "refrigerated|closed|open")
    @Column(columnDefinition = "VARCHAR(25) NOT NULL")
    private String storeType;


    @NotEmpty(message = "the store type should not be null")
    @Pattern(regexp = "^(?i)(Small|Medium|Large)$")
    @Column(columnDefinition = "varchar(30) not null")
    private String storeSize;


    @NotEmpty(message = "the location should not be empty")
    @Size(max = 20, message = "the location should be 30 character maximum ")
    @Column(columnDefinition = "varchar(30) not null")
    private String location;

    /// in square meters m^2

    @NotNull(message = "the Storage Area should not be empty")
    @Positive(message = "the Storage Area should be a correct number in square meters ")
    @Min(value = 100, message = "the minimum Storage Area allowed is 100 m^2")
    @Column(columnDefinition = "int not null ")
    private Integer storageArea;


    /// per day
    @NotNull(message = "the price should not be empty")
    @Positive(message = "the Price  should be a correct number ")
    @Min(value = 100, message = "the minimum price for a day is 500 SAR")
    @Column(columnDefinition = "int not null ")
    private Integer price;




    private Integer usageCount=0;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wareHouse")
    private Set<Request> requests;

    @ManyToOne
    @JoinColumn(name = "storage_provider_id", referencedColumnName = "id")
    @JsonIgnore
    private StorageProvider storageProvider;

}
