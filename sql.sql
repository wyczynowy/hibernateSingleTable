create database productsdb;

use productsdb;

CREATE TABLE products (
  product_id bigint NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  product_type bigint NOT NULL,
  author varchar(45),
  color varchar(45),
  PRIMARY KEY (product_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;