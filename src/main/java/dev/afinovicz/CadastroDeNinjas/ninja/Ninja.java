package dev.afinovicz.CadastroDeNinjas.ninja;

import dev.afinovicz.CadastroDeNinjas.missoes.Missoes;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missao_id") // CHAVE ESTRANGEIRA
    private Missoes missao;
}
