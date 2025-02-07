-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2025 at 11:29 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assessment`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `pcategory` varchar(255) NOT NULL,
  `pmodel` varchar(255) NOT NULL,
  `myprice` varchar(255) NOT NULL,
  `pdescription` varchar(255) NOT NULL,
  `pimage` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `pname`, `pcategory`, `pmodel`, `myprice`, `pdescription`, `pimage`) VALUES
(1, 'Drew Woodard', 'Voluptate maxime id ', 'Pariatur Qui magnam', '199', 'Architecto modi cum ', 'abcd.jpg'),
(2, 'Drew Woodard', 'Voluptate maxime id ', 'Pariatur Qui magnam', '199', 'Architecto modi cum ', 'abcd.jpg'),
(3, 'Laurel Mcintosh', 'Dolorem nemo do dign', 'Illo voluptate amet', '671', 'Porro fugiat enim in', 'image-wallpaper-15.jpg'),
(4, 'Preston Peterson', 'Maiores sunt aliqua', 'Tempora voluptate ut', '674', 'Atque dolor in nobis', 'image-wallpaper-15.jpg'),
(5, 'Nathan Byers', 'Sit quia omnis sapi', 'Aut quo deserunt est', '60000', 'Praesentium commodo ', 'image-wallpaper-15.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
