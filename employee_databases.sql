-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2024 at 08:55 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_databases`
--

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `Employee ID` int(6) NOT NULL,
  `First Name` varchar(20) NOT NULL,
  `Last Name` varchar(20) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Salary` varchar(20) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `Comments` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`Employee ID`, `First Name`, `Last Name`, `Gender`, `Salary`, `Department`, `Comments`) VALUES
(89078, 'Samuel', 'Tobias', 'Male', '90000', 'ICT', 'Excellent'),
(89079, 'Roggers', 'Anguzu', 'Male', '100000', 'ICT', 'Excellent'),
(89736, 'Edward', 'Kalonzo', 'Male', '100000', 'ICT', 'Excellent'),
(89273, 'Sanya', 'Emanue', 'Male', '300000', 'MKT', 'Good'),
(97863, 'Linet', 'Chesinen', 'Male', '78600', 'PROC', 'Excellent'),
(89068, 'Dalton', 'Ndirangu', 'Male', '890000', 'MKT', 'Good'),
(89724, 'Linas', 'Mukashumbusho', 'Female', '990000', 'ICT', 'Excellent'),
(89327, 'Mike', 'Kahundo', 'Male', '780000', 'MKT', 'Fair Performance'),
(78900, 'Petronilla', 'Muriithi', 'Female', '20000', 'ICT', 'Fair'),
(89700, 'Salongo', 'Everest', 'Male', '40000', 'PROC', 'Good'),
(90838, 'Michael', 'Njoroge', 'Male', '89000', 'DEV', 'Excellent');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `Password`) VALUES
('Killwe', 'io32'),
('admin', 'admin'),
('group', 'grou['),
('group', 'group'),
('group', 'group'),
('group', 'group'),
('group', 'group'),
('admin', 'admin'),
('jacob', 'jacob'),
('group', 'group');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
