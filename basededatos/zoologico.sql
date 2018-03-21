-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: zoologico
-- ------------------------------------------------------
-- Server version	5.7.21-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anim_permanente`
--

DROP TABLE IF EXISTS `anim_permanente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anim_permanente` (
  `id` varchar(5) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `fecha_add` date DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anim_permanente`
--

LOCK TABLES `anim_permanente` WRITE;
/*!40000 ALTER TABLE `anim_permanente` DISABLE KEYS */;
INSERT INTO `anim_permanente` VALUES ('1','1','2018-03-29','1'),('2',NULL,'2018-03-12','Sano');
/*!40000 ALTER TABLE `anim_permanente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `anim_prestados`
--

DROP TABLE IF EXISTS `anim_prestados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anim_prestados` (
  `id` varchar(5) NOT NULL,
  `fecha_pres` date DEFAULT NULL,
  `fecha_dev` date DEFAULT NULL,
  `zoo_propietario` varchar(45) DEFAULT NULL,
  `contacto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anim_prestados`
--

LOCK TABLES `anim_prestados` WRITE;
/*!40000 ALTER TABLE `anim_prestados` DISABLE KEYS */;
INSERT INTO `anim_prestados` VALUES ('1','2018-03-23','2018-03-03','1','1');
/*!40000 ALTER TABLE `anim_prestados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animales`
--

DROP TABLE IF EXISTS `animales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `animales` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `especie` varchar(45) DEFAULT NULL,
  `pais_origen` varchar(45) DEFAULT NULL,
  `estatus` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `dieta` varchar(45) DEFAULT NULL,
  `sexo` enum('H','M') DEFAULT NULL,
  `nivel_riesgo` varchar(45) DEFAULT NULL,
  `id_habitad` varchar(5) DEFAULT NULL,
  `pres_prop` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_habitad` (`id_habitad`),
  KEY `pres_prop` (`pres_prop`),
  CONSTRAINT `animales_ibfk_1` FOREIGN KEY (`id_habitad`) REFERENCES `habitad` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `animales_ibfk_2` FOREIGN KEY (`pres_prop`) REFERENCES `anim_permanente` (`id`),
  CONSTRAINT `animales_ibfk_3` FOREIGN KEY (`pres_prop`) REFERENCES `anim_prestados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animales`
--

LOCK TABLES `animales` WRITE;
/*!40000 ALTER TABLE `animales` DISABLE KEYS */;
INSERT INTO `animales` VALUES (1,'1','1','1','1',1,1,'1','M','1','2','1');
/*!40000 ALTER TABLE `animales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuida`
--

DROP TABLE IF EXISTS `cuida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuida` (
  `id` int(10) NOT NULL,
  `id_cuidador` varchar(5) DEFAULT NULL,
  `id_animal` int(11) DEFAULT NULL,
  `turno` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cuidador` (`id_cuidador`),
  KEY `id_animal` (`id_animal`),
  CONSTRAINT `cuida_ibfk_1` FOREIGN KEY (`id_cuidador`) REFERENCES `cuidadores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cuida_ibfk_2` FOREIGN KEY (`id_animal`) REFERENCES `animales` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuida`
--

LOCK TABLES `cuida` WRITE;
/*!40000 ALTER TABLE `cuida` DISABLE KEYS */;
INSERT INTO `cuida` VALUES (1,'1',1,'Matutino','2018-03-12');
/*!40000 ALTER TABLE `cuida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuidadores`
--

DROP TABLE IF EXISTS `cuidadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuidadores` (
  `id` varchar(5) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `estatus` varchar(45) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuidadores`
--

LOCK TABLES `cuidadores` WRITE;
/*!40000 ALTER TABLE `cuidadores` DISABLE KEYS */;
INSERT INTO `cuidadores` VALUES ('1','1','1','1','1','1','2018-03-11');
/*!40000 ALTER TABLE `cuidadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitad`
--

DROP TABLE IF EXISTS `habitad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitad` (
  `id` varchar(5) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `clima` varchar(45) DEFAULT NULL,
  `dimension` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitad`
--

LOCK TABLES `habitad` WRITE;
/*!40000 ALTER TABLE `habitad` DISABLE KEYS */;
INSERT INTO `habitad` VALUES ('2','habitad de leones','semi calido',500),('3','habitad de monos','templado',500);
/*!40000 ALTER TABLE `habitad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `revisiones`
--

DROP TABLE IF EXISTS `revisiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `revisiones` (
  `id` int(10) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `tratamiento` varchar(45) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `estatus` varchar(45) DEFAULT NULL,
  `id_animal` int(11) DEFAULT NULL,
  `concentrado` int(11) DEFAULT NULL,
  `id_veterinario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_animal` (`id_animal`),
  KEY `id_veterinario` (`id_veterinario`),
  CONSTRAINT `revisiones_ibfk_1` FOREIGN KEY (`id_animal`) REFERENCES `animales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `revisiones_ibfk_2` FOREIGN KEY (`id_veterinario`) REFERENCES `veterinarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revisiones`
--

LOCK TABLES `revisiones` WRITE;
/*!40000 ALTER TABLE `revisiones` DISABLE KEYS */;
/*!40000 ALTER TABLE `revisiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veterinarios`
--

DROP TABLE IF EXISTS `veterinarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veterinarios` (
  `id` int(10) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `especiaidad` varchar(45) DEFAULT NULL,
  `f_ingreso` date DEFAULT NULL,
  `slario` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veterinarios`
--

LOCK TABLES `veterinarios` WRITE;
/*!40000 ALTER TABLE `veterinarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `veterinarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-20 23:51:31
