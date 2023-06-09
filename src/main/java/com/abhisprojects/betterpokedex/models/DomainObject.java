package com.abhisprojects.betterpokedex.models;

import java.io.Serializable;

/**
 * The root class for all persistence entities. Has no fields or methods, but is used to provide a common superclass for 
 * "Service" methods.
 * 
 * @author Abhi Reddy
 */
abstract public class DomainObject {
    
    /**
     * Retuns the unique ID of the object. 
     * @return ID of the object
     */
    public abstract Serializable getId();
}
