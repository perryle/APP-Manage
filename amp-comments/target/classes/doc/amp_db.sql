DROP DATABASE IF EXISTS amp_db;
CREATE DATABASE amp_db;
USE amp_db;
-- 创建管理员信息表
DROP TABLE IF EXISTS sys_admin;
CREATE TABLE sys_admin(
	admin_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT '管理人员主键',
	admin_no VARCHAR(255) NOT NULL COMMENT '管理人员编号',
	admin_name VARCHAR(255) NOT NULL COMMENT '管理人员姓名',
	PASSWORD VARCHAR(500) NOT NULL COMMENT '登录密码',
	role_id INT(10) NOT NULL COMMENT '管理员角色',
	create_admin INT(10) NOT NULL COMMENT '添加人',
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
	update_admin INT(10) NOT NULL COMMENT '修改人',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;

-- 创建开发人员信息表
DROP TABLE IF EXISTS sys_dev;
CREATE TABLE sys_dev(
	dev_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT '开发人员主键',
	dev_no VARCHAR(255) NOT NULL COMMENT '开发人员编号',
	dev_name VARCHAR(255) NOT NULL COMMENT '开发人员姓名',
	PASSWORD VARCHAR(500) NOT NULL COMMENT '登录密码',
	cellphone VARCHAR(100) NOT NULL COMMENT '联系电话',
	email VARCHAR(500) NOT NULL COMMENT '电子邮电',
	dev_info VARCHAR(500) NOT NULL COMMENT '简介',
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;

-- 类别表
DROP TABLE IF EXISTS sys_category;
CREATE TABLE sys_category(
	category_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT '类别主键',
	category_code VARCHAR(255) NOT NULL COMMENT '类别编号',
	category_name VARCHAR(255) NOT NULL COMMENT '类别名称',
	create_admin VARCHAR(255) NOT NULL COMMENT '创建人员',
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_admin VARCHAR(255) NOT NULL COMMENT '修改人员',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;

-- app信息表
DROP TABLE IF EXISTS sys_app;
CREATE TABLE sys_app(
	app_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT 'app主键',
	app_name VARCHAR(255) NOT NULL COMMENT 'app名称',
	dev_id INT(10) NOT NULL COMMENT '开发人',
	category_id INT(10) NOT NULL COMMENT '类别',
	app_info VARCHAR(500) NOT NULL COMMENT '简介',
	flatform_id INT(10) NOT NULL COMMENT '使用平台',
	status_id INT(10) NOT NULL COMMENT '审核状态',
	sale_id INT(10) NOT NULL COMMENT 'app状态',
	checker INT(10) NOT NULL COMMENT '审核人',
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;

-- 版本信息表
DROP TABLE IF EXISTS sys_version;
CREATE TABLE sys_version(
	version_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT '版本主键',
	app_id INT(10) NOT NULL COMMENT 'app',
	apk_name VARCHAR(500) NOT NULL COMMENT 'app安装包名称',
	support_rom VARCHAR(255) NOT NULL,
	software_size VARCHAR(500) NOT NULL,
	download_link VARCHAR(500) NOT NULL,
	status_id INT(10) NOT NULL,
	checker INT(10) NOT NULL,
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;

-- 创建字典信息表
DROP TABLE IF EXISTS sys_dictionary;
CREATE TABLE sys_dictionary(
	dictionary_id INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT '字典主键',
	parent_id INT(10) NOT NULL COMMENT '上级字典',
	dictionary_name VARCHAR(255) NOT NULL COMMENT '字典名称',
	create_admin INT(10) NOT NULL COMMENT '创建人',
	create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_admin INT(10) NOT NULL COMMENT '修改人',
	update_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=INNODB CHARSET=utf8mb4;