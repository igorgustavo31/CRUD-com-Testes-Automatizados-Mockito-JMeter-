package com.example.Equipamento.Service;

import com.example.Equipamento.Model.EquipModel;
import com.example.Equipamento.Repository.EquipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipServiceImpl implements EquipService {

    @Autowired
    private EquipRepository equipRepository;

    @Override
    public EquipModel create(EquipModel equipment) {
        return equipRepository.save(equipment);
    }

    @Override
    public List<EquipModel> findAll() {
        return equipRepository.findAll();
    }

    @Override
    public Optional<EquipModel> findById(Long id) {
        return equipRepository.findById(id);
    }

    @Override
    public EquipModel update(Long id, EquipModel equipment) {
        Optional<EquipModel> existing = equipRepository.findById(id);

        if (existing.isPresent()) {
            EquipModel updated = existing.get();
            updated.setDescricao(equipment.getDescricao());
            updated.setValor(equipment.getValor());
            updated.setTipoEquipamento(equipment.getTipoEquipamento());
            updated.setMarca(equipment.getMarca());
            return equipRepository.save(updated);
        } else {
            throw new RuntimeException("Equipamento não encontrado com ID: " + id);
        }
    }

    @Override
    public void delete(Long id) {
        if (equipRepository.existsById(id)) {
            equipRepository.deleteById(id);
        } else {
            throw new RuntimeException("Equipamento não encontrado com ID: " + id);
        }
    }
}
