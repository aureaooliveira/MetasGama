package com.gama.myapp.service.mapper;

import static com.gama.myapp.domain.AlunoAsserts.*;
import static com.gama.myapp.domain.AlunoTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoMapperTest {

    private AlunoMapper alunoMapper;

    @BeforeEach
    void setUp() {
        alunoMapper = new AlunoMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getAlunoSample1();
        var actual = alunoMapper.toEntity(alunoMapper.toDto(expected));
        assertAlunoAllPropertiesEquals(expected, actual);
    }
}
