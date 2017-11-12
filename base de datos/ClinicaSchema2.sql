-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Clinica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Clinica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Clinica` DEFAULT CHARACTER SET utf8 ;
USE `Clinica` ;

-- -----------------------------------------------------
-- Table `Clinica`.`Perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Perfil` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `Descripcion` VARCHAR(15) NOT NULL,
  `Activo` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`areas` (
  `Codigo` VARCHAR(20) NOT NULL,
  `Areas_disponibles` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`Codigo`),
  INDEX `Areas disponibles` (`Areas_disponibles` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`Pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Pacientes` (
  `CodigoPaciente` INT NOT NULL AUTO_INCREMENT,
  `Apellidos_y_nombres` VARCHAR(100) NOT NULL,
  `Direccion` VARCHAR(250) NOT NULL,
  `Correo` VARCHAR(100) NOT NULL,
  `Sexo` TINYINT(1) NOT NULL,
  `telefono` INT(10) NOT NULL,
  `Fecha_Nacimiento` DATE NOT NULL,
  `DNI` VARCHAR(15) NOT NULL,
  `Lugar_de_nacimiento` VARCHAR(20) NOT NULL,
  `Nacionalidad` VARCHAR(20) NOT NULL,
  `Estado_civil` VARCHAR(20) NOT NULL,
  `rutaimagen` VARCHAR(100) NOT NULL,
  `imagen` BLOB NOT NULL,
  PRIMARY KEY (`CodigoPaciente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`HistoriaClinica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`HistoriaClinica` (
  `idHistoriaClinica` INT NOT NULL AUTO_INCREMENT,
  `NumeroHistoria` VARCHAR(45) NOT NULL,
  `CodigoPaciente` INT NOT NULL,
  PRIMARY KEY (`idHistoriaClinica`),
  INDEX `fk_HistoriaClinica_Pacientes1_idx` (`CodigoPaciente` ASC),
  CONSTRAINT `fk_HistoriaClinica_Pacientes1`
    FOREIGN KEY (`CodigoPaciente`)
    REFERENCES `Clinica`.`Pacientes` (`CodigoPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Clinica`.`Personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Personal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `fecha_nacimiento` DATE NULL,
  `DNI` VARCHAR(15) NOT NULL,
  `estado_civil` VARCHAR(30) NULL,
  `especialidad` VARCHAR(50) NULL,
  `pais` VARCHAR(30) NULL,
  `provincia` VARCHAR(30) NULL,
  `distrito` VARCHAR(20) NULL,
  `direccion` VARCHAR(50) NULL,
  `sueldo_por_hora` DECIMAL(7,2) NULL,
  `sueldo_horas_extras` DECIMAL(7,2) NULL,
  `fecha_de_registro` DATETIME NULL DEFAULT now(),
  `Activo` TINYINT(1) NULL DEFAULT 1,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`Doctores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Doctores` (
  `idDoctores` INT NOT NULL AUTO_INCREMENT,
  `Activo` TINYINT(1) NULL,
  `areas_Codigo` VARCHAR(20) NOT NULL,
  `Personal_codigo` INT NOT NULL,
  PRIMARY KEY (`idDoctores`),
  INDEX `fk_Doctores_areas2_idx` (`areas_Codigo` ASC),
  INDEX `fk_Doctores_Personal1_idx` (`Personal_codigo` ASC),
  CONSTRAINT `fk_Doctores_areas2`
    FOREIGN KEY (`areas_Codigo`)
    REFERENCES `Clinica`.`areas` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Doctores_Personal1`
    FOREIGN KEY (`Personal_codigo`)
    REFERENCES `Clinica`.`Personal` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Clinica`.`DetalleHistoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`DetalleHistoria` (
  `idDetalleHistoria` INT NOT NULL AUTO_INCREMENT,
  `idHistoriaClinica` INT NOT NULL,
  `Motivo de consulta` VARCHAR(60) NOT NULL,
  `Antecedentes patologicos` TEXT NOT NULL,
  `Habitos toxicos` TEXT NOT NULL,
  `Fisiologicos` TEXT NOT NULL,
  `Usuario registrador` VARCHAR(50) NOT NULL,
  `Fecha de registro` DATETIME NOT NULL,
  `Doctores_idDoctores` INT NOT NULL,
  `areas_codigo` VARCHAR(20) NULL,
  `DetalleHistoriacol` VARCHAR(45) NULL,
  INDEX `fk_historia_clinica_HistoriaClinica1_idx` (`idHistoriaClinica` ASC),
  INDEX `fk_DetalleHistoria_Doctores1_idx` (`Doctores_idDoctores` ASC),
  PRIMARY KEY (`idDetalleHistoria`),
  CONSTRAINT `fk_historia_clinica_HistoriaClinica1`
    FOREIGN KEY (`idHistoriaClinica`)
    REFERENCES `Clinica`.`HistoriaClinica` (`idHistoriaClinica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DetalleHistoria_Doctores1`
    FOREIGN KEY (`Doctores_idDoctores`)
    REFERENCES `Clinica`.`Doctores` (`idDoctores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`horarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`horarios` (
  `idHorario` INT NOT NULL AUTO_INCREMENT,
  `idDoctores` INT NOT NULL,
  `Fecha` VARCHAR(20) NOT NULL,
  `Dia` VARCHAR(20) NOT NULL,
  `Hora` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idHorario`),
  INDEX `fk_horarios_Doctores1_idx` (`idDoctores` ASC),
  CONSTRAINT `fk_horarios_Doctores1`
    FOREIGN KEY (`idDoctores`)
    REFERENCES `Clinica`.`Doctores` (`idDoctores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`login` (
  `idusuario` VARCHAR(20) NOT NULL,
  `contrasenia` VARCHAR(20) NOT NULL,
  `codigoPersonal` INT NOT NULL,
  `Perfil_codigo` INT NOT NULL,
  PRIMARY KEY (`idusuario`),
  INDEX `fk_login_Personal_idx` (`codigoPersonal` ASC),
  INDEX `fk_login_Perfil1_idx` (`Perfil_codigo` ASC),
  CONSTRAINT `fk_login_Personal`
    FOREIGN KEY (`codigoPersonal`)
    REFERENCES `Clinica`.`Personal` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_login_Perfil1`
    FOREIGN KEY (`Perfil_codigo`)
    REFERENCES `Clinica`.`Perfil` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Clinica`.`Servicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Servicos` (
  `idServicos` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(45) NULL,
  `Precio` VARCHAR(45) NULL,
  `areas_Codigo` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idServicos`),
  INDEX `fk_Servicos_areas1_idx` (`areas_Codigo` ASC),
  CONSTRAINT `fk_Servicos_areas1`
    FOREIGN KEY (`areas_Codigo`)
    REFERENCES `Clinica`.`areas` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Clinica`.`Servicos_has_DetalleHistoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Clinica`.`Servicos_has_DetalleHistoria` (
  `idServicos` INT NOT NULL,
  `idDetalleHistoria` INT NOT NULL,
  PRIMARY KEY (`idServicos`, `idDetalleHistoria`),
  INDEX `fk_Servicos_has_DetalleHistoria_DetalleHistoria1_idx` (`idDetalleHistoria` ASC),
  INDEX `fk_Servicos_has_DetalleHistoria_Servicos1_idx` (`idServicos` ASC),
  CONSTRAINT `fk_Servicos_has_DetalleHistoria_Servicos1`
    FOREIGN KEY (`idServicos`)
    REFERENCES `Clinica`.`Servicos` (`idServicos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Servicos_has_DetalleHistoria_DetalleHistoria1`
    FOREIGN KEY (`idDetalleHistoria`)
    REFERENCES `Clinica`.`DetalleHistoria` (`idDetalleHistoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
