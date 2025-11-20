package com.example.Equipamento.Repository;

import com.example.Equipamento.Model.EquipModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipRepository extends JpaRepository<EquipModel, Long> {
}
