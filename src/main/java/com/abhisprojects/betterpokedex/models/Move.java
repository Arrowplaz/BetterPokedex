package com.abhisprojects.betterpokedex.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Move extends DomainObject {

    /**
     * A enum for the categories that a move could be, unknown is a placeholder for the ??? type
     */
    public enum category {
        Special, Physical, Status, unknown
    };
    
    /**
     * A public enum to be used by the project for all the different types of a pokemon or move can be
     */
    public enum types {
        Bug, Dark, Dragon, Electric, Fairy, Fighting, Fire, Flying, Ghost, Grass, Ground, Ice, Normal,
        Poison, Physic, Rock, Steel, Water
    };


    /**
     * The ID of the move
     */
    @Id
    private Long id;

    /**
     * The name of the move
     */
    private String name;

    /**
     * The maximum powerpoints of the move(how many times a move can be used)
     */
    private int pp;

    /**
     * The power of the move, -1 indicates the move does no damage
     */
    private int power;

    /**
     * The accuracy of the move, -1 indicates the move has no accuracy check
     */
    private int accuracy;

    /**
     * The category of the move
     */
    private category moveCategory;

    /**
     * The type of the move
     */
    private types moveType;
    
    
    /**
     * The constructor for a given move
     * @param name the name
     * @param ID
     * @param pp
     * @param power
     * @param accuracy
     * @param category
     * @param type
     */
    public Move(String name, Long ID, int pp, int power, int accuracy, String category, String type) {
        setName(name);
        this.id = ID;

    }

    /**
     * A setter for the moves name
     * @param name the name
     */
    public void setName(String name) {
        if (name == null || "".equals(name))
            throw new IllegalArgumentException("Invalid move name");
        this.name = name;
    }

    /**
     * A setter for the PP of the move
     * @param pp the pp
     */
    public void setPP(int pp) {
        if (pp < 1)
            throw new IllegalArgumentException("Invalid PP amount");
        this.pp = pp;
    }
    
    /**
     * A setter for the move's power. -1 indicates the move does not do damage
     * @param power the power
     */
    public void setPower(int power) {
        if (power < 10 && power != -1)
            throw new IllegalArgumentException("Invalid power value");
        this.power = power;
    }

    /**
     * A setter for the accuracy 
     * @param accuracy the accuracy
     */
    public void setAccuracy(int accuracy) {
        if (accuracy < 0 && accuracy != -1)
            throw new IllegalArgumentException("Invalid accuracy value");
        this.accuracy = accuracy;
    }

    /**
     * A setter for the move's category
     * @param categoryIn the category
     */
    public void setCategory(String categoryIn) {
        switch (categoryIn.toLowerCase()) {
            case "special":
                this.moveCategory = category.Special;
                break;
            case "physical":
                this.moveCategory = category.Physical;
                break;
            case "status":
                this.moveCategory = category.Status;
                break;
            case "???":
                this.moveCategory = category.unknown;
                break;
            default:
                throw new IllegalArgumentException("Invalid category type");
        }

    }


    /**
     * A setter for the moves type
     * @param type the type
     */
    public void setMoveType(String type) {
        switch (type.toLowerCase(null)) {
            case "bug":
                this.moveType = types.Bug;
                break;

            case "dark":
                this.moveType = types.Dark;
                break;

            case "dragon":
                this.moveType = types.Dragon;
                break;

            case "electric":
                this.moveType = types.Electric;
                break;

            case "Fairy":
                this.moveType = types.Fairy;
                break;

            case "fighting":
                this.moveType = types.Fighting;
                break;

            case "fire":
                this.moveType = types.Fire;
                break;

            case "flying":
                this.moveType = types.Flying;
                break;

            case "ghost":
                this.moveType = types.Ghost;
                break;

            case "grass":
                this.moveType = types.Grass;
                break;

            case "ground":
                this.moveType = types.Ground;
                break;

            case "ice":
                this.moveType = types.Ice;
                break;

            case "normal":
                this.moveType = types.Normal;
                break;

            case "physic":
                this.moveType = types.Physic;
                break;

            case "poison":
                this.moveType = types.Poison;
                break;

            case "rock":
                this.moveType = types.Rock;
                break;

            case "steel":
                this.moveType = types.Steel;
                break;

            case "water":
                this.moveType = types.Water;
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

    /**
     * A getter for the ID
     */
    @Override
    public Long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPP() {
        return this.pp;
    }

    public int getPower() {
        return this.power;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public String getCategory() {
        return this.moveCategory.toString();
    }

    public types getType() {
        return this.moveType;
    }

}
