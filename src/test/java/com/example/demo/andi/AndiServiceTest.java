package com.example.demo.andi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AndiServiceTest {

    @Mock
    private AndiRepository andiRepository;

    @InjectMocks
    private AndiService andiService;
    @Test
    void getAndis() {
        when(andiRepository.findAll()).thenReturn(List.of( new Andi(), new Andi()));
        assertEquals(2,andiService.getAndis().size());
        verify(andiRepository, times(1)).findAll();
        verifyNoMoreInteractions(andiRepository);
    }

    @Test
    void shouldAddNewAndi() {
        Andi andiToSave = new Andi("unique_email@example.com","Musa", "Yxel", "Endeavour", 1.3, "PD");
        andiService.addNewAndi(andiToSave);
        verify(andiRepository, times(1)).findAndiByEmail("unique_email@example.com");
        verify(andiRepository, times(1)).save(andiToSave);
        verifyNoMoreInteractions(andiRepository);
    }

    @Test
    void shouldThrowErrorWhenAddAndiWithDuplicateEmail() {
        Andi andiToSave = new Andi("duplicate_email@example.com","Musa", "Yxel", "Endeavour", 1.3, "PD");

        // setup mock to return non-empty optional when searching for duplicate email
        Andi existingAndi = new Andi("duplicate_email@example.com","Musa22", "Yxel", "Endeavour", 1.3, "PD");
        when(andiRepository.findAndiByEmail("duplicate_email@example.com")).thenReturn(Optional.of(existingAndi));

        assertThrows(IllegalStateException.class, () -> andiService.addNewAndi(andiToSave));
        verify(andiRepository, times(1)).findAndiByEmail("duplicate_email@example.com");
        verifyNoMoreInteractions(andiRepository);
    }

}