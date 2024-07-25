package com.dma.servlet;

import com.dma.model.Compras;
import com.dma.service.ComprasService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * Servlet para manejar las solicitudes relacionadas con las compras.
 */
@WebServlet(name = "ComprasServlet", value = {"/compras-servlet"})
@MultipartConfig
public class ComprasServlet extends HttpServlet {
    // Servicio para manejar operaciones relacionadas con Compras
    private ComprasService comprasService = new ComprasService();

    /**
     * Inicializa el servlet.
     *
     * @throws ServletException si ocurre un error durante la inicialización.
     */
    @Override
    public void init() throws ServletException {
        super.init();
        // Inicializa el servicio de compras
        this.comprasService = new ComprasService();
    }

    /**
     * Maneja las solicitudes GET.
     *
     * @param req  el objeto HttpServletRequest que contiene la solicitud del cliente.
     * @param resp el objeto HttpServletResponse que contiene la respuesta del servlet.
     * @throws ServletException si ocurre un error en el procesamiento del servlet.
     * @throws IOException      si ocurre un error de entrada/salida.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Llama al servicio para listar todas las compras
        List<Compras> compras = comprasService.listarCompras();
        // Imprime cada compra en la consola del servidor
        compras.forEach(p -> System.out.println(p));
        // Añade la lista de compras como un atributo en la solicitud
        req.setAttribute("Compras", compras);
        // Reenvía la solicitud y la respuesta al JSP
        req.getRequestDispatcher("/listar-compras/listar-compras.jsp").forward(req, resp);
    }

    /**
     * Crea una nueva compra a partir de los parámetros de la solicitud.
     *
     * @param request  el objeto HttpServletRequest que contiene la solicitud del cliente.
     * @param response el objeto HttpServletResponse que contiene la respuesta del servlet.
     * @throws ServletException si ocurre un error en el procesamiento del servlet.
     * @throws IOException      si ocurre un error de entrada/salida.
     */
    private void crearCompras(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtiene los parámetros de la solicitud y los convierte al tipo adecuado
        int idCompras = 0;
        String fecha = request.getParameter("fecha");
        String descripcion = request.getParameter("descripcion");
        double total = Double.parseDouble(request.getParameter("total"));

        // Crea una nueva instancia de Compras con los parámetros obtenidos
        Compras compras = new Compras(idCompras, fecha, descripcion, total);
        // Llama al servicio para crear una nueva compra
        comprasService.crearCompras(compras);

        // Redirige a la página principal
        response.sendRedirect(request.getContextPath() + "/compras-servlet");
    }

    /**
     * Maneja las solicitudes POST.
     *
     * @param request  el objeto HttpServletRequest que contiene la solicitud del cliente.
     * @param response el objeto HttpServletResponse que contiene la respuesta del servlet.
     * @throws ServletException si ocurre un error en el procesamiento del servlet.
     * @throws IOException      si ocurre un error de entrada/salida.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtiene la información del path de la solicitud
        String pathInfo = request.getPathInfo();

        // Si el path es nulo o es la raíz, crea una nueva compra
        if (pathInfo == null || pathInfo.equals("/")) {
            crearCompras(request, response);
        } else {
            // Si el path no es válido, envía un error 400
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}

