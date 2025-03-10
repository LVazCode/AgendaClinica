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
-- Table structure for table `tb_exames`
--

DROP TABLE IF EXISTS `tb_exames`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_exames` (
  `id` int NOT NULL AUTO_INCREMENT,
  `exame` varchar(100) DEFAULT NULL,
  `medico` varchar(50) DEFAULT NULL,
  `dia` varchar(50) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `hora` varchar(12) DEFAULT NULL,
  `usuario` varchar(200) DEFAULT NULL,
  `senha` varchar(200) DEFAULT NULL,
  `disponivel` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_exames`
--

LOCK TABLES `tb_exames` WRITE;
/*!40000 ALTER TABLE `tb_exames` DISABLE KEYS */;
INSERT INTO `tb_exames` VALUES (1,'Exame de sangue','Enfermeiro Lucas Ferreira','Quarta-feira','05/06/2024','7:30',NULL,NULL,1),(2,'Exame de sangue','Enfermeiro Lucas Ferreira','Quarta-feira','05/06/2024','7:50','leticia vaz','15620',0),(3,'Exame de sangue','Enfermeiro Lucas Ferreira','Quarta-feira','05/06/2024','8:20',NULL,NULL,1),(4,'Exame de sangue','Enfermeiro Lucas Ferreira','Quarta-feira','05/06/2024','8:40',NULL,NULL,1),(5,'Exame de sangue','Enfermeiro Lucas Ferreira','Quarta-feira','05/06/2024','9:30',NULL,NULL,1),(6,'Endoscopia','Dr. Marcelo Lima','Quarta-feira','05/06/2024','13:30',NULL,NULL,1),(7,'Endoscopia','Dr. Marcelo Lima','Quarta-feira','05/06/2024','14:20',NULL,NULL,1),(8,'Endoscopia','Dr. Marcelo Lima','Quarta-feira','05/06/2024','15:30','leticia vaz','15620',0),(9,'Endoscopia','Dr. Marcelo Lima','Quarta-feira','05/06/2024','16:00',NULL,NULL,1),(10,'Ultrassonografia','Dra. Vanessa Almeida','Quarta-feira','05/06/2024','16:00',NULL,NULL,1),(11,'Ultrassonografia','Dra. Vanessa Almeida','Quarta-feira','05/06/2024','16:30',NULL,NULL,1),(12,'Exame de sangue','Enfermeiro Lucas Ferreira','Quinta-feira','06/06/2024','7:30',NULL,NULL,1),(13,'Exame de sangue','Enfermeiro Lucas Ferreira','Quinta-feira','06/06/2024','8:00','leticia vaz','15620',0),(14,'Exame de sangue','Enfermeiro Lucas Ferreira','Quinta-feira','06/06/2024','8:30',NULL,NULL,1),(15,'Exame de sangue','Enfermeiro Lucas Ferreira','Quinta-feira','06/06/2024','9:00',NULL,NULL,1),(16,'Exame de sangue','Enfermeiro Lucas Ferreira','Quinta-feira','06/06/2024','9:30',NULL,NULL,1),(17,'Ressonância magnética','Dr. Eduardo Pereira','Quinta-feira','06/06/2024','10:30',NULL,NULL,1),(18,'Ressonância magnética','Dr. Eduardo Pereira','Quinta-feira','06/06/2024','13:30',NULL,NULL,1),(19,'Ressonância magnética','Dr. Eduardo Pereira','Quinta-feira','06/06/2024','14:20',NULL,NULL,1),(20,'Oftalmologia','Dra. Ana Ribeiro','Quinta-feira','06/06/2024','14:30',NULL,NULL,1),(21,'Oftalmologia','Dra. Ana Ribeiro','Quinta-feira','06/06/2024','15:20',NULL,NULL,1),(22,'Exame de sangue','Enfermeiro Lucas Ferreira','Sexta-feira','07/06/2024','7:30',NULL,NULL,1),(23,'Exame de sangue','Enfermeiro Lucas Ferreira','Sexta-feira','07/06/2024','8:30',NULL,NULL,1),(24,'Exame de sangue','Enfermeiro Lucas Ferreira','Sexta-feira','07/06/2024','9:20',NULL,NULL,1),(25,'Cistoscopia','Dr. João Moreira','Sexta-feira','07/06/2024','10:30',NULL,NULL,1),(26,'Cistoscopia','Dr. João Moreira','Sexta-feira','07/06/2024','11:30',NULL,NULL,1),(27,'Cistoscopia','Dr. João Moreira','Sexta-feira','07/06/2024','13:10',NULL,NULL,1),(28,'Oftalmologia','Dra. Ana Ribeiro','Sexta-feira','07/06/2024','14:50',NULL,NULL,1),(29,'Oftalmologia','Dra. Ana Ribeiro','Sexta-feira','07/06/2024','15:20',NULL,NULL,1),(30,'Oftalmologia','Dra. Ana Ribeiro','Sexta-feira','07/06/2024','16:15',NULL,NULL,1),(31,'Fundoscopia','Dra. Ana Ribeiro','Sexta-feira','07/06/2024','17:50',NULL,NULL,1);
/*!40000 ALTER TABLE `tb_exames` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-09 14:30:24
