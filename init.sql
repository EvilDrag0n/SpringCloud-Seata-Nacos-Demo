CREATE TABLE `t_user` (
  `id` BIGINT(20) NOT NULL COMMENT '用户id',
  `name` VARCHAR(32) COLLATE utf8mb4_bin NOT NULL COMMENT '姓名',
  `money` DECIMAL(10,2) NOT NULL DEFAULT '0.00' COMMENT '金额',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表';

CREATE TABLE `t_product_stock` (
  `id` BIGINT(20) NOT NULL COMMENT 'id',
  `name` VARCHAR(32) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '商品名',
  `stock` SMALLINT(5) NOT NULL DEFAULT '0' COMMENT '库存数',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品库存';

CREATE TABLE `t_order` (
  `id` BIGINT(20) NOT NULL COMMENT 'id',
  `product_id` BIGINT(20) NOT NULL COMMENT '商品id',
  `user_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `product_num` SMALLINT(5) NOT NULL DEFAULT '0' COMMENT '商品数量',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

