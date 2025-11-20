package com.example.Equipamento.Service;

import com.example.Equipamento.Model.EquipModel;

import java.util.List;
import java.util.Optional;

public interface EquipService {

    EquipModel create(EquipModel equipment);

    List<EquipModel> findAll();

    Optional<EquipModel> findById(Long id);

    EquipModel update(Long id, EquipModel equipment);

    void delete(Long id);
}
