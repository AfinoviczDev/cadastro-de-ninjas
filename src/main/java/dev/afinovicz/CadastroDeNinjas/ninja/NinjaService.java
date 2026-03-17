package dev.afinovicz.CadastroDeNinjas.ninja;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
