-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
-- Création base de donnée / si existe déjà, supprimer !

DROP DATABASE IF EXISTS Bank;

CREATE DATABASE Bank;
USE Bank;


-- -----------------------------------------------------------------------------
-- - Construction de la table                              ---
-- -----------------------------------------------------------------------------

-- Création table des clients

CREATE TABLE T_Customers (
	IdCust				int(4)		PRIMARY KEY AUTO_INCREMENT,
	Name				varchar(20)	NOT NULL,
	FirstName			varchar(20)	NOT NULL,
	ConnectionNumber		int(4)		NOT NULL DEFAULT 0
) ENGINE = InnoDB;

-- Ajouter des clients à votre table

INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 1, 'sylla' ,	'Djenabou' );
INSERT INTO T_Customers (IdCust, Name, FirstName) VALUES ( 2, 'laude' ,	'timoté' );

-- Création table des Counts

CREATE TABLE T_Counts (
	NumCt			int(20)		PRIMARY KEY AUTO_INCREMENT,
	DateCreation		date(20)	NOT NULL,
	Balance			float(20)	NOT NULL,
        IdCust                          int(4)          NOT NULL,
	ConnectionNumber		int(4)		NOT NULL DEFAULT 0
) ENGINE = InnoDB;

-- Ajouter des comptes

INSERT INTO T_Counts (NumCt, DateCreation, Balance, IdCust) VALUES ( 155625424526, 12.01.2002 , 40000, 1 );
INSERT INTO T_Counts (NumCt, DateCreation, Balance, IdCust) VALUES ( 155625424886, 14.08.2016 , 7000, 2 );
INSERT INTO T_Counts (NumCt, DateCreation, Balance, IdCust) VALUES ( 627727865538, 04.05.2005 , 80000, 1 );
INSERT INTO T_Counts (NumCt, DateCreation, Balance, IdCust) VALUES ( 878776265255, 02.09.2017 , 55000, 2 );

-- Création table des Operations

CREATE TABLE T_Operations (
	NumOp				int(10)		PRIMARY KEY AUTO_INCREMENT,
	Amount				float(20)	NOT NULL,
	NumCt			        int(20)	NOT NULL,
	ConnectionNumber		int(4)		NOT NULL DEFAULT 0
) ENGINE = InnoDB;

-- Ajouter des Operations

INSERT INTO T_Operations (NumOp, Amount, NumCt) VALUES ( 18277766525, 700 , 155625424526 );
INSERT INTO T_Operations (NumOp, Amount, NumCt) VALUES ( 18277766525, 1600 , 627727865538  );



