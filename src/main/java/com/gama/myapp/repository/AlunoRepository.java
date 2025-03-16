package com.gama.myapp.repository;

import com.gama.myapp.domain.Aluno;
import java.util.Optional;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Aluno entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @EntityGraph(attributePaths = "metas") // Força o carregamento das metas
    Optional<Aluno> findOneWithMetasById(Long id);
}
