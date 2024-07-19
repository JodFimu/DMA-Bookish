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
    imagen longblob,
    precio decimal(10,2),
    existencias int,
    autor varchar(45),
    genero varchar(45),
    idioma varchar(45),
    editorial varchar(45),
    primary key PK_Libro(idLibro)
);

-- CREATE USER 'DMA_Corporation'@'localhost' IDENTIFIED BY 'DMAPassword';
-- GRANT ALL PRIVILEGES ON *.* TO 'DMA_Corporation'@'localhost' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;