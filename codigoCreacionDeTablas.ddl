CREATE TABLE conferencia (
    partidos          NUMBER(3) NOT NULL,
    liga_conferencias NUMBER(3) NOT NULL
);

ALTER TABLE conferencia ADD CONSTRAINT conferencia_pk PRIMARY KEY ( partidos,
                                                                    liga_conferencias );

CREATE TABLE equipo (
    eq_id                      VARCHAR2(25) NOT NULL,
    conferencia                NUMBER(2),
    ciudadlocal                VARCHAR2(200),
    dorsalesretirados          VARCHAR2(255),
    gm                         VARCHAR2(200),
    limitesalarial             NUMBER(6, 2),
    estadio                    VARCHAR2(200),
    propietario                VARCHAR2(200),
    partidoallstar_parta_id    NUMBER(3) NOT NULL,
    partidonormal_partidonl_id NUMBER(3) NOT NULL,
    jugadores                  VARCHAR2(200),
    partidonormal_partidos     NUMBER(3) NOT NULL,
    partidonormal_conferencias NUMBER(3) NOT NULL,
    playoffs_playoff_id        NUMBER(1) NOT NULL,
    partidonormal_playoff_id   NUMBER(1) NOT NULL,
    partidonormal_ronda_id     NUMBER(3) NOT NULL
);

ALTER TABLE equipo
    ADD CONSTRAINT equipo_pk PRIMARY KEY ( eq_id,
                                           partidoallstar_parta_id,
                                           partidonormal_partidonl_id,
                                           partidonormal_partidos,
                                           partidonormal_conferencias,
                                           partidonormal_playoff_id,
                                           partidonormal_ronda_id,
                                           playoffs_playoff_id );

CREATE TABLE estadio (
    nombre              VARCHAR2(200) NOT NULL,
    capacidad           NUMBER(6),
    equipo_eq_id        VARCHAR2(25) NOT NULL,
    equipo_parta_id     NUMBER(3) NOT NULL,
    equipo_partidonl_id NUMBER(3) NOT NULL,
    equipo_partidos     NUMBER(3) NOT NULL,
    equipo_conferencias NUMBER(3) NOT NULL,
    equipo_playoff_id   NUMBER(1) NOT NULL,
    equipo_playoff_id1  NUMBER(1) NOT NULL,
    equipo_ronda_id     NUMBER(3) NOT NULL
);


ALTER TABLE estadio ADD CONSTRAINT estadio_pk PRIMARY KEY ( nombre );

CREATE TABLE jugador (
    jugador_id                     NUMBER(3) NOT NULL,
    nombre                         VARCHAR2(200),
    apellido                       VARCHAR2(200),
    dorsal                         NUMBER(2),
    apodo                          VARCHAR2(200),
    posicion                       VARCHAR2(10),
    salario                        NUMBER(4, 2),
    nominacionesallstar            NUMBER(2),
    anillosdecampeon               NUMBER(2),
    mvp                            NUMBER(1),
    dpoy                           NUMBER(1),
    roty                           CHAR(1),
    mip                            CHAR(1),
    mvpallstar                     NUMBER(5),
    fmvp                           NUMBER(1),
    premioanotador                 NUMBER(2),
    ppg                            NUMBER(2),
    apg                            NUMBER(2),
    rbg                            NUMBER(2),
    spg                            NUMBER(2),
    bpg                            NUMBER(2),
    mpg                            NUMBER(2),
    finalizacion                   VARCHAR2(10),
    tiro                           VARCHAR2(10),
    organizacion                   VARCHAR2(10),
    defensa                        VARCHAR2(10),
    equipo_eq_id                   VARCHAR2(25) NOT NULL,
    equipo_partidoallstar_parta_id NUMBER(3) NOT NULL,
    equipo_partidonl_id            NUMBER(3) NOT NULL,
    equipo_partidos                NUMBER(3) NOT NULL,
    equipo_conferencias            NUMBER(3) NOT NULL,
    equipo_playoffs_playoff_id     NUMBER(1) NOT NULL,
    playoffs_playoff_id            NUMBER(1) NOT NULL,
    equipo_playoff_id1             NUMBER(1) NOT NULL,
    equipo_ronda_id                NUMBER(3) NOT NULL
);

ALTER TABLE jugador
    ADD CONSTRAINT jugador_pk PRIMARY KEY ( jugador_id,
                                            equipo_eq_id,
                                            equipo_partidoallstar_parta_id,
                                            equipo_partidonl_id,
                                            equipo_partidos,
                                            equipo_conferencias,
                                            equipo_playoffs_playoff_id,
                                            equipo_playoff_id1,
                                            equipo_ronda_id,
                                            playoffs_playoff_id );

CREATE TABLE liga (
    conferencias NUMBER(3) NOT NULL
);

ALTER TABLE liga ADD CONSTRAINT liga_pk PRIMARY KEY ( conferencias );

CREATE TABLE partidoallstar (
    parta_id        NUMBER(3) NOT NULL,
    equipo1         VARCHAR2(200),
    equipo2         VARCHAR2(200),
    marcadorequipo1 NUMBER(3),
    marcadorequipo2 NUMBER(3),
    fecha           DATE,
    titulares       VARCHAR2(200)
);

