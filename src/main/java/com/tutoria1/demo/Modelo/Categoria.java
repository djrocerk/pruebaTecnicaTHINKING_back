package com.tutoria1.demo.Modelo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The persistent class for the RNSANCIONES database table.
 *
 */
@Entity
@Table(name="CATEGORIA")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "idCategoria", "categoria" })
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="CATEGORIA_ID")
    private Long idCategoria;

    @Column(name="CATEGORIA")
    private String categoria;


}
