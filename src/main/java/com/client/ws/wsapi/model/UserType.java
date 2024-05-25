package com.client.ws.wsapi.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name = "user_type")
public class UserType implements Serializable {

    @Serial
    private static final long serialVersionUID = 7791248265524141986L;

    @Id
    @Column(name = "user_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    public UserType() {
    }

    public UserType(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
