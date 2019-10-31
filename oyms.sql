/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : oyms

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-10-31 17:28:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodName` varchar(255) DEFAULT NULL,
  `goodtype` varchar(255) DEFAULT NULL,
  `goodprice` float DEFAULT NULL,
  `goodnum` bigint(20) DEFAULT NULL,
  `gooddesc` varchar(255) DEFAULT NULL,
  `goodImgUrl` varchar(255) DEFAULT NULL,
  `isDelete` tinyint(4) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('37', '的sss', '女装', '1', '1', '', '', '0', '2019-10-31 09:24:03');
INSERT INTO `goods` VALUES ('38', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 00:00:00');
INSERT INTO `goods` VALUES ('39', '的', '女装', '1', '1', '', '', '0', '2019-10-28 02:28:01');
INSERT INTO `goods` VALUES ('40', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 02:29:23');
INSERT INTO `goods` VALUES ('41', '等等dd', '女装', '1', '1', '', '', '0', '2019-10-31 09:23:58');
INSERT INTO `goods` VALUES ('42', '等等fff', '女装', '1', '1', '发', 'http://lrplt.cn-bj.ufileos.com/017a4207-7290-409c-948a-6f5e2c04494c.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=OdTw5Ey8jVuz%2FVU7fnRtVTHyH%2B4%3D&Expires=1887589957', '0', '2019-10-31 09:22:57');
INSERT INTO `goods` VALUES ('43', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 16:52:25');
INSERT INTO `goods` VALUES ('44', 'dddd', '女装', '2', '2', '', '', '0', '2019-10-31 09:21:56');
INSERT INTO `goods` VALUES ('45', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 16:54:47');
INSERT INTO `goods` VALUES ('46', 'rrrr', '女装', '2', '2', '', '', '0', '2019-10-31 09:21:43');
INSERT INTO `goods` VALUES ('47', 'dd', '女装', '1', '1', '', '', '0', '2019-10-29 10:06:23');
INSERT INTO `goods` VALUES ('48', 'f', '女装', '1', '1', '', 'http://lrplt.cn-bj.ufileos.com/1b0d60a5-63a4-4c90-a6c4-4e07e588e18a.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=LhmwUoY%2BuqiBuXDh9FuHI40keRk%3D&Expires=1887677061', '0', '2019-10-29 10:46:39');
INSERT INTO `goods` VALUES ('49', 'd', '女装', '1', '1', '', '', '0', '2019-10-29 14:44:18');
INSERT INTO `goods` VALUES ('50', '1', '女装', '1', '1', '', '', '0', '2019-10-29 16:18:54');
INSERT INTO `goods` VALUES ('51', 'ces', '女装', '1', '1', 'fff', 'http://lrplt.cn-bj.ufileos.com/d1494529-c4e5-43b5-909b-90b2f3f891c8.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=uy9HIMWXOVDuxk6oE8H1EWGmqQ0%3D&Expires=1887844857', '0', '2019-10-31 09:20:58');
INSERT INTO `goods` VALUES ('52', 'rrr', '女装', '2', '2', 'ddd', '', '0', '2019-10-31 09:21:05');
INSERT INTO `goods` VALUES ('53', 'rrrr', '女装', '2', '2', '', '', '0', '2019-10-31 09:21:13');

-- ----------------------------
-- Table structure for `goodtype`
-- ----------------------------
DROP TABLE IF EXISTS `goodtype`;
CREATE TABLE `goodtype` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `cname` varchar(255) NOT NULL,
  `isdelete` tinyint(4) NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `goodtype_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parenttype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodtype
