package com.tutoria1.demo.Modelo;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the RNSANCIONES database table.
 *
 */
@Getter
@Setter
@Entity
@Table(name="PRODUCTOS")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "idProducto", "producto", "categoria"  })
public class Productos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID")
    private Long idProducto;

    @Column(name="PRODUCTOS")
    private String producto;

    @ManyToOne
    @JoinColumn(name="CATEGORIA_ID")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "idCategoria", "categoria" })
    private Categoria categoria;

    public Productos() {
    }




}