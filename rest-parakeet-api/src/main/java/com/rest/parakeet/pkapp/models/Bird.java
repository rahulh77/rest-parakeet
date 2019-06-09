package com.rest.parakeet.pkapp.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Bird {
    @Id
    private ObjectId _id;
    private String common;
    private String genus;
    private String species;
    private String breed_suborigin;

    public Bird() {}

    public Bird(ObjectId _id, String common, String genus, String species, String breed_suborigin){
        this._id = _id;
        this.common = common;
        this.genus = genus;
        this.species = species;
        this.breed_suborigin = breed_suborigin;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed_suborigin() {
        return breed_suborigin;
    }

    public void setBreed_suborigin(String breed_suborigin) {
        this.breed_suborigin = breed_suborigin;
    }
}