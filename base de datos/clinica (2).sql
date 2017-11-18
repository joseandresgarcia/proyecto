-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2017 a las 08:54:17
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
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `Codigo` varchar(20) NOT NULL,
  `Areas_disponibles` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`Codigo`, `Areas_disponibles`) VALUES
('CARD8', 'CARDIOLOGIA'),
('DERM9', 'DERMATOLOGIA'),
('GINE10', 'GINECOLOGIA'),
('MEDI1', 'MEDICINA INTERNA'),
('NEUR2', 'NEUROLOGIA'),
('NUTR12', 'NUTRICION'),
('ODON3', 'ODONTOLOGIA'),
('OFTA11', 'OFTALMOLOGIA'),
('PEDI6', 'PEDIATRIA'),
('PSIC5', 'PSICOLOGIA'),
('REUM7', 'REUMATOLOGIA'),
('UROL13', 'UROLOGIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallehistoria`
--

CREATE TABLE `detallehistoria` (
  `idDetalleHistoria` int(11) NOT NULL,
  `idHistoriaClinica` int(11) NOT NULL,
  `Motivo de consulta` varchar(60) NOT NULL,
  `Antecedentes patologicos` text NOT NULL,
  `Habitos toxicos` text NOT NULL,
  `Fisiologicos` text NOT NULL,
  `Usuario registrador` varchar(50) NOT NULL,
  `Fecha de registro` datetime NOT NULL,
  `Doctores_idDoctores` int(11) NOT NULL,
  `areas_codigo` varchar(20) DEFAULT NULL,
  `DetalleHistoriacol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE `doctores` (
  `idDoctores` int(11) NOT NULL,
  `Activo` tinyint(1) DEFAULT NULL,
  `areas_Codigo` varchar(20) NOT NULL,
  `Personal_codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`idDoctores`, `Activo`, `areas_Codigo`, `Personal_codigo`) VALUES
(1, 1, 'PEDI6', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiaclinica`
--

CREATE TABLE `historiaclinica` (
  `idHistoriaClinica` int(11) NOT NULL,
  `NumeroHistoria` varchar(45) NOT NULL,
  `CodigoPaciente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historiaclinica`
--

INSERT INTO `historiaclinica` (`idHistoriaClinica`, `NumeroHistoria`, `CodigoPaciente`) VALUES
(1, 'ghg12017', 1),
(2, 'Leo12017', 2),
(3, 'GUT12017', 3),
(4, 'SIL12017', 4),
(5, 'KEV12017', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `idHorario` int(11) NOT NULL,
  `idDoctores` int(11) NOT NULL,
  `Dia` varchar(20) NOT NULL,
  `Hora_Inicio` varchar(20) NOT NULL,
  `Hora_Fin` varchar(10) NOT NULL,
  `Area_Codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `idusuario` varchar(20) NOT NULL,
  `contrasenia` varchar(20) NOT NULL,
  `codigoPersonal` int(11) NOT NULL,
  `Perfil_codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`idusuario`, `contrasenia`, `codigoPersonal`, `Perfil_codigo`) VALUES
('juan', '123', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `CodigoPaciente` int(11) NOT NULL,
  `Apellidos_y_nombres` varchar(100) NOT NULL,
  `Direccion` varchar(250) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `telefono` int(10) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `DNI` varchar(15) NOT NULL,
  `Lugar_de_nacimiento` varchar(20) NOT NULL,
  `Nacionalidad` varchar(20) NOT NULL,
  `Estado_civil` varchar(20) NOT NULL,
  `rutaimagen` varchar(100) DEFAULT NULL,
  `imagen` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`CodigoPaciente`, `Apellidos_y_nombres`, `Direccion`, `Correo`, `Sexo`, `telefono`, `Fecha_Nacimiento`, `DNI`, `Lugar_de_nacimiento`, `Nacionalidad`, `Estado_civil`, `rutaimagen`, `imagen`) VALUES
(1, 'ghghghjghjhjghjghhgjghj', 'jhgjghj', 'hgjghjghj', '0', 656456, '1996-11-15', '65655', 'bvcvcvvvvb', 'fdvfdvfdvfb', 'CASAD@', 'J:PROYECTO CLINICAFOTOS DE PACIENTES\rosa.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d4061346633336664),
(2, 'Leon PeresJesus', 'Mz G Lt 5 LOS ALISOS ', 'jesush@gmailcom', '0', 991840518, '1997-11-12', '70540058', 'lima', 'peruano', 'SOLTER@', 'C:Userspc1DocumentsGitHubproyectoFOTOS DE PACIENTESjulio.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d4032336661383164),
(3, 'GUTIERRES MERINOCARMEN', 'CALLE 3 ,SAN ISIDRO', 'camen21@gmai.com', '0', 99184005, '1990-11-16', '70540059', 'Piura', 'Peruana', 'CASAD@', 'C:Userspc1DocumentsGitHubproyectoFOTOS DE PACIENTESjuana.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403263643166326361),
(4, 'SILVA SILVAROSA MARIA', 'Mz5 Lt 1 LOS JAZMINEZ', 'rosass@gmaiñ.com', '0', 991840515, '1996-11-19', '70560059', 'tumbes', 'peruana', 'SOLTER@', 'C:Userspc1DocumentsGitHubproyectoFOTOS DE PACIENTES\rosa.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403134653836646239),
(5, 'KEVIN BERNAOLALUJAN KEVIN', 'Mz U Lt 2 los olivos', 'kevin321@hotmail.com', 'MASCULINO', 99228561, '1994-11-12', '70540052', 'tacna', 'peruana', 'SOLTER@', 'C:Userspc1DocumentsGitHubproyectoFOTOS DE PACIENTESsebastian.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403761393130356264);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `codigo` int(11) NOT NULL,
  `Descripcion` varchar(15) NOT NULL,
  `Activo` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`codigo`, `Descripcion`, `Activo`) VALUES
(1, 'doctor', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `DNI` varchar(15) NOT NULL,
  `estado_civil` varchar(30) NOT NULL,
  `especialidad` varchar(50) DEFAULT NULL,
  `pais` varchar(30) NOT NULL,
  `provincia` varchar(30) NOT NULL,
  `distrito` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `sueldo_por_hora` decimal(7,2) NOT NULL,
  `sueldo_horas_extras` decimal(7,2) NOT NULL,
  `fecha_de_registro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Activo` tinyint(1) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`codigo`, `nombre`, `fecha_nacimiento`, `DNI`, `estado_civil`, `especialidad`, `pais`, `provincia`, `distrito`, `direccion`, `sueldo_por_hora`, `sueldo_horas_extras`, `fecha_de_registro`, `Activo`) VALUES
(1, 'juan', '1997-02-23', '70540056', 'soltero', NULL, 'peru', 'lima', 'santa rosa', 'Mz U Lt 2 campamento piedras gordas', '50.00', '70.00', '2017-05-19 00:00:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicos`
--

CREATE TABLE `servicos` (
  `idServicos` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Precio` varchar(45) DEFAULT NULL,
  `areas_Codigo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicos_has_detallehistoria`
--

CREATE TABLE `servicos_has_detallehistoria` (
  `idServicos` int(11) NOT NULL,
  `idDetalleHistoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `Areas disponibles` (`Areas_disponibles`);

--
-- Indices de la tabla `detallehistoria`
--
ALTER TABLE `detallehistoria`
  ADD PRIMARY KEY (`idDetalleHistoria`),
  ADD KEY `fk_historia_clinica_HistoriaClinica1_idx` (`idHistoriaClinica`),
  ADD KEY `fk_DetalleHistoria_Doctores1_idx` (`Doctores_idDoctores`);

--
-- Indices de la tabla `doctores`
--
ALTER TABLE `doctores`
  ADD PRIMARY KEY (`idDoctores`),
  ADD KEY `fk_Doctores_areas2_idx` (`areas_Codigo`),
  ADD KEY `fk_Doctores_Personal1_idx` (`Personal_codigo`);

--
-- Indices de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD PRIMARY KEY (`idHistoriaClinica`),
  ADD KEY `fk_HistoriaClinica_Pacientes1_idx` (`CodigoPaciente`);

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`idHorario`),
  ADD KEY `fk_horarios_Doctores1_idx` (`idDoctores`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idusuario`),
  ADD KEY `fk_login_Personal_idx` (`codigoPersonal`),
  ADD KEY `fk_login_Perfil1_idx` (`Perfil_codigo`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`CodigoPaciente`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`idServicos`),
  ADD KEY `fk_Servicos_areas1_idx` (`areas_Codigo`);

--
-- Indices de la tabla `servicos_has_detallehistoria`
--
ALTER TABLE `servicos_has_detallehistoria`
  ADD PRIMARY KEY (`idServicos`,`idDetalleHistoria`),
  ADD KEY `fk_Servicos_has_DetalleHistoria_DetalleHistoria1_idx` (`idDetalleHistoria`),
  ADD KEY `fk_Servicos_has_DetalleHistoria_Servicos1_idx` (`idServicos`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detallehistoria`
--
ALTER TABLE `detallehistoria`
  MODIFY `idDetalleHistoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `doctores`
--
ALTER TABLE `doctores`
  MODIFY `idDoctores` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  MODIFY `idHistoriaClinica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `horarios`
--
ALTER TABLE `horarios`
  MODIFY `idHorario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `CodigoPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `perfil`
--
ALTER TABLE `perfil`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallehistoria`
--
ALTER TABLE `detallehistoria`
  ADD CONSTRAINT `fk_DetalleHistoria_Doctores1` FOREIGN KEY (`Doctores_idDoctores`) REFERENCES `doctores` (`idDoctores`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_historia_clinica_HistoriaClinica1` FOREIGN KEY (`idHistoriaClinica`) REFERENCES `historiaclinica` (`idHistoriaClinica`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `doctores`
--
ALTER TABLE `doctores`
  ADD CONSTRAINT `fk_Doctores_Personal1` FOREIGN KEY (`Personal_codigo`) REFERENCES `personal` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Doctores_areas2` FOREIGN KEY (`areas_Codigo`) REFERENCES `areas` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD CONSTRAINT `fk_HistoriaClinica_Pacientes1` FOREIGN KEY (`CodigoPaciente`) REFERENCES `pacientes` (`CodigoPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD CONSTRAINT `fk_horarios_Doctores1` FOREIGN KEY (`idDoctores`) REFERENCES `doctores` (`idDoctores`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `fk_login_Perfil1` FOREIGN KEY (`Perfil_codigo`) REFERENCES `perfil` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_login_Personal` FOREIGN KEY (`codigoPersonal`) REFERENCES `personal` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `servicos`
--
ALTER TABLE `servicos`
  ADD CONSTRAINT `fk_Servicos_areas1` FOREIGN KEY (`areas_Codigo`) REFERENCES `areas` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `servicos_has_detallehistoria`
--
ALTER TABLE `servicos_has_detallehistoria`
  ADD CONSTRAINT `fk_Servicos_has_DetalleHistoria_DetalleHistoria1` FOREIGN KEY (`idDetalleHistoria`) REFERENCES `detallehistoria` (`idDetalleHistoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Servicos_has_DetalleHistoria_Servicos1` FOREIGN KEY (`idServicos`) REFERENCES `servicos` (`idServicos`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
