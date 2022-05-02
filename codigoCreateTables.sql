DROP DATABASE IF exists trabajoFinal;
CREATE DATABASE trabajoFinal;
use trabajoFinal;

CREATE TABLE ObjetoConNombre(
nombre VARCHAR(200) primary KEY
);

CREATE table Jugador(
jugador_id NUMERIC(8) PRIMARY KEY,
nombre varchar(200) NOT NULL ,
apellido varchar(200) NOT NULL,
apodo varchar(200),
dorsal NUMERIC(2) NOT NULL,
posicion ENUM('BASE','ESCOLTA','ALERO','ALAPIVOT','PIVOT') NOT NULL,
salario NUMERIC(4,2) NOT NULL,
nominacionesAllStar NUMERIC(2),
anillosDeCampeon NUMERIC(2),
MVP NUMERIC(2),
DPOY NUMERIC(1),
MVPAllStar NUMERIC(1),
FMVP NUMERIC(1),
premioAnotador NUMERIC(1),
PPG NUMERIC(4,2) NOT NULL,
APG NUMERIC(4,2) NOT NULL,
RPG NUMERIC(4,2) NOT NULL,
SPG NUMERIC(4,2) NOT NULL,
BPG NUMERIC(4,2) NOT NULL,
MPG NUMERIC(4,2) NOT NULL,
finalizacion ENUM('A','B','C','D') NOT NULL,
tiro ENUM('A','B','C','D') NOT NULL,
organizacion ENUM('A','B','C','D') NOT NULL,
defensa ENUM('A','B','C','D') NOT NULL,
foreign key (nombre) references ObjetoConNombre(nombre)
);

CREATE TABLE JugadorNormal(
jugadorNormal_id NUMERIC(8) PRIMARY KEY,
foreign key (jugadorNormal_id) references Jugador(jugador_id)
);

CREATE TABLE JugadorAllStar(
jugadorAllStar_id NUMERIC(8) PRIMARY KEY,
foreign key (jugadorAllStar_id) references Jugador(jugador_id)
);

CREATE TABLE Equipo(
equipo_id NUMERIC(2) PRIMARY KEY,
nombre VARCHAR(200) NOT NULL,
conferencia VARCHAR(50) NOT NULL,
ciudadLocal VARCHAR(100) NOT NULL,
propietario VARCHAR(200) NOT NULL,
gM  VARCHAR(200) NOT NULL,
limiteSalarial NUMERIC(4,2) NOT NULL,
dorsalesRetirados VARCHAR(200) NOT NULL,
foreign key (nombre) references ObjetoConNombre(nombre),
foreign key (propietario) references ObjetoConNombre(nombre),
foreign key (gM) references ObjetoConNombre(nombre)
);

CREATE TABLE EquipoAllStar(
equipoAllStar_id NUMERIC(8) PRIMARY KEY,
plantilla VARCHAR(200) NOT NULL,
foreign key (equipoAllStar_id) references Equipo(equipo_id)
);

CREATE TABLE EquipoNormal(
equipoNormal_id NUMERIC(8) PRIMARY KEY,
plantilla VARCHAR(200) NOT NULL,
foreign key (equipoNormal_id) references Equipo(equipo_id)
);

CREATE TABLE estadio(
estadio_id NUMERIC(2) PRIMARY KEY,
equipo_id NUMERIC(2) NOT NULL,
capacidad NUMERIC(6,2) NOT NULL,
foreign key (equipo_id) references Equipo(equipo_id)
);

CREATE TABLE Partido(
partido_id NUMERIC(5) PRIMARY KEY,
marcadorLocal NUMERIC(3) NOT NULL,
marcadorVisitante NUMERIC(3) NOT NULL,
fecha DATETIME
);

CREATE TABLE PartidoAllStar(
partido_id NUMERIC(5) PRIMARY KEY,
equipo1 VARCHAR(200) NOT NULL,
equipo2 VARCHAR(200) NOT NULL,
titulares VARCHAR(200) NOT NULL,
foreign key (partido_id) references Partido(partido_id)
);

CREATE TABLE PartidoNormal(
partido_id NUMERIC(5) PRIMARY KEY,
equipo1 VARCHAR(200) NOT NULL,
equipo2 VARCHAR(200) NOT NULL,
titulares VARCHAR(200) NOT NULL,
foreign key (partido_id) references Partido(partido_id)
);

CREATE TABLE RondaPlayoffs(
nombre VARCHAR(200) PRIMARY KEY,
RondaPlayoffs_id NUMERIC(1) NOT NULL,
partido VARCHAR(200) NOT NULL,
foreign key (nombre) references ObjetoConNombre(nombre)
);

CREATE TABLE Playoffs(
nombre VARCHAR(200) PRIMARY KEY,
playoffs_id NUMERIC(1) NOT NULL,
listaEquiposPlayoffs VARCHAR(200) NOT NULL,
rondas VARCHAR(200) NOT NULL,
foreign key (nombre) references ObjetoConNombre(nombre)
);

CREATE TABLE Conferencia(
nombre VARCHAR(200) PRIMARY KEY,
partidos VARCHAR(200) NOT NULL,
foreign key (nombre) references ObjetoConNombre(nombre)
);

CREATE TABLE Liga(
liga_id NUMERIC(1) PRIMARY KEY,
confEste VARCHAR(299) NOT NULL,
confOeste VARCHAR(299) NOT NULL
);