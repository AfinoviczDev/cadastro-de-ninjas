package dev.afinovicz.CadastroDeNinjas.missoes;

import dev.afinovicz.CadastroDeNinjas.ninja.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;


    // Uma missao pode ter varios ninjas associados
    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninja;



}
