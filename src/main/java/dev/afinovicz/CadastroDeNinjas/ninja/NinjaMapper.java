package dev.afinovicz.CadastroDeNinjas.ninja;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public Ninja map(NinjaDTO ninjaDTO) {
        Ninja ninja = new Ninja();
        ninja.setId(ninjaDTO.getId());
        ninja.setNome(ninjaDTO.getNome());
        ninja.setEmail(ninjaDTO.getEmail());
        ninja.setIdade(ninjaDTO.getIdade());
        ninja.setImgUrl(ninjaDTO.getImgUrl());
        ninja.setRank(ninjaDTO.getRank());
        ninja.setMissao(ninjaDTO.getMissao());
        return ninja;
    }

    public NinjaDTO map(Ninja ninja) {
        NinjaDTO dto = new NinjaDTO();
        dto.setId(ninja.getId());
        dto.setNome(ninja.getNome());
        dto.setEmail(ninja.getEmail());
        dto.setIdade(ninja.getIdade());
        dto.setImgUrl(ninja.getImgUrl());
        dto.setRank(ninja.getRank());
        dto.setMissao(ninja.getMissao());
        return dto;
    }
}
