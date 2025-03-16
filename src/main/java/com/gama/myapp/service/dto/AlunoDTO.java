package com.gama.myapp.service.dto;

import com.gama.myapp.domain.Meta;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link com.gama.myapp.domain.Aluno} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AlunoDTO implements Serializable {

    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String sobreNome;

    private String email;

    private String cursoPretendido;

    private Set<Meta> metas;

    public Set<Meta> getMetas() {
        return metas;
    }

    public void setMetas(Set<Meta> metas) {
        this.metas = metas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCursoPretendido() {
        return cursoPretendido;
    }

    public void setCursoPretendido(String cursoPretendido) {
        this.cursoPretendido = cursoPretendido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlunoDTO)) {
            return false;
        }

        AlunoDTO alunoDTO = (AlunoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, alunoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AlunoDTO{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", sobreNome='" + getSobreNome() + "'" +
            ", email='" + getEmail() + "'" +
            ", cursoPretendido='" + getCursoPretendido() + "'" +
            "}";
    }
}
