DROP DATABASE IF EXISTS draco_db;
create database draco_db;

use draco_db;

create table users(
    id int unsigned not null auto_increment,
    username varchar(100) not null,
    email varchar(255) not null,
    password varchar(100) not null,
    primary key (id)
);

create table ads(
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(255) not null ,
    description text not null,
    foreign key (user_id) references users (id),
    primary key (id)
);