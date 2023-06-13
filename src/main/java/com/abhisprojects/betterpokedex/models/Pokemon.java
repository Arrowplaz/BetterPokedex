package com.abhisprojects.betterpokedex.models;

import com.abhisprojects.betterpokedex.models.Move.types;
import javax.persistence.Entity;

@Entity
public class Pokemon extends DomainObject {

    private String name;

    private types primaryType;

    private types secondaryType;

    private String ability;

    private Move[] moves;

    private Long id;
    
    /**
     * A getter for the pokemon's ID
     */
    @Override
    public Long getId() {
        return this.id;
    }
}
