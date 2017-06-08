-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 08 Juin 2017 à 17:46
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `mysportbets_tp`
--

-- --------------------------------------------------------

--
-- Structure de la table `pari`
--

CREATE TABLE `pari` (
  `ID` int(11) NOT NULL,
  `siteParis` varchar(25) DEFAULT NULL,
  `nmbMatch` int(11) DEFAULT NULL,
  `nmbMatchGagnant` int(11) DEFAULT NULL,
  `mises` float DEFAULT NULL,
  `gains` float NOT NULL,
  `datePari` date DEFAULT NULL,
  `cotesTotale` float NOT NULL,
  `ID_user` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `pari`
--

INSERT INTO `pari` (`ID`, `siteParis`, `nmbMatch`, `nmbMatchGagnant`, `mises`, `gains`, `datePari`, `cotesTotale`, `ID_user`) VALUES
(1, 'unibet', 3, 2, 20, 0, '2017-01-02', 26.72, 1),
(2, 'unibet', 11, 5, 10, 0, '2017-01-05', 150.44, 1),
(3, 'unibet', 12, 10, 20, 0, '2017-01-07', 12.38, 1),
(4, 'unibet', 6, 2, 20, 0, '2017-01-09', 8.25, 1),
(5, 'unibet', 4, 1, 20, 0, '2017-01-13', 25, 1),
(6, 'unibet', 13, 10, 20, 0, '2017-01-14', 21.4, 1),
(7, 'unibet', 5, 2, 20, 0, '2017-01-17', 10.55, 1),
(8, 'unibet', 5, 2, 20, 0, '2017-01-19', 12.63, 1),
(9, 'unibet', 13, 9, 15, 0, '2017-01-21', 27.85, 1),
(10, 'unibet', 13, 11, 5, 0, '2017-01-21', 60.29, 1),
(11, 'unibet', 5, 2, 5, 0, '2017-01-22', 55.1, 1),
(12, 'unibet', 4, 1, 20, 0, '2017-01-28', 13.9, 1),
(13, 'unibet', 4, 1, 20, 0, '2017-01-31', 12.86, 1),
(14, 'unibet', 5, 2, 20, 0, '2017-02-03', 16.39, 1),
(15, 'unibet', 5, 2, 10, 0, '2017-02-04', 41.1, 1),
(16, 'unibet', 13, 8, 10, 0, '2017-02-04', 21.55, 1),
(17, 'unibet', 20, 12, 7, 0, '2017-02-04', 2000, 1),
(18, 'unibet', 4, 3, 20, 0, '2017-02-05', 17.43, 1),
(19, 'unibet', 5, 1, 15, 0, '2017-02-06', 18.87, 1),
(20, 'unibet', 4, 3, 20, 0, '2017-02-07', 10.03, 1),
(21, 'unibet', 4, 2, 5, 0, '2017-02-14', 38.94, 1),
(22, 'unibet', 4, 1, 20, 0, '2017-02-16', 15.84, 1),
(23, 'unibet', 13, 7, 5, 0, '2017-02-16', 218.95, 1),
(24, 'unibet', 4, 2, 20, 0, '2017-02-18', 18.87, 1),
(25, 'unibet', 3, 2, 5, 0, '2017-02-18', 64.13, 1),
(26, 'unibet', 12, 9, 5, 0, '2017-02-19', 133.85, 1),
(27, 'unibet', 9, 4, 10, 0, '2017-02-19', 11.39, 1),
(28, 'unibet', 3, 2, 10, 0, '2017-02-21', 17.73, 1),
(29, 'unibet', 13, 9, 5, 0, '2017-02-25', 30.09, 1),
(30, 'unibet', 13, 9, 5, 0, '2017-02-25', 40.39, 1),
(31, 'unibet', 23, 16, 5, 0, '2017-02-26', 150.26, 1),
(32, 'unibet', 4, 1, 20, 0, '2017-03-01', 7.88, 1),
(33, 'unibet', 6, 5, 20, 0, '2017-03-02', 16.23, 1),
(34, 'unibet', 6, 5, 20, 0, '2017-03-03', 30.87, 1),
(35, 'unibet', 12, 12, 11, 514.56, '2017-03-04', 33.7, 1),
(36, 'unibet', 3, 3, 80, 272.35, '2017-03-04', 3.4, 1),
(37, 'unibet', 8, 5, 27.8, 0, '2017-03-06', 11.5, 1),
(38, 'unibet', 11, 7, 50, 0, '2017-03-06', 10.76, 1),
(39, 'unibet', 8, 5, 20, 0, '2017-03-09', 35, 1),
(40, 'unibet', 10, 7, 50, 0, '2017-03-10', 7.97, 1),
(41, 'unibet', 5, 3, 25, 0, '2017-03-11', 9.71, 1),
(42, 'unibet', 10, 7, 10, 0, '2017-03-12', 16.07, 1),
(43, 'unibet', 5, 3, 15, 0, '2017-03-14', 21.51, 1),
(44, 'unibet', 4, 2, 20, 0, '2017-03-16', 10.88, 1),
(45, 'unibet', 4, 3, 20, 0, '2017-03-18', 9.9, 1),
(46, 'unibet', 13, 9, 4, 0, '2017-03-18', 30, 1),
(47, 'unibet', 3, 1, 1, 0, '2017-03-18', 365.06, 1),
(48, 'unibet', 3, 1, 15, 0, '2017-03-18', 12.7, 1),
(49, 'unibet', 8, 6, 5, 0, '2017-03-19', 50.54, 1),
(50, 'unibet', 9, 7, 20, 0, '2017-03-24', 6.64, 1),
(51, 'unibet', 17, 15, 5, 0, '2017-03-25', 30.46, 1),
(52, 'unibet', 9, 8, 20, 0, '2017-03-26', 7.66, 1),
(53, 'unibet', 21, 16, 7, 0, '2017-03-26', 150, 1),
(54, 'unibet', 4, 3, 20, 0, '2017-03-31', 8.76, 1),
(55, 'unibet', 5, 4, 20, 0, '2017-04-04', 13.38, NULL),
(56, 'unibet', 11, 11, 7, 426.87, '2017-04-04', 45.43, 1),
(57, 'unibet', 1, 0, 3, 0, '2017-04-04', 3.35, 1),
(58, 'unibet', 8, 5, 16.87, 0, '2017-04-05', 28.69, 1),
(59, 'unibet', 10, 4, 20, 0, '2017-04-05', 133.29, 1),
(60, 'unibet', 3, 3, 15, 718.2, '2017-04-07', 47.88, 1),
(61, 'unibet', 5, 2, 5, 0, '2017-04-07', 159.72, 1),
(62, 'unibet', 4, 1, 10, 0, '2017-04-07', 30.76, 1),
(63, 'unibet', 11, 7, 20, 0, '2017-04-07', 30.7, 1),
(64, 'unibet', 4, 2, 50, 0, '2017-04-09', 5.73, 1),
(65, 'unibet', 4, 4, 20, 189.01, '2017-04-09', 9.45, 1),
(66, 'unibet', 13, 9, 9.2, 0, '2017-04-11', 674.66, 1),
(67, 'unibet', 4, 3, 5, 0, '2017-04-11', 38.79, 1),
(68, 'unibet', 2, 0, 5, 0, '2017-04-12', 205.35, 1),
(69, 'unibet', 4, 3, 100, 0, '2017-04-12', 4.73, 1),
(70, 'unibet', 5, 3, 50, 0, '2017-04-13', 10.09, 1),
(71, 'unibet', 3, 0, 20, 0, '2017-04-16', 27.83, 1),
(72, 'unibet', 5, 2, 20, 0, '2017-04-17', 10.09, 1),
(73, 'unibet', 4, 3, 18, 0, '2017-04-21', 14.23, 1),
(74, 'unibet', 3, 1, 20, 0, '2017-04-21', 34.02, 1),
(75, 'unibet', 5, 4, 20, 0, '2017-04-22', 19, 1),
(76, 'unibet', 10, 7, 15, 0, '2017-04-23', 13.4, 1),
(77, 'unibet', 9, 4, 5, 0, '2017-04-23', 40.34, 1),
(78, 'unibet', 4, 2, 20, 0, '2017-04-29', 10.6, 1),
(79, 'unibet', 4, 2, 20, 0, '2017-04-30', 8.05, 1),
(80, 'unibet', 5, 4, 20, 0, '2017-05-03', 7.53, 1),
(83, 'unibet', 10, 9, 2, 0, '2017-05-03', 53.62, 1),
(84, 'unibet', 4, 1, 20, 0, '2017-05-04', 7.61, 1),
(85, 'unibet', 4, 2, 20, 0, '2017-05-06', 15.99, 1),
(86, 'unibet', 10, 9, 20, 0, '2017-05-09', 21.28, 1),
(87, 'unibet', 3, 2, 20, 0, '2017-05-13', 8.19, 1),
(88, 'unibet', 5, 2, 20, 0, '2017-05-14', 15.09, NULL),
(89, 'unibet', 7, 2, 10, 0, '2017-05-14', 60.5, 1),
(90, 'unibet', 4, 3, 20, 0, '2017-05-17', 8.61, 1),
(91, 'unibet', 11, 9, 20, 0, '2017-05-20', 14.14, 1),
(92, 'unibet', 11, 9, 20, 0, '2017-05-22', 14.27, NULL),
(93, 'unibet', 11, 8, 20, 0, '2017-05-29', 9.09, 1),
(94, 'unibet', 1, 0, 10, 0, '2017-06-03', 25, 1),
(95, 'unibet', 3, 0, 10, 0, '2017-06-04', 47.18, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `firstname` varchar(25) DEFAULT NULL,
  `pseudo` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`ID`, `lastname`, `firstname`, `pseudo`, `password`) VALUES
(1, 'Java', 'Professeur de', 'profJava', '123456');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `pari`
--
ALTER TABLE `pari`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_pari_ID_user` (`ID_user`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `pari`
--
ALTER TABLE `pari`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `pari`
--
ALTER TABLE `pari`
  ADD CONSTRAINT `FK_pari_ID_user` FOREIGN KEY (`ID_user`) REFERENCES `user` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
