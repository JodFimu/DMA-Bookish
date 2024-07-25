
package com.dma.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

/**
 *
 * @author 2020269
 */

//Se crea el Bean o Model para la entidad Factura. 

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroFactura;
    private String estado;
    private BigDecimal totalFactura;
    private String fechaFactura;

    public Factura() {
    }

    public Factura(int numeroFactura, String estado, BigDecimal totalFactura, String fechaFactura) {
        this.numeroFactura = numeroFactura;
        this.estado = estado;
        this.totalFactura = totalFactura;
        this.fechaFactura = fechaFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(BigDecimal totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}
