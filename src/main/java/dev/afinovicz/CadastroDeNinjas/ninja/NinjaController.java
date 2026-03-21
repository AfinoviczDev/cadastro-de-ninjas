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

    // Procurar Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public Ninja listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    @PostMapping("/criar")
    public Ninja criarNinja(@RequestBody Ninja ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }
 }
