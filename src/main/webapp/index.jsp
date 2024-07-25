<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bookish</title>
        <link rel="icon" href="assets/imagenes/Logo.png" type="image/x-icon">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="./resource/styles.css">
    </head>
    <body>
        <nav class="position-relative navbar navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.html">Bookish</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Menú</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="./index.html">Inicio</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link " href="./formulario-clientes/formulario-clientes.jsp">Formulario para clientes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./formulario-compras/formulario-compras.jsp">Formulario de compras</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./formulario-autor/formulario-autor.jsp">Formulario para autor</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./formulario-editorial/formulario-editorial.jsp">Formulario para editorial</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./formulario-libro/formulario-libro.jsp">Formulario para un libro</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./formulario-factura/formulario-factura.jsp">Formulario para factura</a>
                            </li>
                            
                            <li class="nav-item">
                                <a class="nav-link " href="./listar-clientes/listar-clientes.jsp">Listado de clientes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./listar-compras/listar-compras.jsp">Listado de compras</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./listar-autor/listar-autor.jsp">Listado de autores</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./listar-editorial/listar-editorial.jsp">Listado de editoriales</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="./listar-libro/listar-libro.jsp">Listado de libros</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./listar-factura/listar-factura.jsp">Listado de facturas</a>
                            </li>

                        </ul>
                    </div>
                </div>
            </div>
        </nav>

        <!-- Carrusel -->
        <div id="carouselExampleCaptions" class="carousel slide mt-4">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="assets/imagenes/Bienvenida.png" class="d-block w-100" alt="Slide 1">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Bookish</h5>
                        <p>La mejor tienda de Libros</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/imagenes/Libros.png" class="d-block w-100" alt="Slide 2">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Gran variedad de libros</h5>
                        <p>Desde accion, aventura, drama de todo</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="assets/imagenes/Club.png" class="d-block w-100" alt="Slide 3">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Unete a nuestro Club de lectura</h5>
                        <p>Socializa</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
