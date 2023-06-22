package com.khaledachech.scuttleback.model.storage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROJECT")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString @EqualsAndHashCode
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 120)
    private String briefDescription;

    @Column(length = 250)
    private String longDescription;

    // will hold 0 for public and 1 for private
    @Column
    private int visibility;

    @JsonIgnore
    @OneToMany(mappedBy = "project", cascade=CascadeType.ALL)
    List<Document> documents = new ArrayList<>();

}