package com.WebAnag.Anagrafica.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "utenti")
public class Utenti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Integer getId() {
        return id;
    }

    public Utenti setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Utenti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Utenti setPassword(String password) {
        this.password = password;
        return this;
    }
}
