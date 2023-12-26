DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE IF NOT EXISTS Human_Friends;
USE Human_Friends;

DROP TABLE IF EXISTS `Pets`;
CREATE TABLE IF NOT EXISTS `Pets` (
  `ID` INT PRIMARY KEY,
  `Name` VARCHAR(255),
  `Type` VARCHAR(255),
  `BirthDate` DATE,
  `Commands` VARCHAR(255)
);

DROP TABLE IF EXISTS `PackAnimals`;
CREATE TABLE IF NOT EXISTS `PackAnimals` (
  `ID` INT PRIMARY KEY,
  `Name` VARCHAR(255),
  `Type` VARCHAR(255),
  `BirthDate` DATE,
  `UsedLoad` VARCHAR(255)
);

INSERT INTO `Pets` (`ID`, `Name`, `Type`, `BirthDate`, `Commands`)
VALUES
  (1, 'Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),
  (2, 'Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),
  (3, 'Hammy', 'Hamster', '2021-03-10', 'Roll, Hide'),
  (4, 'Buddy', 'Dog', '2018-12-10', 'Sit, Paw, Bark'),
  (5, 'Smudge', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch'),
  (6, 'Peanut', 'Hamster', '2021-08-01', 'Roll, Spin'),
  (7, 'Bella', 'Dog', '2019-11-11', 'Sit, Stay, Roll'),
  (8, 'Oliver', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');
  SELECT * FROM `Pets`;
  
INSERT INTO `PackAnimals` (`ID`, `Name`, `Type`, `BirthDate`, `UsedLoad`)
VALUES
  (1, 'Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),
  (2, 'Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'),
  (3, 'Eeyore', 'Donkey', '2019-02-28', 'Walk, Carry Load, Bray'),
  (4, 'Storm', 'Horse', '2014-05-05', 'Trot, Canter'),
  (5, 'Dune', 'Camel', '2018-12-12', 'Walk, Sit'),
  (6, 'Burro', 'Donkey', '2019-01-23', 'Walk, Bray, Kick'),
  (7, 'Blaze', 'Horse', '2016-02-29', 'Trot, Jump, Gallop'),
  (8, 'Sahara', 'Camel', '2015-08-14', 'Walk, Run');
SELECT * FROM `PackAnimals`;
  
DELETE FROM `PackAnimals` WHERE `Type` = 'Camel';
SELECT * FROM `PackAnimals`;

CREATE TABLE IF NOT EXISTS `HorsesAndDonkeys` AS
SELECT * FROM `PackAnimals` WHERE `Type` IN ('Horse', 'Donkey');
SELECT * FROM `HorsesAndDonkeys`;
  
CREATE TABLE IF NOT EXISTS `AgeBetween1And3` AS
SELECT * FROM `Pets`
WHERE `BirthDate` BETWEEN '2022-12-23' - INTERVAL 3 YEAR AND '2022-12-23' - INTERVAL 1 YEAR;

SELECT *,
       TIMESTAMPDIFF(YEAR, `BirthDate`, CURDATE()) AS `AgeInYears`,
       TIMESTAMPDIFF(MONTH, `BirthDate`, CURDATE()) % 12 AS `AgeInMonths`
FROM `AgeBetween1And3`;

CREATE TABLE IF NOT EXISTS `AllAnimals` AS
SELECT *, 'Pets' AS `SourceTable` FROM `Pets` 
UNION ALL
SELECT *, 'HorsesAndDonkeys' FROM `HorsesAndDonkeys` 
UNION ALL
SELECT *, 'AgeBetween1And3' FROM `AgeBetween1And3`;
SELECT * FROM `AllAnimals`;
