-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-01-2023 a las 18:41:33
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdencuesta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encuesta`
--

CREATE TABLE `encuesta` (
  `idencuesta` int(11) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  `nacionalidad` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `numviajeros` int(3) NOT NULL,
  `idviajero` int(11) NOT NULL,
  `detalleviajeros` varchar(45) NOT NULL,
  `idtipoviaje` int(11) NOT NULL,
  `idtipoviajedetalle` varchar(250) NOT NULL,
  `idservicio` int(11) NOT NULL,
  `idserviciodetalle` varchar(250) NOT NULL,
  `idmotivo` int(11) NOT NULL,
  `idmotivodetalle` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gasto`
--

CREATE TABLE `gasto` (
  `idgasto` int(11) NOT NULL,
  `idtipogasto` int(11) NOT NULL,
  `valorpropio` float(10,2) NOT NULL,
  `idmonedapropio` int(11) NOT NULL,
  `valornotercero` float(10,2) NOT NULL,
  `idmonedatercero` int(11) NOT NULL,
  `valorsitercero` float(10,2) NOT NULL,
  `idmonedasitercero` int(11) NOT NULL,
  `numpersonas` int(10) NOT NULL,
  `idencuesta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `moneda`
--

CREATE TABLE `moneda` (
  `idmoneda` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuacrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `moneda`
--

INSERT INTO `moneda` (`idmoneda`, `nombre`, `usuacrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Peso Colombiano', 'admin', '2023-01-11 03:21:25', NULL, NULL),
(2, 'Dolar', 'admin', '2023-01-11 03:21:25', NULL, NULL),
(3, 'Euro', 'admin', '2023-01-11 03:21:45', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `motivo`
--

CREATE TABLE `motivo` (
  `idmotivo` int(11) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `usuacrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `motivo`
--

INSERT INTO `motivo` (`idmotivo`, `nombre`, `usuacrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Visita a familiares o amigos', 'admin', '2023-01-11 03:01:32', NULL, NULL),
(2, 'Vacaciones (recreación, ocio, sol y playa)', 'admin', '2023-01-11 03:01:32', NULL, NULL),
(3, 'Compras', 'admin', '2023-01-11 03:01:51', NULL, NULL),
(4, 'Turismo Cultural', 'admin', '2023-01-11 03:01:51', NULL, NULL),
(5, 'Asistencia a eventos artísticos y/o deportivos destino', 'admin', '2023-01-11 03:02:14', NULL, NULL),
(6, 'Estudio y/o formación', 'admin', '2023-01-11 03:02:14', NULL, NULL),
(7, 'Tratamiento de salud y belleza', 'admin', '2023-01-11 03:06:23', NULL, NULL),
(8, 'Religioso', 'admin', '2023-01-11 03:06:23', NULL, NULL),
(9, 'Asistencia a Congresos, Seminarios convenciones', 'admin', '2023-01-11 03:06:47', NULL, NULL),
(10, 'Trabajo remunerado en destino  ', 'admin', '2023-01-11 03:06:47', NULL, NULL),
(11, 'Trabajo o negocios (no remunerado en destino)', 'admin', '2023-01-11 03:07:53', NULL, NULL),
(12, 'Participación en eventos artísticos y/o deportivos', 'admin', '2023-01-11 03:07:53', NULL, NULL),
(13, 'Tránsito', 'admin', '2023-01-11 03:10:47', NULL, NULL),
(14, 'Otro. ¿Cuál?', 'admin', '2023-01-11 03:10:47', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `idservicio` int(11) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `usuacrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`idservicio`, `nombre`, `usuacrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Alojamiento', 'admin', '2023-01-11 03:17:01', NULL, NULL),
(2, 'Transporte internacional ', 'admin', '2023-01-11 03:17:01', NULL, NULL),
(3, 'Alimentos y bebidas (No incluidos en el alojamiento)', 'admin', '2023-01-11 03:17:31', NULL, NULL),
(4, 'Servicios culturales y de entretenimiento.', 'admin', '2023-01-11 03:17:31', NULL, NULL),
(5, 'Servicios deportivos y recreacionales (Ej.: Actividades de  aventura, ecológicas, otros)\r\n', 'admin', '2023-01-11 03:18:58', NULL, NULL),
(6, 'Tours en destino (con servicio de  guía)', 'admin', '2023-01-11 03:18:58', NULL, NULL),
(7, 'Transporte aéreo interno en el destino', 'admin', '2023-01-11 03:19:32', NULL, NULL),
(8, 'Otro transporte interno ¿Cuál?', 'admin', '2023-01-11 03:19:32', NULL, NULL),
(9, 'Otro servicio. ¿Cuál? ', 'admin', '2023-01-11 03:20:17', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipogasto`
--

CREATE TABLE `tipogasto` (
  `idtipogasto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuacrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipogasto`
--

INSERT INTO `tipogasto` (`idtipogasto`, `nombre`, `usuacrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Paquete turístico', 'admin', '2023-01-11 03:22:45', NULL, NULL),
(2, 'Transporte Internacional', 'admin', '2023-01-11 03:22:45', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoviaje`
--

CREATE TABLE `tipoviaje` (
  `idtipoviaje` int(11) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `usuacrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipoviaje`
--

INSERT INTO `tipoviaje` (`idtipoviaje`, `nombre`, `usuacrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Paquete turístico organizado por una agencia de viajes en Colombia', 'admin', '2023-01-11 03:14:04', NULL, NULL),
(2, 'Paquete turístico organizado por una agencia de viajes en el país de visita', 'admin', '2023-01-11 03:14:04', NULL, NULL),
(3, 'Paquete turístico organizado por terceros que no sean agencias de viajes', 'admin', '2023-01-11 03:14:32', NULL, NULL),
(4, 'Viaje organizado por cuenta propia', 'admin', '2023-01-11 03:14:32', NULL, NULL),
(5, 'Otro ¿Cuál?', 'admin', '2023-01-11 03:15:01', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` varchar(45) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `usucrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `contrasena`, `usucrea`, `fechacrea`) VALUES
('cparraga1', 'a7ad0496ba205c3226217e0d0c0e82fc', 'cparraga1', '2023-01-11 10:11:23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viajero`
--

CREATE TABLE `viajero` (
  `idviajero` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usucrea` varchar(45) NOT NULL,
  `fechacrea` datetime NOT NULL,
  `usumodifica` varchar(45) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `viajero`
--

INSERT INTO `viajero` (`idviajero`, `nombre`, `usucrea`, `fechacrea`, `usumodifica`, `fechamodifica`) VALUES
(1, 'Solo', 'admin', '2023-01-11 02:45:57', NULL, NULL),
(2, 'Familia', 'admin', '2023-01-11 02:45:57', NULL, NULL),
(3, 'Compañeros de trabajo y/o estudio', 'admin', '2023-01-11 02:46:42', NULL, NULL),
(4, 'Amigos', 'admin', '2023-01-11 02:46:42', NULL, NULL),
(5, 'Otro.  ¿Cuál? ', 'admin', '2023-01-11 02:47:07', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idvisita` int(11) NOT NULL,
  `pais` varchar(500) NOT NULL,
  `propia` int(10) NOT NULL,
  `hotel` int(10) NOT NULL,
  `familiar` int(10) NOT NULL,
  `alquiler` int(10) NOT NULL,
  `otro` int(10) NOT NULL,
  `idencuesta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encuesta`
--
ALTER TABLE `encuesta`
  ADD PRIMARY KEY (`idencuesta`),
  ADD KEY `fk_encuesta_usuario_idx` (`usuario`),
  ADD KEY `fk_encuesta_viajero1_idx` (`idviajero`),
  ADD KEY `fk_encuesta_tipoviaje1_idx` (`idtipoviaje`),
  ADD KEY `fk_encuesta_servicio1_idx` (`idservicio`),
  ADD KEY `fk_encuesta_motivo1_idx` (`idmotivo`);

--
-- Indices de la tabla `gasto`
--
ALTER TABLE `gasto`
  ADD PRIMARY KEY (`idgasto`),
  ADD KEY `fk_gasto_moneda1_idx` (`idmonedapropio`),
  ADD KEY `fk_gasto_moneda2_idx` (`idmonedatercero`),
  ADD KEY `fk_gasto_moneda3_idx` (`idmonedasitercero`),
  ADD KEY `fk_gasto_tipogasto1_idx` (`idtipogasto`),
  ADD KEY `fk_gasto_encuesta1_idx` (`idencuesta`);

--
-- Indices de la tabla `moneda`
--
ALTER TABLE `moneda`
  ADD PRIMARY KEY (`idmoneda`);

--
-- Indices de la tabla `motivo`
--
ALTER TABLE `motivo`
  ADD PRIMARY KEY (`idmotivo`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`idservicio`);

--
-- Indices de la tabla `tipogasto`
--
ALTER TABLE `tipogasto`
  ADD PRIMARY KEY (`idtipogasto`);

--
-- Indices de la tabla `tipoviaje`
--
ALTER TABLE `tipoviaje`
  ADD PRIMARY KEY (`idtipoviaje`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- Indices de la tabla `viajero`
--
ALTER TABLE `viajero`
  ADD PRIMARY KEY (`idviajero`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idvisita`),
  ADD KEY `fk_visita_encuesta1_idx` (`idencuesta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `encuesta`
--
ALTER TABLE `encuesta`
  MODIFY `idencuesta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `gasto`
--
ALTER TABLE `gasto`
  MODIFY `idgasto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `moneda`
--
ALTER TABLE `moneda`
  MODIFY `idmoneda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `motivo`
--
ALTER TABLE `motivo`
  MODIFY `idmotivo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `idservicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `tipoviaje`
--
ALTER TABLE `tipoviaje`
  MODIFY `idtipoviaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `viajero`
--
ALTER TABLE `viajero`
  MODIFY `idviajero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idvisita` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `encuesta`
--
ALTER TABLE `encuesta`
  ADD CONSTRAINT `fk_encuesta_motivo1` FOREIGN KEY (`idmotivo`) REFERENCES `motivo` (`idmotivo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_encuesta_servicio1` FOREIGN KEY (`idservicio`) REFERENCES `servicio` (`idservicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_encuesta_tipoviaje1` FOREIGN KEY (`idtipoviaje`) REFERENCES `tipoviaje` (`idtipoviaje`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_encuesta_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_encuesta_viajero1` FOREIGN KEY (`idviajero`) REFERENCES `viajero` (`idviajero`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `gasto`
--
ALTER TABLE `gasto`
  ADD CONSTRAINT `fk_gasto_encuesta1` FOREIGN KEY (`idencuesta`) REFERENCES `encuesta` (`idencuesta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gasto_moneda1` FOREIGN KEY (`idmonedapropio`) REFERENCES `moneda` (`idmoneda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gasto_moneda2` FOREIGN KEY (`idmonedatercero`) REFERENCES `moneda` (`idmoneda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gasto_moneda3` FOREIGN KEY (`idmonedasitercero`) REFERENCES `moneda` (`idmoneda`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_gasto_tipogasto1` FOREIGN KEY (`idtipogasto`) REFERENCES `tipogasto` (`idtipogasto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `fk_visita_encuesta1` FOREIGN KEY (`idencuesta`) REFERENCES `encuesta` (`idencuesta`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
