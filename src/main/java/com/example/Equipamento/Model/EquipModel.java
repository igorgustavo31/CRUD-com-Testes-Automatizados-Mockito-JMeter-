package com.example.Equipamento.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipamentos")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double valor;
    private String tipoEquipamento;
    private String marca;

}
