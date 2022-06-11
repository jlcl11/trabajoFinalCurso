DROP DATABASE IF exists trabajoFinal;
CREATE DATABASE trabajoFinal;
use trabajoFinal;

CREATE TABLE conferencia (
    partidos INT PRIMARY KEY,
    liga_conferencias int ,
    nombre varchar(200)
);

CREATE TABLE equipo (
    eq_id int PRIMARY KEY,
    conferencia NUMERIC(2),
    ciudadlocal VARCHAR(200),
    gm VARCHAR(200),
    limitesalarial NUMERIC(6, 2),
    propietario VARCHAR(200),
    partidoallstar_parta_id INT ,
    playoffs_playoff_id INT ,
    nombre VARCHAR(200)
);

CREATE TABLE estadio (
    estadio_id INT  PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    capacidad NUMERIC(6),
    equipo_eq_id INT NOT NULL
);

CREATE TABLE jugador (
    jugador_id INT  PRIMARY KEY,
    nombre VARCHAR(200),
    apellido VARCHAR(200),
    dorsal NUMERIC(3),
    apodo VARCHAR(200),
    posicion ENUM('BASE','ESCOLTA','ALERO','ALAPIVOT','PIVOT'),
    salario NUMERIC(4, 2),
    nominacionesallstar NUMERIC(2),
    anillosdecampeon NUMERIC(2),
    mvp NUMERIC(1),
    dpoy NUMERIC(1),
    roty boolean,
    mip boolean,
    mvpallstar NUMERIC(5),
    fmvp NUMERIC(1),
    premioanotador NUMERIC(2),
    ppg NUMERIC(2),
    apg NUMERIC(2),
    rbg NUMERIC(2),
    spg NUMERIC(2),
    bpg NUMERIC(2),
    mpg NUMERIC(2),
    finalizacion ENUM('A','B','C','D'),
    tiro ENUM('A','B','C','D'),
    organizacion ENUM('A','B','C','D'),
    defensa ENUM('A','B','C','D'),
    equipo_eq_id INT ,
    playoffs_playoff_id INT 
);


CREATE TABLE liga (
    conferencias INT  PRIMARY KEY
);

CREATE TABLE partidoallstar (
    parta_id INT PRIMARY KEY,
    equipo1 VARCHAR(200),
    equipo2 VARCHAR(200),
    marcadorequipo1 NUMERIC(3),
    marcadorequipo2 NUMERIC(3),
    fecha DATE,
    titulares VARCHAR(200)
);

CREATE TABLE partidonormal (
    partidonl_id INT PRIMARY KEY,
    equipo1 VARCHAR(200),
    equipo2 VARCHAR(200),
    marcadorequipo1 NUMERIC(3),
    marcadorequipo2 NUMERIC(3),
    fecha DATE,
    conferencia_partidos INT ,
    rondaplayoff_ronda_id INT 
);


CREATE TABLE partidos (
    partidonormal_partidonl_id INT NOT NULL,
    equipo_eq_id INT NOT NULL
);


ALTER TABLE
    partidos
ADD
    CONSTRAINT partidos_pk PRIMARY KEY (
        partidonormal_partidonl_id,
        equipo_eq_id
    );

CREATE TABLE playoffs (
    playoff_id INT  PRIMARY KEY,
    nombre varchar(200),
    listaequipos VARCHAR(200),
    lista_rondas INT
);

CREATE TABLE rondaplayoff (
    ronda_id INT  PRIMARY KEY,
    nombre varchar(200),
    listarondas NUMERIC(3),
    playoffs_playoff_id INT 
);

ALTER TABLE
    conferencia
ADD
    CONSTRAINT conferencia_liga_fk FOREIGN KEY (liga_conferencias) REFERENCES liga (conferencias);

ALTER TABLE
    equipo
ADD
    CONSTRAINT equipo_partidoallstar_fk FOREIGN KEY (partidoallstar_parta_id) REFERENCES partidoallstar (parta_id);

ALTER TABLE
    equipo
ADD
    CONSTRAINT equipo_playoffs_fk FOREIGN KEY (playoffs_playoff_id) REFERENCES playoffs (playoff_id);

ALTER TABLE
    estadio
ADD
    CONSTRAINT estadio_equipo_fk FOREIGN KEY (equipo_eq_id) REFERENCES equipo (eq_id);

ALTER TABLE
    jugador
ADD
    CONSTRAINT jugador_equipo_fk FOREIGN KEY (equipo_eq_id) REFERENCES equipo (eq_id);

ALTER TABLE
    jugador
ADD
    CONSTRAINT jugador_playoffs_fk FOREIGN KEY (playoffs_playoff_id) REFERENCES playoffs (playoff_id);

ALTER TABLE
    partidonormal
ADD
    CONSTRAINT partidonormal_conferencia_fk FOREIGN KEY (conferencia_partidos) REFERENCES conferencia (partidos);

ALTER TABLE
    partidonormal
ADD
    CONSTRAINT partidonormal_rondaplayoff_fk FOREIGN KEY (rondaplayoff_ronda_id) REFERENCES rondaplayoff (ronda_id);

ALTER TABLE
    partidos
ADD
    CONSTRAINT partidos_equipo_fk FOREIGN KEY (equipo_eq_id) REFERENCES equipo (eq_id);

ALTER TABLE
    partidos
ADD
    CONSTRAINT partidos_partidonormal_fk FOREIGN KEY (partidonormal_partidonl_id) REFERENCES partidonormal (partidonl_id);

ALTER TABLE
    rondaplayoff
ADD
    CONSTRAINT rondaplayoff_playoffs_fk FOREIGN KEY (playoffs_playoff_id) REFERENCES playoffs (playoff_id);
    
