package com.pfa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private Date dataCadastro;
}
