-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2017 a las 15:10:39
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
  `Areas_disponibles` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`Codigo`, `Areas_disponibles`) VALUES
('card2', 'cardiologia'),
('medi1', 'medicinageneral'),
('obst', 'obstetricia'),
('ofta1', 'oftalmologia'),
('pedi1', 'pediatria'),
('psic2', 'psicologia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_pacientes`
--

CREATE TABLE `datos_pacientes` (
  `Idhistoria` varchar(20) NOT NULL,
  `Apellidos_y_nombres` varchar(25) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Sexo` varchar(30) NOT NULL,
  `telefono` int(10) NOT NULL,
  `Edad` int(2) NOT NULL,
  `DNI` int(10) NOT NULL,
  `Lugar_de_nacimiento` varchar(20) NOT NULL,
  `Fecha_de_nacimiento` varchar(20) NOT NULL,
  `Nacionalidad` varchar(20) NOT NULL,
  `Estado_civil` varchar(20) NOT NULL,
  `rutaimagen` varchar(100) NOT NULL,
  `imagen` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_pacientes`
--

INSERT INTO `datos_pacientes` (`Idhistoria`, `Apellidos_y_nombres`, `Direccion`, `Correo`, `Sexo`, `telefono`, `Edad`, `DNI`, `Lugar_de_nacimiento`, `Fecha_de_nacimiento`, `Nacionalidad`, `Estado_civil`, `rutaimagen`, `imagen`) VALUES
('aaa12017', 'aaaaab', 's', 'd', 'MASCULINO', 123, 3, 4, 'li', '10/11/2017', 'peruaa', 'VIUD@', 'C:UsersJESUS HAYLENDesktopjbs.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403432363161316663),
('age12017', 'agenteggfghg', 'hghhgjh', 'hgjhjhj', 'ELEGIR', 55353, 25, 543535, 'cvbvcv', '2/11/2017', 'fcgbgnbvb', 'SOLTER@', 'C:Userspc1DesktopIMG-20170721-WA0006.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403332636630323761),
('bra12017', 'brayanghjhmhj', 'hjkgjkghj,', 'jmj,kjhl,', 'MASCULINO', 535363, 55, 245245, '4245242', '2/11/2017', 'dfvcgbcvb', 'SOLTER@', 'C:Userspc1Pictures\resident-evil-retribution-7.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403766663630346434),
('ccc12017', 'cccccccccccccjbjbhjv', 'jjjjjjjjjjjj', 'ggcghcjhv', 'MASCULINO', 9899, 89, 999998, 'bjkbjb', '4/11/2017', 'jklnjnkjnk', 'SOLTER@', 'C:UsersJESUS HAYLENDesktopjaneth.png', 0x6a6176612e696f2e46696c65496e70757453747265616d403432613634373935),
('clinica0007', 'perez hurtado jose', 'av.sol mz.l lt.16 chorrillos', 'josepehur@hotmail.com', 'masculino', 956142307, 50, 79456154, 'ayacucho-peru', '24/06/1967', 'peuano', 'casado', '', ''),
('clinica0052', 'lopez hernadez manuel', 'av.esperanza mz.25 lt.15 V.E.S', 'manuellopher@gmail.com', 'masculino', 967852157, 32, 9456123, 'lima-peru', '15/10/1985', 'peruano', 'soltero', '', ''),
('clinica0165', 'giurfa francia melisa', 'av.pachacutec mz.k lt.45 Ate', 'meligiur12@gmail.com', 'femenino', 956457820, 26, 9456127, 'lima-peru', '10/07/1991', 'peruana', 'soltero', '', ''),
('CUZ12017', 'CUZCANO PALOMINORAQUEL', 'MU LT2 CAMPAMENTO PIEDRAS GORDAS', 'Raqueldelpilar@hotmail.com', 'FEMENINO', 99184054, 46, 991840545, 'LIMA', '30/6/1986', 'PERUANA', 'CASAD@', '', ''),
('ddd12017', 'ddddddddddddjuancarlos', 'dgdfgfdgh', 'fdgfhghghj', 'MASCULINO', 5656, 55, 45545, 'rrtrtyetru', '3/11/2017', 'grtrtytu', 'CASAD@', 'E:18 culi101MSDCFDSC05922.JPG', 0x6a6176612e696f2e46696c65496e70757453747265616d403630396631366434),
('ddf12017', 'ddffdffdfdfdf', 'fdfdfdf', 'ffdfdfdfd', 'MASCULINO', 4535635, 53, 3233, 'cvcvcv', '2/11/2017', 'cvcvcvcv', 'CASAD@', '', ''),
('fat12017', 'fatasmafgfgdfgfh', 'fghgfh', 'gfhgj', 'ELEGIR', 45656, 65, 5645656, 'vcbb', '2/11/2017', 'cbcvbvb', 'SOLTER@', 'C:Userspc1Desktoplimpiar.png', 0x6a6176612e696f2e46696c65496e70757453747265616d403765656466326163),
('fff12017', 'fffffffffffffffffffff', 'fffffffffff', 'fffffffffffffff', 'MASCULINO', 12, 32, 32, 'fffffffffff', '2/11/2017', 'fffffff', 'SOLTER@', 'C:UsersJESUS HAYLENDesktop1505978436.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403137633339663637),
('fghghghgj', 'fghghghgj', 'gjhgj', 'ghjh', 'ELEGIR', 546, 55, 5656, 'vbvnbn', '2/11/2017', 'bghhgj', 'SOLTER@', '', ''),
('g1', 'garcia cuzcanojose andres', 'Mz u Lt 2 ', 'JandresGarcia1@hotmail.com', 'ELEGIR', 991841804, 20, 70540056, 'lima', '12/11/2009', 'peruana', 'ELEGIR', '', ''),
('GAA12017', 'GARCIA CUZCANOJOSE ANDRES', 'MU LT2 ASOC.SEÑOR DE LOS MILAGROS ', 'JandresGarcia1@hotmail.com', 'MASCULINO', 991841804, 20, 70540056, 'LIMA', '23/2/1997', 'PERUANA', 'SOLTER@', '', ''),
('gar12017', 'garciacristina', 'fgdfgfg', 'hfghgjj', 'FEMENINO', 654656, 66, 6665, 'vcvbcbvb', '2/11/2017', 'vbvbvbvbv', 'CASAD@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403761383637666539),
('gdg12017', 'gdgfgfdgfdgfdgf', 'gfgfgfg', 'gfggfhghfgh', 'ELEGIR', 54555, 55, 4544, 'bvhhgh', '1/11/2017', 'gbggn', 'SOLTER@', 'I:SAM_8197.JPG', 0x6a6176612e696f2e46696c65496e70757453747265616d4032643233623961),
('ggg12017', 'gggggggggggggggggggggg', 'gg', 'vds', 'MASCULINO', 9999999, 12, 8765433, 'bcb', '16/11/2017', 'lima', 'SOLTER@', 'C:UsersJESUS HAYLENDesktopaxl.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403464363461656263),
('jua12017', 'juanachaggfghg', 'hghhgjh', 'hgjhjhj', 'ELEGIR', 55353, 25, 543535, 'cvbvcv', '2/11/2017', 'fcgbgnbvb', 'SOLTER@', 'C:Userspc1DesktopIMG-20170721-WA0006.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403561343134626633),
('kkk12017', 'kkkkkkkkkkkkkfghdhg', 'jghjghj', 'ghjh', 'ELEGIR', 66, 66, 6666, 'vcb', '2/11/2017', 'vcfb', 'SOLTER@', 'E:18 culi101MSDCFDSC05937.JPG', 0x6a6176612e696f2e46696c65496e70757453747265616d4062653039343436),
('lll12017', 'lllllllllllllllllllllll', 'lllllllllllllll', 'llllllllll', 'MASCULINO', 3, 3, 3, 'jjjjjj', '2/11/2017', 'llllllll', 'SOLTER@', 'C:Userspc1DesktopCaptura.PNG', 0x6a6176612e696f2e46696c65496e70757453747265616d403739623937376630),
('luc12017', 'luciamaria', 'ffgbfghg', 'hjghjhjkh', 'MASCULINO', 6566, 57, 546566, 'cvbcbcvb', '2/11/2017', 'bgbgbvgnhh', 'SOLTER@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403466323161633066),
('mar12017', 'marianacbcghdghgnd', 'fdgfhfh', 'dfgfhgtr', 'MASCULINO', 9090998, 88, 88888889, 'bcvxbfnhf', '4/11/2017', 'dfgfdhghfhhg', 'SOLTER@', 'F:SAM_8197.JPG', 0x6a6176612e696f2e46696c65496e70757453747265616d403334373536356337),
('rif12017', 'rifuanamaria', 'ffgbfghg', 'hjghjhjkh', 'MASCULINO', 6566, 57, 546566, 'cvbcbcvb', '2/11/2017', 'bgbgbvgnhh', 'SOLTER@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403536666438373762),
('rmi12017', 'rmichelmaria', 'ffgbfghg', 'hjghjhjkh', 'MASCULINO', 6566, 57, 546566, 'cvbcbcvb', '2/11/2017', 'bgbgbvgnhh', 'SOLTER@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403764346366633736),
('vvv12017', 'vvvvvvvvvvvvvvvvvfdgdgf', 'fgfdhd', 'fghfghg', 'MASCULINO', 42454, 44, 444444, '44444414', '2/11/2017', 'dfvdfgbgfb', 'SOLTER@', 'C:Userspc1DownloadsCaptura.PNG', 0x6a6176612e696f2e46696c65496e70757453747265616d403433326466316565),
('zau12017', 'zaulasofia', 'sdsdsf', 'dsfdsfdf', 'ELEGIR', 646849215, 45, 535656, 'fdgfdgdfg', '1/11/2017', 'ffdgfdg', 'SOLTER@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403338656664393033),
('zzz12017', 'zzzzzzzzzzzgdfhg', 'jfghfgjfgh', 'fjghjghj', 'MASCULINO', 866, 44, 45457, 'fccbvbvg', '2/11/2017', 'cbcgb', 'SOLTER@', 'C:Userspc1Desktopmujer1.jpg', 0x6a6176612e696f2e46696c65496e70757453747265616d403164633833633366);

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `idusuario` varchar(20) NOT NULL,
  `contraseña` varchar(20) NOT NULL
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
-- Indices de la tabla `datos_pacientes`
--
ALTER TABLE `datos_pacientes`
  ADD PRIMARY KEY (`Idhistoria`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idusuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
