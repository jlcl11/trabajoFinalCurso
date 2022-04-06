-- Generado por Oracle SQL Developer Data Modeler 21.2.0.183.1957
--   en:        2022-04-06 20:26:14 CEST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE allstar (
    allstar_id  NUMBER(1),
    allstar_id1 NUMBER NOT NULL
);

ALTER TABLE allstar ADD CONSTRAINT allstar_pk PRIMARY KEY ( allstar_id1 );

CREATE TABLE conf (
    conf_id      NUMBER(1) NOT NULL,
    costa        VARCHAR2(6) NOT NULL,
    liga_liga_id NUMBER(1) NOT NULL
);

ALTER TABLE conf ADD CONSTRAINT conf_pk PRIMARY KEY ( conf_id );

CREATE TABLE equipo (
    equipo_id             NUMBER(2) NOT NULL,
    conferencia           VARCHAR2(1) NOT NULL,
    dorsalesretirados     VARCHAR2(90),
    generalmanager        VARCHAR2(40),
    limitesalarial        NUMBER(6, 2),
    propietario           VARCHAR2(40),
    puestoenlaconferencia NUMBER(2),
    ciudadlocal           VARCHAR2(40),
    estadio               VARCHAR2(60),
    jugador               NUMBER(3),
    conf_conf_id          NUMBER(1) NOT NULL,
    allstar_allstar_id1   NUMBER NOT NULL
);

ALTER TABLE equipo ADD CONSTRAINT equipo_pk PRIMARY KEY ( equipo_id,
                                                          conf_conf_id );

CREATE TABLE jugador (
    jugador_id            NUMBER(3) NOT NULL,
    nombre                VARCHAR2(20) NOT NULL,
    apellido              VARCHAR2(40) NOT NULL,
    apodo                 VARCHAR2(40),
    salario               NUMBER(4, 2) NOT NULL,
    puntosporpartido      NUMBER(4, 2) NOT NULL,
    asistenciasporpartido NUMBER(4, 2) NOT NULL,
    rebotesporpartido     NUMBER(4, 2) NOT NULL,
    robosporpartido       NUMBER(4, 2) NOT NULL,
    taponesporpartido     NUMBER(4, 2) NOT NULL,
    mvp                   NUMBER(1),
    estadisticadpoy       NUMBER(5, 2) NOT NULL,
    defensordelanho       NUMBER(1),
    premioanotador        NUMBER(1),
    mvpallstar            NUMBER(1),
    mvpfinales            NUMBER(1),
    estadisticamvp        NUMBER(5, 2) NOT NULL,
    equipo_equipo_id      NUMBER(2) NOT NULL,
    equipo_conf_conf_id   NUMBER(1) NOT NULL,
    allstar_allstar_id1   NUMBER NOT NULL
);

ALTER TABLE jugador
    ADD CONSTRAINT jugador_pk PRIMARY KEY ( jugador_id,
                                            equipo_equipo_id,
                                            equipo_conf_conf_id );

CREATE TABLE liga (
    liga_id              NUMBER(1) NOT NULL,
    playoffs_playoffs_id NUMBER(1) NOT NULL,
    allstar_allstar_id1  NUMBER NOT NULL
);

CREATE UNIQUE INDEX liga__idx ON
    liga (
        allstar_allstar_id1
    ASC );

CREATE UNIQUE INDEX liga__idxv1 ON
    liga (
        playoffs_playoffs_id
    ASC );

ALTER TABLE liga ADD CONSTRAINT liga_pk PRIMARY KEY ( liga_id );

CREATE TABLE playoffs (
    playoffs_id NUMBER(1) NOT NULL
);

ALTER TABLE playoffs ADD CONSTRAINT playoffs_pk PRIMARY KEY ( playoffs_id );

ALTER TABLE conf
    ADD CONSTRAINT conf_liga_fk FOREIGN KEY ( liga_liga_id )
        REFERENCES liga ( liga_id );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_allstar_fk FOREIGN KEY ( allstar_allstar_id1 )
        REFERENCES allstar ( allstar_id1 );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_conf_fk FOREIGN KEY ( conf_conf_id )
        REFERENCES conf ( conf_id );

ALTER TABLE jugador
    ADD CONSTRAINT jugador_allstar_fk FOREIGN KEY ( allstar_allstar_id1 )
        REFERENCES allstar ( allstar_id1 );

ALTER TABLE jugador
    ADD CONSTRAINT jugador_equipo_fk FOREIGN KEY ( equipo_equipo_id,
                                                   equipo_conf_conf_id )
        REFERENCES equipo ( equipo_id,
                            conf_conf_id );

ALTER TABLE liga
    ADD CONSTRAINT liga_allstar_fk FOREIGN KEY ( allstar_allstar_id1 )
        REFERENCES allstar ( allstar_id1 );

ALTER TABLE liga
    ADD CONSTRAINT liga_playoffs_fk FOREIGN KEY ( playoffs_playoffs_id )
        REFERENCES playoffs ( playoffs_id );

CREATE SEQUENCE allstar_allstar_id1_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER allstar_allstar_id1_trg BEFORE
    INSERT ON allstar
    FOR EACH ROW
    WHEN ( new.allstar_id1 IS NULL )
BEGIN
    :new.allstar_id1 := allstar_allstar_id1_seq.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             6
-- CREATE INDEX                             2
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
