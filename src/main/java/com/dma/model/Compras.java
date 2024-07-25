package com.dma.model;

public class Compras {
    private int idCompras;
    private String fecha;
    private String descripcion;
    private double total;

    // Constructor vacio
    public Compras() {
    }

// constructor con parametros
    public Compras(int idCompras,String fecha,String descripcion,double total) {
        this.idCompras = idCompras;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.total = total;

    }

    // metodos getters and setters que estableceran y devolveran los valores de cada atributo
    public int getIdCompras(){return idCompras;}

    public void setIdCompras(int idCompras){ this.idCompras = idCompras;}

    public  String getFecha(){return fecha;}

    public void setFecha(String fecha){this.fecha = fecha;}

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descipcion){this.descripcion = descripcion;}

    public double getTotal(){return total;}

    public void setTotal(double total){this.total = total;}


}
