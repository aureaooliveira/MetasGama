package com.gama.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gama.myapp.domain.enumeration.AreaDoEnem;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;

/**
 * A Meta.
 */
@Entity
@Table(name = "meta")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "area", nullable = false)
    private AreaDoEnem area;

    @NotNull
    @Column(name = "nota", nullable = false)
    private Float nota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "metas" }, allowSetters = true)
    private Aluno metas;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Meta id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AreaDoEnem getArea() {
        return this.area;
    }

    public Meta area(AreaDoEnem area) {
        this.setArea(area);
        return this;
    }

    public void setArea(AreaDoEnem area) {
        this.area = area;
    }

    public Float getNota() {
        return this.nota;
    }

    public Meta nota(Float nota) {
        this.setNota(nota);
        return this;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public Aluno getMetas() {
        return this.metas;
    }

    public void setMetas(Aluno aluno) {
        this.metas = aluno;
    }

    public Meta metas(Aluno aluno) {
        this.setMetas(aluno);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Meta)) {
            return false;
        }
        return getId() != null && getId().equals(((Meta) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Meta{" +
            "id=" + getId() +
            ", area='" + getArea() + "'" +
            ", nota=" + getNota() +
            "}";
    }
}
