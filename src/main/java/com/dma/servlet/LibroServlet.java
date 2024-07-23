package com.dma.servlet;

import com.dma.model.Libro;
import com.dma.service.LibroService;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet (name = "LibroServlet" , value = {"/libro-servlet"})
@MultipartConfig
public class LibroServlet extends HttpServlet {
    private LibroService
}
