drop database  if exists BookishDB;

create database BookishDB;

use BookishDB;

create table Editorial(
	idEditorial int auto_increment,
    nombre varchar(50),
    telefono varchar(15),
    contacto varchar(45),
    NITEditorial varchar(10),
	primary key	PK_Editorial(idEditorial)
);

create table Compras(
	idCompras int auto_increment,
    fecha date,
    descripcion varchar(250),
    total decimal(10,2),
    primary key PK_Compras(idCompras)
);

create table Clientes(
	idClientes int auto_increment,
    NITClientes varchar(10),
    nombrecliente varchar(45),
    apellidoCliente varchar(45),
    direccionCliente varchar(150),
    telefonoCliente varchar(13),
    correoCliente varchar(45),
    primary key PK_Clientes(idClientes)
);

create table Autor(
	idAutor int auto_increment,
    nombre varchar(45),
    apellido varchar(45),
    primary key PK_Autor(idAutor)
);

create table Factura(
	numeroFactura int auto_increment,
    estado varchar(45),
    totalFactura decimal(10,2),
    fechaFactura date ,
    primary key PK_Factura(numeroFactura)
);

create table Libro(
	idLibro int auto_increment,
	nombre varchar(45),
    sinopsis varchar(250),
    precio decimal(10,2),
    existencias int,
    autor varchar(45),
    genero varchar(45),
    idioma varchar(45),
    editorial varchar(45),
    primary key PK_Libro(idLibro)
);
INSERT INTO Editorial (nombre, telefono, contacto, NITEditorial) VALUES
('Editorial Alfa', '123-456-7890', 'Carlos Gómez', 'NIT123456'),
('Editorial Beta', '234-567-8901', 'Ana Martínez', 'NIT234567'),
('Editorial Gamma', '345-678-9012', 'Luis Pérez', 'NIT345678'),
('Editorial Delta', '456-789-0123', 'Marta López', 'NIT456789'),
('Editorial Epsilon', '567-890-1234', 'Sofía González', 'NIT567890');

INSERT INTO Compras (fecha, descripcion, total) VALUES
('2024-01-15', 'Compra de materiales de oficina', 1200.50),
('2024-02-20', 'Compra de libros educativos', 3000.00),
('2024-03-10', 'Compra de equipos electrónicos', 2500.75),
('2024-04-05', 'Compra de mobiliario para la oficina', 1800.00),
('2024-05-12', 'Compra de software de gestión', 900.00);

INSERT INTO Clientes (NITClientes, nombrecliente, apellidoCliente, direccionCliente, telefonoCliente, correoCliente) VALUES
('NIT001234', 'Juan', 'Pérez', 'Calle Falsa 123, Ciudad', '555-1234', 'juan.perez@ejemplo.com'),
('NIT002345', 'Ana', 'García', 'Avenida Siempre Viva 456, Ciudad', '555-2345', 'ana.garcia@ejemplo.com'),
('NIT003456', 'Luis', 'Martínez', 'Boulevard Principal 789, Ciudad', '555-3456', 'luis.martinez@ejemplo.com'),
('NIT004567', 'Marta', 'Rodríguez', 'Plaza Central 101, Ciudad', '555-4567', 'marta.rodriguez@ejemplo.com'),
('NIT005678', 'Sofía', 'González', 'Calle del Sol 202, Ciudad', '555-5678', 'sofia.gonzalez@ejemplo.com');

INSERT INTO Autor (nombre, apellido) VALUES
('Jorge', 'Luis Borges'),
('Gabriel', 'García Márquez'),
('Isabel', 'Allende'),
('Mario', 'Vargas Llosa'),
('Laura', 'Esquivel');

INSERT INTO Factura (estado, totalFactura, fechaFactura) VALUES
('Pagada', 1500.75, '2024-01-20'),
('Pendiente', 3200.00, '2024-02-15'),
('Pagada', 2700.50, '2024-03-05'),
('Cancelada', 1900.00, '2024-04-10'),
('Pagada', 950.00, '2024-05-25');

INSERT INTO Libro (nombre, sinopsis, precio, existencias, autor, genero, idioma, editorial)
VALUES ('El Quijote', 'Una novela sobre las aventuras de un hidalgo manchego', 29.99, 100, 'Miguel de Cervantes', 'Novela', 'Español', 'Editorial A');

INSERT INTO Libro (nombre, sinopsis, precio, existencias, autor, genero, idioma, editorial)
VALUES ('1984', 'Una distopía que explora los peligros del totalitarismo',  19.99, 150, 'George Orwell', 'Distopía', 'Inglés', 'Editorial B');

INSERT INTO Libro (nombre, sinopsis,  precio, existencias, autor, genero, idioma, editorial)
VALUES ('Matar a un ruiseñor', 'Una novela sobre la injusticia racial en el sur de EE. UU.', 24.99, 200, 'Harper Lee', 'Ficción', 'Inglés', 'Editorial C');

INSERT INTO Libro (nombre, sinopsis, precio, existencias, autor, genero, idioma, editorial)
VALUES ('Cien años de soledad', 'Una saga sobre la familia Buendía en el pueblo ficticio de Macondo', 34.99, 80, 'Gabriel García Márquez', 'Realismo Mágico', 'Español', 'Editorial D');

INSERT INTO Libro (nombre, sinopsis, precio, existencias, autor, genero, idioma, editorial)
VALUES ('El Señor de los Anillos', 'Una épica aventura en la Tierra Media', 49.99, 50, 'J.R.R. Tolkien', 'Fantasía', 'Inglés', 'Editorial E');


-- CREATE USER 'DMA_Corporation'@'localhost' IDENTIFIED BY 'DMAPassword';
-- GRANT ALL PRIVILEGES ON *.* TO 'DMA_Corporation'@'localhost' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;