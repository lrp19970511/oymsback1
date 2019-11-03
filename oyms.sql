/*
Navicat MySQL Data Transfer

Source Server         : oy
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : oyms

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-11-04 00:35:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `auditstatus`
-- ----------------------------
DROP TABLE IF EXISTS `auditstatus`;
CREATE TABLE `auditstatus` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `audit_statu` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auditstatus
-- ----------------------------
INSERT INTO `auditstatus` VALUES ('1', '审核通过');
INSERT INTO `auditstatus` VALUES ('2', '审核不通过');
INSERT INTO `auditstatus` VALUES ('3', '待审核');

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
INSERT INTO `goods` VALUES ('37', '的sss', '女装', '1', '1', '', '', '1', '2019-10-31 09:24:03');
INSERT INTO `goods` VALUES ('38', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 00:00:00');
INSERT INTO `goods` VALUES ('39', '的', '女装', '1', '1', '', '', '0', '2019-10-28 02:28:01');
INSERT INTO `goods` VALUES ('40', 'd', '女装', '1', '1', '', '', '0', '2019-10-28 02:29:23');
INSERT INTO `goods` VALUES ('41', '等等dd', '女装', '1', '1', '', '', '1', '2019-10-31 09:23:58');
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
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodtype
-- ----------------------------
INSERT INTO `goodtype` VALUES ('19', '8', 'dd', '0', '2019-10-30 01:43:04');
INSERT INTO `goodtype` VALUES ('20', '1', '发', '0', '2019-10-30 01:46:31');
INSERT INTO `goodtype` VALUES ('21', '1', '发给', '0', '2019-10-30 01:46:40');
INSERT INTO `goodtype` VALUES ('22', '9', 'f\'d\'d', '1', '2019-10-30 02:23:01');
INSERT INTO `goodtype` VALUES ('23', '1', '嘎嘎嘎dd', '0', '2019-10-30 09:01:45');
INSERT INTO `goodtype` VALUES ('24', '10', '方法', '0', '2019-10-30 09:05:44');
INSERT INTO `goodtype` VALUES ('25', '10', '嘎嘎嘎', '0', '2019-10-30 09:05:53');
INSERT INTO `goodtype` VALUES ('26', '10', '牛肉s', '0', '2019-10-30 09:06:04');
INSERT INTO `goodtype` VALUES ('27', '11', '牛肉', '0', '2019-10-30 09:06:17');
INSERT INTO `goodtype` VALUES ('28', '1', '男装', '0', '2019-10-30 09:06:26');
INSERT INTO `goodtype` VALUES ('29', '9', 'dd', '1', '2019-10-31 08:36:19');
INSERT INTO `goodtype` VALUES ('30', '9', 'dda', '1', '2019-10-31 08:36:21');
INSERT INTO `goodtype` VALUES ('31', '10', 'dds', '0', '2019-10-31 08:36:32');
INSERT INTO `goodtype` VALUES ('32', '10', 'ddsa', '0', '2019-10-31 08:36:34');
INSERT INTO `goodtype` VALUES ('33', '10', 'sdaggss', '0', '2019-10-31 09:24:44');
INSERT INTO `goodtype` VALUES ('34', '12', 'saa', '0', '2019-10-31 09:24:55');
INSERT INTO `goodtype` VALUES ('35', '1', 'ddaa', '0', '2019-10-31 09:27:47');
INSERT INTO `goodtype` VALUES ('36', '13', 'asass', '1', '2019-10-31 09:28:13');
INSERT INTO `goodtype` VALUES ('37', '8', 'asassaa', '0', '2019-10-31 09:28:41');
INSERT INTO `goodtype` VALUES ('38', '12', 'ddd', '0', '2019-10-31 09:35:37');
INSERT INTO `goodtype` VALUES ('39', '12', 'dddss', '0', '2019-10-31 09:35:40');
INSERT INTO `goodtype` VALUES ('41', '1', '的', '0', '2019-11-01 01:57:39');
INSERT INTO `goodtype` VALUES ('42', '2', '小红ssddsss', '0', '2019-11-02 00:38:13');
INSERT INTO `goodtype` VALUES ('48', '5', 'dd', '1', '2019-11-02 02:10:10');
INSERT INTO `goodtype` VALUES ('49', '5', 'dds', '1', '2019-11-02 02:10:13');
INSERT INTO `goodtype` VALUES ('50', '5', 'ddsdddddddssff', '0', '2019-11-02 02:10:16');
INSERT INTO `goodtype` VALUES ('51', '5', 'ddsda', '1', '2019-11-02 02:10:19');
INSERT INTO `goodtype` VALUES ('52', '5', 'ddsdadd', '0', '2019-11-02 02:10:25');
INSERT INTO `goodtype` VALUES ('53', '19', '2', '0', '2019-11-02 23:15:44');
INSERT INTO `goodtype` VALUES ('54', '2', 'd', '0', '2019-11-03 00:25:14');
INSERT INTO `goodtype` VALUES ('55', '2', 'dddd', '0', '2019-11-03 00:25:17');
INSERT INTO `goodtype` VALUES ('56', '2', 'dddddd', '0', '2019-11-03 00:25:21');
INSERT INTO `goodtype` VALUES ('57', '2', 'dddddddddd', '0', '2019-11-03 00:25:22');
INSERT INTO `goodtype` VALUES ('58', '2', 'ddddddddddddd', '0', '2019-11-03 00:25:24');
INSERT INTO `goodtype` VALUES ('59', '2', 'ddddddddddddds', '0', '2019-11-03 00:25:28');
INSERT INTO `goodtype` VALUES ('60', '2', 'dddddddddddddss', '0', '2019-11-03 00:25:29');
INSERT INTO `goodtype` VALUES ('61', '2', 'dddddddddddddsss', '0', '2019-11-03 00:25:31');
INSERT INTO `goodtype` VALUES ('62', '2', 'dddddddddddddsssss', '0', '2019-11-03 00:25:41');

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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parenttype
-- ----------------------------
INSERT INTO `parenttype` VALUES ('1', '衣服发', '1');
INSERT INTO `parenttype` VALUES ('2', '帽子aa', '0');
INSERT INTO `parenttype` VALUES ('3', '鞋子', '0');
INSERT INTO `parenttype` VALUES ('5', 'ddd', '0');
INSERT INTO `parenttype` VALUES ('6', 'sss', '0');
INSERT INTO `parenttype` VALUES ('8', '方法', '0');
INSERT INTO `parenttype` VALUES ('9', '分发给', '0');
INSERT INTO `parenttype` VALUES ('10', '裤子', '0');
INSERT INTO `parenttype` VALUES ('11', '零食', '0');
INSERT INTO `parenttype` VALUES ('12', 'gd', '0');
INSERT INTO `parenttype` VALUES ('13', 'fffff', '0');
INSERT INTO `parenttype` VALUES ('14', 'aa', '0');
INSERT INTO `parenttype` VALUES ('15', 'ss', '0');
INSERT INTO `parenttype` VALUES ('19', '4', '1');
INSERT INTO `parenttype` VALUES ('20', '62', '0');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '普通管理员');
INSERT INTO `role` VALUES ('3', '普通用户');
INSERT INTO `role` VALUES ('4', '无权限用户');

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
  `role_id` int(11) DEFAULT '4',
  `audit` int(2) DEFAULT '3',
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `audit` (`audit`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`audit`) REFERENCES `auditstatus` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6', 'admin', '1', 'http://lrplt.cn-bj.ufileos.com/2d2b52c6-77e0-4b9c-a697-851d09e1b88e.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=Ps7cIwkUX9%2BomcLMwmVDYO7W3yc%3D&Expires=1887416181', '2019-10-26 00:00:00', '1', '1');
INSERT INTO `user` VALUES ('13', 'admi', '1', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', '2019-10-29 09:10:50', '4', '1');
INSERT INTO `user` VALUES ('14', 'adm1', '12345678', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', '2019-10-29 09:12:49', '4', '1');
INSERT INTO `user` VALUES ('15', 'dddd', '12345678', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', '2019-10-31 09:07:03', '2', '1');
INSERT INTO `user` VALUES ('16', '啊', '1', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', null, '4', '1');
INSERT INTO `user` VALUES ('17', '大猪蹄子', '1', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', null, '4', '1');
INSERT INTO `user` VALUES ('18', '大猪蹄子2', '1', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', null, '4', '1');
INSERT INTO `user` VALUES ('19', '大猪蹄子', '1', 'http://lrplt.cn-bj.ufileos.com/a3058be9-3f08-476e-be05-d9f3ee06e069.png?UCloudPublicKey=TOKEN_2e336c63-c95d-4ea9-b750-e8342bcd185f&Signature=WPp4us%2F6hAtTtQB6TR0HrQ6XfEo%3D&Expires=1887844022', null, '4', '1');
INSERT INTO `user` VALUES ('22', '111', '12345678', '', '2019-11-03 22:19:59', '2', '1');
INSERT INTO `user` VALUES ('23', '12345', '12345678', '', '2019-11-03 22:22:07', '2', '2');
