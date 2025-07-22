package io.github.attonic.library.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "livro")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "isbn", length = 20, nullable = false)
    private String isbn;

    @Column(name = "titulo", length = 150,nullable = false)
    private String titulo;

    @Column(name = "data_publicaco", nullable = false)
    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero", nullable = false)
    private GeneroLivro genero;

    @Column(name = "preco", precision = 18, scale = 2)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;



}
