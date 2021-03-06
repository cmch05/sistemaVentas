ALTER TABLE VENTA ADD FACTURA_RELACIONADA VARCHAR(50)  DEFAULT '';
DROP TABLE ACTIVIDAD;
CREATE TABLE ACTIVIDAD(
ID_ACTIVIDAD int(11) NOT NULL AUTO_INCREMENT,
ID_CLIENTE INT(11) NOT NULL,
DESCRIPCION_ACTIVIDAD VARCHAR(500) NOT NULL default '',
FECHA DATETIME NOT NULL,
PRIMARY KEY (ID_ACTIVIDAD),
FOREIGN KEY (ID_CLIENTE)  REFERENCES CLIENTE(ID_CLIENTE)
)ENGINE=InnoDB;


DROP TABLE DETALLE_FUMIGACION_PRODUCTO;
CREATE TABLE DETALLE_FUMIGACION_PRODUCTO(
ID_DETALLE_FUMIGACION_PRODUCTO int(11) NOT NULL AUTO_INCREMENT,
ID_CONTRATO_FUMIGACION int(11) NOT NULL,
ID_PRODUCTO INT(11) NOT NULL,
CANTIDAD INT NOT NULL,
UTILIZO DECIMAL (9,3) NOT NULL DEFAULT 0.0,
QUEDO DECIMAL (9,3) NOT NULL DEFAULT 0.0,
PRIMARY KEY (ID_DETALLE_FUMIGACION_PRODUCTO),
FOREIGN KEY (ID_CONTRATO_FUMIGACION) REFERENCES  CONTRATO_FUMIGACION(ID_CONTRATO_FUMIGACION),
FOREIGN KEY (ID_PRODUCTO) REFERENCES  PRODUCTO(ID_PRODUCTO)
)ENGINE=InnoDB;
