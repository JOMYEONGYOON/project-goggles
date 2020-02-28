CREATE TABLE `member` (
  `no` int NOT NULL AUTO_INCREMENT,
  `id` varchar(45) NOT NULL,
  `name` text,
  `phone` text,
  `birth` text,
  `email` text,
  `gender` text,
  `password` text,
  `etc` text,
  PRIMARY KEY (`no`),
  UNIQUE KEY `id_UNIQUE` (`id`)
)