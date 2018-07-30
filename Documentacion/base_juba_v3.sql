-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 30-07-2018 a las 19:13:06
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_juba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentador_auto`
--

CREATE TABLE `alimentador_auto` (
  `id_aa` int(10) NOT NULL,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `nivel_bateria` float NOT NULL DEFAULT '0',
  `nivel_alimento` float NOT NULL DEFAULT '0',
  `capacidad_max_alimento` float NOT NULL DEFAULT '0',
  `tipo` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `distancia_recorrida` float NOT NULL DEFAULT '0',
  `numero_activaciones` int(100) NOT NULL DEFAULT '0',
  `estado` varchar(20) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `id_alimento` int(10) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `masa_total` float NOT NULL,
  `fecha_expiracion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `id_empresa` int(10) NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `ruc` varchar(13) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `direccion_planta` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `correo` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`id_empresa`, `nombre`, `ruc`, `direccion`, `direccion_planta`, `telefono`, `correo`) VALUES
(1, 'Marbeth', '0990227322001', 'Huancavilca 2128 y Tulcan', 'Chupaderos chicos frente Isla Puna', '2291171', 'marbeth@on.net.ec');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `id_evento` int(10) NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `tipo` varchar(25) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT '0',
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `numero_operadores` int(1) DEFAULT '2',
  `id_piscina` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento_aa`
--

CREATE TABLE `evento_aa` (
  `id_e_aa` int(10) NOT NULL,
  `id_evento` int(10) NOT NULL DEFAULT '0',
  `id_aa` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento_alimento`
--

