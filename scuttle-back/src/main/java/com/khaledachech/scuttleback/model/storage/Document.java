package com.khaledachech.scuttleback.model.storage;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DOCUMENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 10)
    private String extension;

    @Enumerated(EnumType.STRING)
    @Column
    private DocsType type;

    // will hold 0 for public and 1 for private
    @Column
    private int visibility;

    @ManyToOne
    private Project project;

    public enum DocsType { IMAGE, FILE, FOLDER, BIN, DATA, OBJECT }
}
