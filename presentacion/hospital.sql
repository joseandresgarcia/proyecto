-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2017 a las 04:35:36
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `Codigo` varchar(20) NOT NULL,
  `Areas disponibles` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_pacientes`
--

CREATE TABLE `datos_pacientes` (
  `Idhistoria` varchar(20) NOT NULL,
  `Apellidos y nombres` varchar(25) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Sexo` varchar(30) NOT NULL,
  `Cel/Telf` int(10) NOT NULL,
  `Edad` int(2) NOT NULL,
  `DNI` int(10) NOT NULL,
  `Lugar de nacimiento` varchar(20) NOT NULL,
  `Fecha de nacimiento` varchar(20) NOT NULL,
  `Nacionalidad` varchar(20) NOT NULL,
  `Estado civil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_pacientes`
--

INSERT INTO `datos_pacientes` (`Idhistoria`, `Apellidos y nombres`, `Direccion`, `Correo`, `Sexo`, `Cel/Telf`, `Edad`, `DNI`, `Lugar de nacimiento`, `Fecha de nacimiento`, `Nacionalidad`, `Estado civil`) VALUES
('clinica0052', 'lopez hernadez manuel', 'av.esperanza mz.25 lt.15 V.E.S', 'manuellopher@gmail.com', 'masculino', 967852157, 32, 9456123, 'lima-peru', '15/10/1985', 'peruano', 'soltero'),
('clinica0007', 'perez hurtado jose', 'av.sol mz.l lt.16 chorrillos', 'josepehur@hotmail.com', 'masculino', 956142307, 50, 79456154, 'ayacucho-peru', '24/06/1967', 'peuano', 'casado'),
('clinica0165', 'giurfa francia melisa', 'av.pachacutec mz.k lt.45 Ate', 'meligiur12@gmail.com', 'femenino', 956457820, 26, 9456127, 'lima-peru', '10/07/1991', 'peruana', 'soltero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE `historia_clinica` (
  `N°historia-clinica` varchar(50) NOT NULL,
  `Usuario registrador` varchar(50) NOT NULL,
  `Fecha de registro` varchar(50) NOT NULL,
  `Apellidos y nombres` varchar(30) NOT NULL,
  `Sexo` varchar(15) NOT NULL,
  `Motivo de consulta` varchar(60) NOT NULL,
  `Antecedentes patologicos` text NOT NULL,
  `Habitos toxicos` text NOT NULL,
  `Fisiologicos` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
