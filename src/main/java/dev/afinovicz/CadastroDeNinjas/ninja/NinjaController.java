package dev.afinovicz.CadastroDeNinjas.ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<Ninja> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas!";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Procurar Ninja por ID (READ)
    @GetMapping("/todosid")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar ninja por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarid")
    public String alterarNinjaPorId() {
        return "Alterar ninja por id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarid")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }
}
