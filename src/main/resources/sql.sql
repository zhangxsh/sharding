
CREATE TABLE `ds0`.`user_info_0` (
  `uid` BIGINT NOT NULL,
  `age` BIGINT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds0`.`user_info_1` (
  `uid` BIGINT NOT NULL,
  `age` BIGINT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds1`.`user_info_0` (
  `uid` BIGINT NOT NULL,
  `age` BIGINT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds1`.`user_info_1` (
  `uid` BIGINT NOT NULL,
  `age` BIGINT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

CREATE TABLE `ds1`.`user_info_priv_0` (
  `uid` BIGINT NOT NULL,
  `pid` BIGINT NULL,
  `pname` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds1`.`user_info_priv_1` (
  `uid` BIGINT NOT NULL,
  `pid` BIGINT NULL,
  `pname` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds0`.`user_info_priv_0` (
  `uid` BIGINT NOT NULL,
  `pid` BIGINT NULL,
  `pname` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

  CREATE TABLE `ds0`.`user_info_priv_1` (
  `uid` BIGINT NOT NULL,
  `pid` BIGINT NULL,
  `pname` VARCHAR(45) NULL,
  PRIMARY KEY (`uid`));

CREATE TABLE `ds0`.`config` (
  `cid` BIGINT(32) NOT NULL,
  `cname` VARCHAR(45) NULL,
  PRIMARY KEY (`cid`));

CREATE TABLE `ds1`.`config` (
  `cid` BIGINT(32) NOT NULL,
  `cname` VARCHAR(45) NULL,
  PRIMARY KEY (`cid`));