ALTER TABLE partidoallstar ADD CONSTRAINT partidoallstar_pk PRIMARY KEY ( parta_id );

CREATE TABLE partidonormal (
    partidonl_id                  NUMBER(3) NOT NULL,
    equipo1                       VARCHAR2(200),
    equipo2                       VARCHAR2(200),
    marcadorequipo1               NUMBER(3),
    marcadorequipo2               NUMBER(3),
    fecha                         DATE,
    conferencia_partidos          NUMBER(3) NOT NULL,
    conferencia_liga_conferencias NUMBER(3) NOT NULL,
    rondaplayoff_playoff_id       NUMBER(1) NOT NULL,
    rondaplayoff_ronda_id         NUMBER(3) NOT NULL
);

ALTER TABLE partidonormal
    ADD CONSTRAINT partidonormal_pk PRIMARY KEY ( partidonl_id,
                                                  conferencia_partidos,
                                                  conferencia_liga_conferencias,
                                                  rondaplayoff_playoff_id,
                                                  rondaplayoff_ronda_id );

CREATE TABLE playoffs (
    playoff_id   NUMBER(1) NOT NULL,
    listaequipos VARCHAR2(200),
    lista_rondas NUMBER(3)
);

ALTER TABLE playoffs ADD CONSTRAINT playoffs_pk PRIMARY KEY ( playoff_id );

CREATE TABLE rondaplayoff (
    ronda_id            NUMBER(3) NOT NULL,
    listarondas         NUMBER(3),
    playoffs_playoff_id NUMBER(1) NOT NULL
);

ALTER TABLE rondaplayoff ADD CONSTRAINT rondaplayoff_pk PRIMARY KEY ( playoffs_playoff_id,
                                                                      ronda_id );

ALTER TABLE conferencia
    ADD CONSTRAINT conferencia_liga_fk FOREIGN KEY ( liga_conferencias )
        REFERENCES liga ( conferencias );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_partidoallstar_fk FOREIGN KEY ( partidoallstar_parta_id )
        REFERENCES partidoallstar ( parta_id );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_partidonormal_fk FOREIGN KEY ( partidonormal_partidonl_id,
                                                         partidonormal_partidos,
                                                         partidonormal_conferencias,
                                                         partidonormal_playoff_id,
                                                         partidonormal_ronda_id )
        REFERENCES partidonormal ( partidonl_id,
                                   conferencia_partidos,
                                   conferencia_liga_conferencias,
                                   rondaplayoff_playoff_id,
                                   rondaplayoff_ronda_id );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_playoffs_fk FOREIGN KEY ( playoffs_playoff_id )
        REFERENCES playoffs ( playoff_id );

ALTER TABLE estadio
    ADD CONSTRAINT estadio_equipo_fk FOREIGN KEY ( equipo_eq_id,
                                                   equipo_parta_id,
                                                   equipo_partidonl_id,
                                                   equipo_partidos,
                                                   equipo_conferencias,
                                                   equipo_playoff_id1,
                                                   equipo_ronda_id,
                                                   equipo_playoff_id )
        REFERENCES equipo ( eq_id,
                            partidoallstar_parta_id,
                            partidonormal_partidonl_id,
                            partidonormal_partidos,
                            partidonormal_conferencias,
                            partidonormal_playoff_id,
                            partidonormal_ronda_id,
                            playoffs_playoff_id );

ALTER TABLE jugador
    ADD CONSTRAINT jugador_equipo_fk FOREIGN KEY ( equipo_eq_id,
                                                   equipo_partidoallstar_parta_id,
                                                   equipo_partidonl_id,
                                                   equipo_partidos,
                                                   equipo_conferencias,
                                                   equipo_playoff_id1,
                                                   equipo_ronda_id,
                                                   equipo_playoffs_playoff_id )
        REFERENCES equipo ( eq_id,
                            partidoallstar_parta_id,
                            partidonormal_partidonl_id,
                            partidonormal_partidos,
                            partidonormal_conferencias,
                            partidonormal_playoff_id,
                            partidonormal_ronda_id,
                            playoffs_playoff_id );

ALTER TABLE jugador
    ADD CONSTRAINT jugador_playoffs_fk FOREIGN KEY ( playoffs_playoff_id )
        REFERENCES playoffs ( playoff_id );

ALTER TABLE partidonormal
    ADD CONSTRAINT partidonormal_conferencia_fk FOREIGN KEY ( conferencia_partidos,
                                                              conferencia_liga_conferencias )
        REFERENCES conferencia ( partidos,
                                 liga_conferencias );

ALTER TABLE partidonormal
    ADD CONSTRAINT partidonormal_rondaplayoff_fk FOREIGN KEY ( rondaplayoff_playoff_id,
                                                               rondaplayoff_ronda_id )
        REFERENCES rondaplayoff ( playoffs_playoff_id,
                                  ronda_id );

ALTER TABLE rondaplayoff
    ADD CONSTRAINT rondaplayoff_playoffs_fk FOREIGN KEY ( playoffs_playoff_id )
        REFERENCES playoffs ( playoff_id );
