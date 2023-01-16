package com.example.demo.andi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

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
}