DROP TABLE IF EXISTS USER;

CREATE TABLE `User` (
  `id` bigint PRIMARY key AUTO_INCREMENT,
  `login` VARCHAR(45),
  `password` VARCHAR(45),
  `name` VARCHAR(45),
  PRIMARY KEY (`id`)
);