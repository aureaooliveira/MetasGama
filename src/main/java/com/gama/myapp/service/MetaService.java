package com.gama.myapp.service;

import com.gama.myapp.service.dto.MetaDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.gama.myapp.domain.Meta}.
 */
public interface MetaService {
    /**
     * Save a meta.
     *
     * @param metaDTO the entity to save.
     * @return the persisted entity.
     */
    MetaDTO save(MetaDTO metaDTO);

    /**
     * Updates a meta.
     *
     * @param metaDTO the entity to update.
     * @return the persisted entity.
     */
    MetaDTO update(MetaDTO metaDTO);

    /**
     * Partially updates a meta.
     *
     * @param metaDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<MetaDTO> partialUpdate(MetaDTO metaDTO);

    /**
     * Get all the metas.
     *
     * @return the list of entities.
     */
    List<MetaDTO> findAll();

    /**
     * Get the "id" meta.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<MetaDTO> findOne(Long id);

    /**
     * Delete the "id" meta.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
