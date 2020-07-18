CREATE TABLE `ds0`.`user_info_0` (
  `uid` INT NOT NULL,
  `age` INT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

CREATE TABLE `ds1`.`user_info_priv_0` (
  `uid` INT NOT NULL,
  `pid` INT NULL,
  `pname` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));
