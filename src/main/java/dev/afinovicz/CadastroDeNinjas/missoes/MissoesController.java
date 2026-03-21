package dev.afinovicz.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public List<Missoes> listarMissoes() {
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public Missoes listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesById(id);
    }

    @PostMapping("/criar")
    public Missoes criarMissao(@RequestBody Missoes missao) {
        return missoesService.criarMissao(missao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id) {
        missoesService.deletarMissaoPorId(id);
    }
}
