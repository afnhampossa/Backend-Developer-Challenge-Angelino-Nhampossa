-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Fev-2021 às 14:34
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 7.3.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `challenge_212b`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `paises`
--

CREATE TABLE `paises` (
  `identififcador` int(11) NOT NULL,
  `nome` varchar(200) DEFAULT NULL,
  `regiao` varchar(200) DEFAULT NULL,
  `sub_regiao` varchar(200) DEFAULT NULL,
  `capital` varchar(200) DEFAULT NULL,
  `area` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `paises`
--

INSERT INTO `paises` (`identififcador`, `nome`, `regiao`, `sub_regiao`, `capital`, `area`) VALUES
(18, 'Zimbabwe', 'Africa', 'Africa Austral', 'Harare', '233000km2'),
(19, 'Moçambique', 'Africa', 'Africa Austral', 'Maputo', '27000 km2'),
(20, 'Angola', 'Africa', 'Africa Austral', 'Luanda', '27200 km2'),
(21, 'Estados Unidos da America', 'America', 'America latina', 'Wantshinton', '99200 km2');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`identififcador`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `paises`
--
ALTER TABLE `paises`
  MODIFY `identififcador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
