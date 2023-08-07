package com.example.employeeapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "wage")
    private Integer wage;

    public Employee(Integer id, String name, Integer wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public Employee( String name, Integer wage) {
        this.name = name;
        this.wage = wage;
    }
}
