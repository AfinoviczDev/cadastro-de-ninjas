package dev.afinovicz.CadastroDeNinjas.ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<Ninja> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar ninja por id
    public Ninja listarNinjaPorId(Long id) {
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    // Criar um novo ninja
    public Ninja criarNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
}
