package com.dma.servelet;

import com.dma.model.Compras;
import com.dma.model.Compras;
import com.dma.service.ComprasService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Blob;
import java.util.List;

@WebServlet(name = "ComptasServelet", value = {"/libro-servelet"})
@MultipartConfig
public class ComprasServelet extends HttpServlet {
    private ComprasServelet comprasServelet = new ComprasServelet();

    @Override
    public void init() throws ServletException {
        super.init();

        this.comprasServelet = new ComprasServelet();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Compras> compras = comprasService.listarCliente();
        compras.forEach(p -> System.out.println(p));
        req.setAttribute("compras", compras);
        req.getRequestDispatcher("/lista-compras/lista-compras.jsp").forward(req, resp);
    }

    private void crearCompras(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCompras = request.getParameter(idCompras);
        String fecha = request.getParameter("fecha");
        String descripcion = request.getParameter("descripcion");
        double total = request.getParameter(total );

        Compras compras = new Compras(idCompras, fecha, descripcion, total);
        comprasService.crearCompras(compras);

        response.sendRedirect(request.getContextPath() + "/");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {
            crearCompras (request, response);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

    }
