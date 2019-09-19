package org.launchcode.models.forms;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Entity
public class Category{

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=20)
    private String name;

    public Category(){

    }

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category( String name){
        this.name = name;

    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

}