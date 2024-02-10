package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")

public class studentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @Column(unique = true, nullable = false)
    private String email;

    //Essa linha refere-se a cardinalidade do estudante com o certificado, neste caso 1n ou One to Many pois um estudante pode ter mais de 1 certificação.

    @OneToMany(mappedBy = "StudentEntity")
    private List<CertificationStudentEntity> certificationStudentEntity;
    
}
