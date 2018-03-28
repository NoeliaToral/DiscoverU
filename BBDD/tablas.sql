create table productos(
	idProductos int(13) not null auto_increment,
    nombreProducto varchar(15) not null,
    descripcion varchar(100) not null,
    precio double not null,
    url varchar(30),
    material varchar(20),
    talla varchar(5),
    primary key (idProductos)
);

create table usuarios (
	dni varchar(9) primary key,
    nombreUsuario varchar(30),
    apellidos varchar(30),
    email varchar(30),
    direccion varchar(50)
);

create table comprar(
	dni varchar(9) references usuarios (dni),
    idProductos integer references productos(idProductos),
    fechaCompra date,
    precioComprado double,
    primary key (dni, idProductos)
    
);