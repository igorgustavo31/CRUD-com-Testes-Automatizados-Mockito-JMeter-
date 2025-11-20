package com.example.Equipamento.Controller;

import com.example.Equipamento.Model.EquipModel;
import com.example.Equipamento.Service.EquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipController {

    @Autowired
    private EquipService equipService;

    // Criar equipamento
    @PostMapping
    public ResponseEntity<EquipModel> create(@RequestBody EquipModel equipment) {
        EquipModel saved = equipService.create(equipment);
        return ResponseEntity.ok(saved);
    }

    // Listar todos os equipamentos
    @GetMapping
    public ResponseEntity<List<EquipModel>> findAll() {
        List<EquipModel> list = equipService.findAll();
        return ResponseEntity.ok(list);
    }

    // Buscar equipamento por ID
    @GetMapping("/{id}")
    public ResponseEntity<EquipModel> findById(@PathVariable Long id) {
        return equipService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar equipamento
    @PutMapping("/{id}")
    public ResponseEntity<EquipModel> update(@PathVariable Long id, @RequestBody EquipModel equipment) {
        try {
            EquipModel updated = equipService.update(id, equipment);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Excluir equipamento
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            equipService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
