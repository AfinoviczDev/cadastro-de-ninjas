package dev.afinovicz.CadastroDeNinjas.missoes;

import dev.afinovicz.CadastroDeNinjas.ninja.Ninja;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<Missoes> listarMissoes() {
        return missoesRepository.findAll();
    }

    public Missoes listarMissoesById(Long id) {
        Optional<Missoes> missoes = missoesRepository.findById(id);
        return missoes.orElse(null);
    }

    public Missoes criarMissao(Missoes missao) {
        return missoesRepository.save(missao);
    }

    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }

}
