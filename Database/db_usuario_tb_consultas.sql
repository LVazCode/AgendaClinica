-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: db_usuario
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_consultas`
--

DROP TABLE IF EXISTS `tb_consultas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_consultas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dia` varchar(50) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `hora` varchar(12) DEFAULT NULL,
  `medico` varchar(50) DEFAULT NULL,
  `especialidade` varchar(200) DEFAULT NULL,
  `usuario` varchar(200) DEFAULT NULL,
  `senha` varchar(200) DEFAULT NULL,
  `disponivel` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_consultas`
--

LOCK TABLES `tb_consultas` WRITE;
/*!40000 ALTER TABLE `tb_consultas` DISABLE KEYS */;
INSERT INTO `tb_consultas` VALUES (1,'Quarta-feira','05/06/2024','8:30','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(2,'Quarta-feira','05/06/2024','9:00','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(3,'Quarta-feira','05/06/2024','9:30','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(4,'Quarta-feira','05/06/2024','10:00','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(5,'Quarta-feira','05/06/2024','10:30','Dra. Mariana Costa','Cardiologia',NULL,NULL,1),(6,'Quarta-feira','05/06/2024','11:30','Dra. Mariana Costa','Cardiologia','leticia vaz','15620',0),(7,'Quarta-feira','05/06/2024','13:40','Dra. Mariana Costa','Cardiologia',NULL,NULL,1),(8,'Quarta-feira','05/06/2024','15:10','Dra. Mariana Costa','Cardiologia',NULL,NULL,1),(9,'Quinta-feira','06/06/2024','7:10','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(10,'Quinta-feira','06/06/2024','8:50','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(11,'Quinta-feira','06/06/2024','9:25','Dr. Gabriel Carvalho','Clinico geral','leticia vaz','15620',0),(12,'Quinta-feira','06/06/2024','9:30','Dr. Felipe Andrade','Ortopedia',NULL,NULL,1),(13,'Quinta-feira','06/06/2024','9:50','Dr. Felipe Andrade','Ortopedia',NULL,NULL,1),(14,'Quinta-feira','06/06/2024','11:20','Dr. Felipe Andrade','Ortopedia',NULL,NULL,1),(15,'Quinta-feira','06/06/2024','16:30','Dr. Felipe Andrade','Ortopedia',NULL,NULL,1),(16,'Quinta-feira','06/06/2024','17:00','Dra. Mariana Costa','Cardiologia',NULL,NULL,1),(17,'Sexta-feira','07/06/2024','7:10','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(18,'Sexta-feira','07/06/2024','8:50','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(19,'Sexta-feira','07/06/2024','9:25','Dr. Gabriel Carvalho','Clinico geral',NULL,NULL,1),(20,'Sexta-feira','07/06/2024','9:25','Dra. Gabriela Santos','Pediatria',NULL,NULL,1),(21,'Sexta-feira','07/06/2024','10:00','Dra. Gabriela Santos','Pediatria',NULL,NULL,1),(22,'Sexta-feira','07/06/2024','10:30','Dra. Gabriela Santos','Pediatria',NULL,NULL,1),(23,'Sexta-feira','07/06/2024','11:10','Dra. Gabriela Santos','Pediatria',NULL,NULL,1),(24,'Sexta-feira','07/06/2024','14:25','Dr. Ricardo Oliveira','Neurologia',NULL,NULL,1),(25,'Sexta-feira','07/06/2024','15:00','Dr. Ricardo Oliveira','Neurologia',NULL,NULL,1),(26,'Sexta-feira','07/06/2024','15:40','Dr. Ricardo Oliveira','Neurologia',NULL,NULL,1),(27,'Sexta-feira','07/06/2024','15:40','Dra. Mariana Costa','Cardiologia',NULL,NULL,1),(28,'Sexta-feira','07/06/2024','15:50','Dr. Felipe Andrade','Ortopedia',NULL,NULL,1);
/*!40000 ALTER TABLE `tb_consultas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-09 14:30:25
