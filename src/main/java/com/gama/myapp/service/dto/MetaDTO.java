package com.gama.myapp.service.dto;

import com.gama.myapp.domain.enumeration.AreaDoEnem;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.gama.myapp.domain.Meta} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class MetaDTO implements Serializable {

    private Long id;

    @NotNull
    private AreaDoEnem area;

    @NotNull
    private Float nota;

    private AlunoDTO metas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AreaDoEnem getArea() {
        return area;
    }

    public void setArea(AreaDoEnem area) {
        this.area = area;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public AlunoDTO getMetas() {
        return metas;
    }

    public void setMetas(AlunoDTO metas) {
        this.metas = metas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaDTO)) {
            return false;
        }

        MetaDTO metaDTO = (MetaDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, metaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MetaDTO{" +
            "id=" + getId() +
            ", area='" + getArea() + "'" +
            ", nota=" + getNota() +
            ", metas=" + getMetas() +
            "}";
    }
}
