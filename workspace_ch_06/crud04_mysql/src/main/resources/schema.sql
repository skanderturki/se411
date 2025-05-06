drop table product;

CREATE table product (
 id int not null auto_increment PRIMARY KEY,
 name varchar(100) not null,
 description varchar(100),
 price DECIMAL(8, 2)
);


