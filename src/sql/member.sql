CREATE TABLE IF NOT EXISTS`member` (
  `no` int NOT NULL AUTO_INCREMENT,
  `id` varchar(30) DEFAULT NULL,
  `name` text,
  `phone` text,
  `birth` text,
  `email` text,
  `gender` text,
  `password` text,
  `etc` text,
  PRIMARY KEY (`no`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;