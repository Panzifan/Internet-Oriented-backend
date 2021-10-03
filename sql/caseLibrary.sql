DROP TABLE IF EXISTS `LawList`;
CREATE TABLE `LawList` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`title` varchar(255) NOT NULL,
`lawNumber` varchar(255) DEFAULT NULL,
`lawType` varchar(255) NOT NULL,
`publicDepartment` varchar(255) NOT  NULL,
`level` varchar(255) NOT NULL,
`publicDate` varchar(11) NOT  NULL,
`executeDate` varchar (11) NOT NULL,
`explainDepartment` varchar(255) DEFAULT NULL ,
`operator` varchar (255) NOT NULL,
`entryTime` varchar(11) NOT NULL,
`content` BLOB NOT NULL,
`state` char(1) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

BEGIN;
INSERT INTO `LawList` VALUES (1,'法律1','230000','刑事法案','司法部','高级','2021-07-08','2021-09-01',NULL,'潘xx','2021-10-03',
'xxxxxxxxxxx','1');
COMMIT;


DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
`email` varchar(255) DEFAULT NULL,
`password` varchar(255) NOT NULL,
`username` varchar(255) DEFAULT NULL,
`phonenumber` varchar(13) DEFAULT NULL,
`usertype` varchar(255) DEFAULT NULL,
`department` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

BEGIN;
INSERT INTO `User` VALUES (1,'111@qq.com','123456','xxx','12315','管理员','司法部');
COMMIT;