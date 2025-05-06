DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int not null auto_increment PRIMARY KEY,
  username varchar(30) not null,
  password varchar(100) not null
);