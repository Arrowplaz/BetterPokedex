package com.abhisprojects.betterpokedex.models;

import javax.persistence.Entity;
import com.abhisprojects.betterpokedex.models.Move.types;
@Entity
public class Pokemon extends DomainObject {
    
    /**
     * A getter for the pokemon's ID
     */
    @Override
    public Long getId() {
        return null;
    }
}
