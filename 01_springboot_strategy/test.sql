DROP TABLE IF EXISTS `payment_channel`;
CREATE TABLE `payment_channel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `CHANNEL_NAME` varchar(32) NOT NULL COMMENT '渠道名称',
  `CHANNEL_ID` varchar(32) NOT NULL COMMENT '渠道ID',
  `strategy_bean_id` varchar(255) DEFAULT NULL COMMENT '策略执行beanid',
  PRIMARY KEY (`ID`,`CHANNEL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='支付渠道 ';

-- ----------------------------
-- Records of payment_channel
-- ----------------------------
INSERT INTO `payment_channel` VALUES ('1', '支付宝支付', 'ali_pay', 'aliPayStrategy');
INSERT INTO `payment_channel` VALUES ('2', '微信支付', 'wecaht_pay', 'weiXinPayStrategy');
