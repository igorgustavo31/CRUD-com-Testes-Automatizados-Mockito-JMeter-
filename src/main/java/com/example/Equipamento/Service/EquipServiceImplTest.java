package com.example.Equipamento.Service;

import com.example.Equipamento.Model.EquipModel;
import com.example.Equipamento.Repository.EquipRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EquipServiceImplTest {

    @Mock
    private EquipRepository equipRepository;

    @InjectMocks
    private EquipServiceImpl equipService;

    private EquipModel equipamento;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        equipamento = new EquipModel();
        equipamento.setId(1L);
        equipamento.setDescricao("Furadeira");
        equipamento.setValor(350.0);
        equipamento.setTipoEquipamento("Elétrico");
        equipamento.setMarca("Bosch");
    }

    @Test
    void testCreate() {
        when(equipRepository.save(any(EquipModel.class))).thenReturn(equipamento);

        EquipModel criado = equipService.create(equipamento);

        assertNotNull(criado);
        assertEquals("Furadeira", criado.getDescricao());
        verify(equipRepository, times(1)).save(any(EquipModel.class));
    }

    @Test
    void testFindAll() {
        when(equipRepository.findAll()).thenReturn(List.of(equipamento));

        List<EquipModel> lista = equipService.findAll();

        assertEquals(1, lista.size());
        assertEquals("Furadeira", lista.get(0).getDescricao());
        verify(equipRepository, times(1)).findAll();
    }

    @Test
    void testFindById() {
        when(equipRepository.findById(1L)).thenReturn(Optional.of(equipamento));

        Optional<EquipModel> encontrado = equipService.findById(1L);

        assertNotNull(encontrado);
        assertEquals(1L, encontrado.get().getId()); // ✅ Aqui está a correção
        assertEquals("Furadeira", encontrado.get().getDescricao());
        verify(equipRepository, times(1)).findById(1L);
    }
    @Test
    void testUpdate() {
        EquipModel atualizado = new EquipModel(1L, "Furadeira Industrial", 500.0, "Elétrico", "Bosch");

        when(equipRepository.findById(1L)).thenReturn(Optional.of(equipamento));
        when(equipRepository.save(any(EquipModel.class))).thenReturn(atualizado);

        EquipModel resultado = equipService.update(1L, atualizado);

        assertEquals("Furadeira Industrial", resultado.getDescricao());
        assertEquals(500.0, resultado.getValor());
        verify(equipRepository, times(1)).save(any(EquipModel.class));
    }

    @Test
    void testDelete() {
        when(equipRepository.existsById(1L)).thenReturn(true);

        equipService.delete(1L);

        verify(equipRepository, times(1)).deleteById(1L);
    }

    @Test
    void testDeleteNotFound() {
        when(equipRepository.existsById(1L)).thenReturn(false);

        assertThrows(RuntimeException.class, () -> equipService.delete(1L));
        verify(equipRepository, never()).deleteById(1L);
    }
}