CREATE TABLE `evento_alimento` (
  `id_e_a` int(10) NOT NULL,
  `id_evento` int(10) NOT NULL DEFAULT '0',
  `id_alimento` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento_operador`
--

CREATE TABLE `evento_operador` (
  `id_e_o` int(10) NOT NULL,
  `id_evento` int(10) NOT NULL DEFAULT '0',
  `id_operador` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logs`
--

CREATE TABLE `logs` (
  `id_log` int(11) NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_hora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tipo` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `prioridad` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `temperatura` float NOT NULL,
  `id_evento` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operador`
--

CREATE TABLE `operador` (
  `id_operador` int(10) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `cedula` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `telefono` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piscina`
--

CREATE TABLE `piscina` (
  `id_piscina` int(10) NOT NULL,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT '0',
  `ubicacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `longitud_ancho` float NOT NULL DEFAULT '0',
  `longitud_largo` float NOT NULL DEFAULT '0',
  `area` float NOT NULL DEFAULT '0',
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `forma` varchar(15) COLLATE utf8_spanish_ci DEFAULT '0',
  `poblacion` int(100) NOT NULL DEFAULT '0',
  `id_empresa` int(10) NOT NULL DEFAULT '0',
  `id_producto` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(10) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombre_cientifico` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `peso_ideal` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `cuenta` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(32) COLLATE utf8_spanish_ci NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `apellidos` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `cedula` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `edad` int(10) NOT NULL DEFAULT '18',
  `direccion` varchar(100) COLLATE utf8_spanish_ci DEFAULT '0',
  `telefono` varchar(10) COLLATE utf8_spanish_ci DEFAULT '0',
  `celular` varchar(10) COLLATE utf8_spanish_ci DEFAULT '0',
  `correo` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` varchar(20) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `cargo` varchar(20) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `fecha_inicio` date DEFAULT NULL,
  `id_empresa` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `cuenta`, `clave`, `nombres`, `apellidos`, `cedula`, `edad`, `direccion`, `telefono`, `celular`, `correo`, `tipo`, `cargo`, `fecha_inicio`, `id_empresa`) VALUES
(3, 'jbajana', '202cb962ac59075b964b07152d234b70', 'Julian', 'Bajaña', '0999999940', 26, 'Mirador del Norte', '2041400', '0982947028', 'jbajana@espol.edu.ec', 'administrador', 'tecnico', '2018-07-30', 1),
(4, 'jjunqui', '202cb962ac59075b964b07152d234b70', 'Jerson', 'Junqui', '0999999240', 26, 'Guayaquil', '0422222', '0999999992', 'jjunqui@espol.edu.ec', 'administrador', 'tecnico', '2018-07-30', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimentador_auto`
--
ALTER TABLE `alimentador_auto`
  ADD PRIMARY KEY (`id_aa`);

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`id_alimento`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id_empresa`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`id_evento`),
  ADD KEY `relacion_evento_piscina` (`id_piscina`);

--
-- Indices de la tabla `evento_aa`
--
ALTER TABLE `evento_aa`
  ADD PRIMARY KEY (`id_e_aa`),
  ADD KEY `FK_evento_ca_evento` (`id_evento`),
  ADD KEY `FK_evento_ca_comedor_auto` (`id_aa`);

--
-- Indices de la tabla `evento_alimento`
--
ALTER TABLE `evento_alimento`
  ADD PRIMARY KEY (`id_e_a`),
  ADD KEY `FK_evento_alimento_evento` (`id_evento`),
  ADD KEY `FK_evento_alimento_alimento` (`id_alimento`);

--
-- Indices de la tabla `evento_operador`
--
ALTER TABLE `evento_operador`
  ADD PRIMARY KEY (`id_e_o`),
  ADD KEY `FK_evento_operador_evento` (`id_evento`),
  ADD KEY `FK_evento_operador_operador` (`id_operador`);

--
-- Indices de la tabla `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`id_log`),
  ADD KEY `relacion_evento_log` (`id_evento`);

--
-- Indices de la tabla `operador`
--
ALTER TABLE `operador`
  ADD PRIMARY KEY (`id_operador`);

--
-- Indices de la tabla `piscina`
--
ALTER TABLE `piscina`
  ADD PRIMARY KEY (`id_piscina`),
  ADD KEY `relacion_piscina_empresa` (`id_empresa`),
  ADD KEY `relacion_piscina_producto` (`id_producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `relacion_usuario_empresa` (`id_empresa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimentador_auto`
--
ALTER TABLE `alimentador_auto`
  MODIFY `id_aa` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `id_alimento` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `id_empresa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
  MODIFY `id_evento` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `evento_aa`
--
ALTER TABLE `evento_aa`
  MODIFY `id_e_aa` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `evento_alimento`
--
ALTER TABLE `evento_alimento`
  MODIFY `id_e_a` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `evento_operador`
--
ALTER TABLE `evento_operador`
  MODIFY `id_e_o` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `operador`
--
ALTER TABLE `operador`
  MODIFY `id_operador` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `piscina`
--
ALTER TABLE `piscina`
  MODIFY `id_piscina` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `relacion_evento_piscina` FOREIGN KEY (`id_piscina`) REFERENCES `piscina` (`id_piscina`);

--
-- Filtros para la tabla `evento_aa`
--
ALTER TABLE `evento_aa`
  ADD CONSTRAINT `FK_evento_ca_comedor_auto` FOREIGN KEY (`id_aa`) REFERENCES `alimentador_auto` (`id_aa`),
  ADD CONSTRAINT `FK_evento_ca_evento` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id_evento`);

--
-- Filtros para la tabla `evento_alimento`
--
ALTER TABLE `evento_alimento`
  ADD CONSTRAINT `FK_evento_alimento_alimento` FOREIGN KEY (`id_alimento`) REFERENCES `alimento` (`id_alimento`),
  ADD CONSTRAINT `FK_evento_alimento_evento` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id_evento`);

--
-- Filtros para la tabla `evento_operador`
--
ALTER TABLE `evento_operador`
  ADD CONSTRAINT `FK_evento_operador_evento` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id_evento`),
  ADD CONSTRAINT `FK_evento_operador_operador` FOREIGN KEY (`id_operador`) REFERENCES `operador` (`id_operador`);

--
-- Filtros para la tabla `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `relacion_evento_log` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id_evento`);

--
-- Filtros para la tabla `piscina`
--
ALTER TABLE `piscina`
  ADD CONSTRAINT `relacion_piscina_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`),
  ADD CONSTRAINT `relacion_piscina_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `relacion_usuario_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
