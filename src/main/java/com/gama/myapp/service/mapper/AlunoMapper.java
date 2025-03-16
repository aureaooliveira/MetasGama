package com.gama.myapp.service.mapper;

import com.gama.myapp.domain.Aluno;
import com.gama.myapp.service.dto.AlunoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Aluno} and its DTO {@link AlunoDTO}.
 */
@Mapper(componentModel = "spring")
public interface AlunoMapper extends EntityMapper<AlunoDTO, Aluno> {}
