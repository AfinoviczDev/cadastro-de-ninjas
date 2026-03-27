package dev.afinovicz.CadastroDeNinjas.ninja;
import dev.afinovicz.CadastroDeNinjas.missoes.Missoes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String rank;
    private String imgUrl;
    private Integer idade;
    private Missoes missao;
}
