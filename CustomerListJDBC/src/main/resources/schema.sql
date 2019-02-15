CREATE TABLE IF NOT EXISTS customer (
    customer_id int(5) NOT NULL AUTO_INCREMENT,
    first_name varchar(50) DEFAULT NULL,
    last_name varchar(50) DEFAULT NULL,
    streetaddress varchar(50) NOT NULL,
    postcode char(5) NOT NULL,
    postoffice varchar(50) NOT NULL,
    phone char(20) NOT NULL,
    email varchar(50) NOT NULL,
    PRIMARY KEY(customer_id)
    );