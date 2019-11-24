CREATE DATABASE museo;
USE museo;
-- drop database museo;
-- =========================================

CREATE TABLE municipio
(
id_municipio int PRIMARY KEY NOT NULL,
municipio varchar(30)
);

CREATE TABLE colonia
(
id_colonia int PRIMARY KEY NOT NULL,
colonia varchar(30),
id_municipio int,

CONSTRAINT fk_id_municipio
FOREIGN KEY (id_municipio)
REFERENCES municipio(id_municipio)
);

CREATE TABLE numero
(
id_numero int PRIMARY KEY NOT NULL,
numero int,
id_colonia int,

CONSTRAINT fk_id_colonia
FOREIGN KEY (id_colonia)
REFERENCES colonia(id_colonia)
);

CREATE TABLE calle
(
id_calle int PRIMARY KEY NOT NULL,
calle varchar(30),
id_numero int,

CONSTRAINT fk_id_numero
FOREIGN KEY (id_numero)
REFERENCES numero(id_numero)
);

CREATE TABLE cp
(
id_cp int PRIMARY KEY NOT NULL,
cp varchar(5),
id_calle int,

CONSTRAINT fk_id_calle
FOREIGN KEY (id_calle)
REFERENCES calle(id_calle)
);

-- =========================================
CREATE TABLE mobiliario
(
id_mobiliario int PRIMARY KEY NOT NULL,
vitrinas int,
mostradores int,
mostradoresP int,
sillasE int,
bancos int
);

CREATE TABLE tipoMuseo
(
id_tipoM int PRIMARY KEY NOT NULL,
tipo_museo varchar(30),
id_mobiliario int,

CONSTRAINT fk_id_mobiliario
FOREIGN KEY (id_mobiliario)
REFERENCES mobiliario(id_mobiliario)
);
-- =================================================
CREATE TABLE horario
(
id_horario int PRIMARY KEY NOT NULL,
horaEntrada varchar(5),
horaSalida varchar(5)
)
-- =================================================
CREATE TABLE registro
(
nombreM varchar(50) PRIMARY KEY NOT NULL,
id_horario int,
id_cp int,
id_tipoM int,

CONSTRAINT fk_id_tipoM
FOREIGN KEY (id_tipoM)
REFERENCES tipoMuseo(id_tipoM),

CONSTRAINT fk_id_cp
FOREIGN KEY (id_cp)
REFERENCES cp(id_cp),

CONSTRAINT fk_id_horario
FOREIGN KEY (id_horario)
REFERENCES horario(id_horario)
);

-- ==================================================
CREATE TABLE fecha
(
id_fecha int PRIMARY KEY NOT NULL,
fechaI datetime,
fechaF datetime
);

CREATE TABLE exposicion
(
titulo_obra varchar(30),
descripcion varchar(100),
id_fecha int,
nombreM varchar(50),

CONSTRAINT fk_id_fecha
FOREIGN KEY (id_fecha)
REFERENCES fecha(id_fecha),

CONSTRAINT fk_nombreM
FOREIGN KEY (nombreM)
REFERENCES registro(nombreM)
);