-- ----------------------------
INSERT INTO `goodtype` VALUES ('19', '8', 'dd', '1', '2019-10-30 01:43:04');
INSERT INTO `goodtype` VALUES ('20', '1', '发', '0', '2019-10-30 01:46:31');
INSERT INTO `goodtype` VALUES ('21', '1', '发给', '0', '2019-10-30 01:46:40');
INSERT INTO `goodtype` VALUES ('22', '9', 'f\'d\'d', '0', '2019-10-30 02:23:01');
INSERT INTO `goodtype` VALUES ('23', '1', '嘎嘎嘎', '0', '2019-10-30 09:01:45');
INSERT INTO `goodtype` VALUES ('24', '10', '方法', '0', '2019-10-30 09:05:44');
INSERT INTO `goodtype` VALUES ('25', '10', '嘎嘎嘎', '0', '2019-10-30 09:05:53');
INSERT INTO `goodtype` VALUES ('26', '10', '牛肉', '0', '2019-10-30 09:06:04');
INSERT INTO `goodtype` VALUES ('27', '11', '牛肉', '1', '2019-10-30 09:06:17');
INSERT INTO `goodtype` VALUES ('28', '1', '男装', '0', '2019-10-30 09:06:26');
INSERT INTO `goodtype` VALUES ('29', '9', 'dd', '0', '2019-10-31 08:36:19');
INSERT INTO `goodtype` VALUES ('30', '9', 'dda', '0', '2019-10-31 08:36:21');
INSERT INTO `goodtype` VALUES ('31', '10', 'dds', '1', '2019-10-31 08:36:32');
INSERT INTO `goodtype` VALUES ('32', '10', 'ddsa', '0', '2019-10-31 08:36:34');
INSERT INTO `goodtype` VALUES ('33', '10', 'sda', '0', '2019-10-31 09:24:44');
INSERT INTO `goodtype` VALUES ('34', '12', 'saa', '1', '2019-10-31 09:24:55');
INSERT INTO `goodtype` VALUES ('35', '1', 'ddaa', '0', '2019-10-31 09:27:47');
INSERT INTO `goodtype` VALUES ('36', '13', 'asass', '0', '2019-10-31 09:28:13');
INSERT INTO `goodtype` VALUES ('37', '8', 'asassaa', '0', '2019-10-31 09:28:41');
INSERT INTO `goodtype` VALUES ('38', '12', 'ddd', '0', '2019-10-31 09:35:37');
INSERT INTO `goodtype` VALUES ('39', '12', 'dddss', '1', '2019-10-31 09:35:40');

-- ----------------------------
-- Table structure for `parenttype`
-- ----------------------------
DROP TABLE IF EXISTS `parenttype`;
CREATE TABLE `parenttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL,
  `isdelete` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pname` (`pname`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parenttype
-- ----------------------------
INSERT INTO `parenttype` VALUES ('1', '衣服', '0');
INSERT INTO `parenttype` VALUES ('2', '帽子', '0');
INSERT INTO `parenttype` VALUES ('3', '鞋子', '0');
INSERT INTO `parenttype` VALUES ('5', 'ddd', '0');
INSERT INTO `parenttype` VALUES ('6', 'sss', '0');
INSERT INTO `parenttype` VALUES ('8', '方法', '0');
INSERT INTO `parenttype` VALUES ('9', '分发给', '0');
INSERT INTO `parenttype` VALUES ('10', '裤子', '0');
INSERT INTO `parenttype` VALUES ('11', '零食', '0');
INSERT INTO `parenttype` VALUES ('12', 'gd', '0');
INSERT INTO `parenttype` VALUES ('13', 'fffff', '0');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '普通管理员');
INSERT INTO `role` VALUES ('3', '普通用户');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) DEFAULT NULL,
  `userPassword` varchar(100) DEFAULT NULL,
  `userImg` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6', 'admin', '1', 'http://lrplt.cn-bj.ufileos.com/2d2b52c6-77e0-4b9c-a697-851d09e1b88e.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=Ps7cIwkUX9%2BomcLMwmVDYO7W3yc%3D&Expires=1887416181', '2019-10-26 00:00:00', '1');
INSERT INTO `user` VALUES ('7', 'admi', '1', '', '2019-10-26 00:00:00', null);
INSERT INTO `user` VALUES ('8', 'adm', '12345678', 'http://lrplt.cn-bj.ufileos.com/ed0a5cf2-5022-4f50-a3d5-9903145861c4.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=GE9hnm6sKs719BFBjaSPj1FCkOk%3D&Expires=1887420065', '2019-10-26 00:00:00', null);
INSERT INTO `user` VALUES ('9', 'fff', '12345678', '', '2019-10-28 16:50:54', null);
INSERT INTO `user` VALUES ('11', '12345', '12345678', '', '2019-10-28 16:51:36', null);
INSERT INTO `user` VALUES ('12', '12357', '12345678', '', '2019-10-28 16:52:02', null);
INSERT INTO `user` VALUES ('13', 'admi1', '12345678', '', '2019-10-29 09:10:50', null);
INSERT INTO `user` VALUES ('14', 'adm1', '12345678', '', '2019-10-29 09:12:49', null);
INSERT INTO `user` VALUES ('15', 'dddd', '12345678', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', '2019-10-31 09:07:03', null);
