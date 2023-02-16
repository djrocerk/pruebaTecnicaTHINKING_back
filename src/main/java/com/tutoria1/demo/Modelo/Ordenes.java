package com.tutoria1.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ORDENES")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "idOrden", "precio","cantidad","productos" })
public class Ordenes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ORDENES_ID")
    private Long idOrden;

    @Column(name="PRECIO")
    private Integer precio;

    @Column(name="CANTIDAD")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="ID")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "idProducto", "producto", "categoria" })
    private Productos productos;}
