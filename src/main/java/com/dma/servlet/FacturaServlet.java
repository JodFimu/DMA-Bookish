package com.dma.servlet;

import com.dma.model.Factura;
import com.dma.service.FacturaService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet(name = "FacturaServlet", value = {"/factura-servlet"})
public class FacturaServlet extends HttpServlet {
    private FacturaService facturaService = new FacturaService();

    @Override
    public void init() throws ServletException {
        super.init();
        this.facturaService = new FacturaService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Factura> facturas = facturaService.listarFactura();
        facturas.forEach(f -> System.out.println(f));
        request.setAttribute("facturas", facturas);
        request.getRequestDispatcher("/listar-factura/listar-factura.jsp").forward(request, response);
    }

    private void crearFactura(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String estado = request.getParameter("estado");
        BigDecimal totalFactura = new BigDecimal(request.getParameter("totalFactura"));
        String fechaFactura = request.getParameter("fechaFactura");

        Factura factura = new Factura();
        factura.setEstado(estado);
        factura.setTotalFactura(totalFactura);
        factura.setFechaFactura(fechaFactura);

        facturaService.crearFactura(factura);

        response.sendRedirect(request.getContextPath() + "/factura-servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {
            crearFactura(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_GATEWAY);
        }
    }
}
