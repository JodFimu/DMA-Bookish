package com.dma.model;

public class Compras {
    private int idCompras;
    private String fecha;
    private String descripcion;
    private double total;

    public Compras() {
    }

    public Compras(int idCompras,String fecha,String descripcion,double total) {
        this.idCompras = idCompras;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.total = total;

    }

    public int getIdCompras(){return idCompras;}

    public void setIdCompras(int idCompras){ this.idCompras = idCompras;}

    public  String getFecha(){return fecha;}

    public void setFecha(String fecha){this.fecha = fecha;}

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descipcion){this.descripcion = descripcion;}

    public double getTotal(){return total;}

    public void setTotal(double total){this.total = total;}


}
