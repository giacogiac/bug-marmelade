-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           5.1.72-community - MySQL Community Server (GPL)
-- Serveur OS:                   Win64
-- HeidiSQL Version:             8.1.0.4545
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour mistergooddeal
CREATE DATABASE IF NOT EXISTS `mistergooddeal` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mistergooddeal`;


-- Export de la structure de table mistergooddeal. catalogue
CREATE TABLE IF NOT EXISTS `catalogue` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `productname` varchar(45) NOT NULL,
  `productcategory` varchar(45) NOT NULL,
  `productprice` int(10) unsigned NOT NULL,
  `productdescription` varchar(45) NOT NULL,
  `productamount` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- L'exportation de données n'été pas sélectionné.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
