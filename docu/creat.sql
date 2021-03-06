CREATE TABLE pf_dept (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  dname VARCHAR(255) NULL,
  dtype TINYINT UNSIGNED NULL,
  pid INTEGER UNSIGNED NOT NULL,
  dtypename VARCHAR(255) NULL,
  bmflag INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(did)
);



CREATE TABLE pf_user (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  uusercode VARCHAR(255) NULL,
  uusername VARCHAR(255) NULL,
  upassword VARCHAR(255) NULL,
  pid INTEGER UNSIGNED NULL,
  ulevel TINYINT UNSIGNED NULL,
  ulevelname VARCHAR(255) NULL,
  uemail VARCHAR(255) NULL,
  ublevel TINYINT UNSIGNED NULL,
  ublevelname VARCHAR(255) NULL,
  PRIMARY KEY(did)
);

CREATE TABLE pf_grade (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  operusercode VARCHAR(255) NULL,
  boperusercode VARCHAR(255) NULL,
  opertiime DATETIME NULL,
  operquarter TINYINT UNSIGNED NULL,
  taccount DECIMAL(4,1) NULL,
  isok TINYINT UNSIGNED NULL DEFAULT 0,
  operuserdid INTEGER UNSIGNED NULL,
  boperuserdid INTEGER UNSIGNED NULL,
  operusername VARCHAR(255) NULL,
  boperusername VARCHAR(255) NULL,
  PRIMARY KEY(did)
);


CREATE TABLE pf_evaluate (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  themean VARCHAR(512) NULL,
  n_maxgrade DECIMAL(4,1) NULL,
  pid INTEGER UNSIGNED NULL,
  thecount DECIMAL(4,1) NULL,
  PRIMARY KEY(did)
);

CREATE TABLE pf_examitem (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  pid INTEGER UNSIGNED NULL,
  itemname VARCHAR(512) NULL,
  itemmaxgrade DECIMAL(4,1) NULL,
  PRIMARY KEY(did)
);

CREATE TABLE pf_category (
  did INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  catename VARCHAR(128) NULL,
  PRIMARY KEY(did)
);