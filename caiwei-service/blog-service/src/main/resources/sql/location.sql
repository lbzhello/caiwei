DROP TABLE IF EXISTS location;

CREATE TABLE location (
    location_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    longitude TINYINT NOT NULL DEFAULT 0 COMMENT '经度',
    latitude TINYINT NOT NULL DEFAULT 0 COMMENT '纬度',
    altitude TINYINT NOT NULL DEFAULT 0 COMMENT '海拔',
    radius TINYINT NOT NULL DEFAULT 0 COMMENT '半径',
    create_time DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
    update_time TIMESTAMP NOT NULL DEFAULT now() ON UPDATE now() COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8
COMMENT '广播消息表';