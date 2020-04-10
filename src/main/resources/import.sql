/* Populate tabla regiones */
INSERT INTO regiones (id, nombre) VALUES(1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES(2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES(3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES(4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES(5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES(6, 'África');
INSERT INTO regiones (id, nombre) VALUES(7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES(8, 'Antártida');

/* Populate tabla clientes */
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Damian', 'Dominguez', 'damian93domin@gmail.com', '2020-01-08');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2017-11-11');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2017-11-12');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2017-11-13');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2017-11-14');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2017-11-15');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2017-11-16');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Bombasto', 'Vlissides', 'bombasto.vlissides@gmail.com', '2017-11-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr James', 'Gosling', 'james.gosling@gmail.com', '2017-11-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/* Creamos algunos usuarios con sus roles -- Contraseñas encriptadas = 12345 */
INSERT INTO `roles` (nombre) VALUES('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES('ROLE_ADMIN');

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES('damian','$2a$10$laah05lIq2o8noajl6EG6ufXe9jmADSneALvcZPKil1vea3dj3Lgy',1, 'Damian', 'Dominguez','damian93domin@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES('admin','$2a$10$TNs.aoOxBqjAq6KnYHTp8.pqJ5viY7MogfZzJryFVUOkESNU.Zuey',1, 'John', 'Doe','jhon.doe@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');

/* damian - ROLE_USER*    *admin - ROLE_ADMIN.ROLE_USER */
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1, 1); 
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2, 2); 
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2, 1);

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);