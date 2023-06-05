
-- Customer
CREATE TABLE IF NOT EXISTS customer (
    id serial primary key,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    interest varchar(100) not null,
    company varchar(100) not null,
    anrede varchar(100) not null,
    email varchar(255) not null,
    phoneNumber varchar(20) not null,
    message text not null
    );
CREATE TABLE IF NOT EXISTS feedback (
    id serial PRIMARY KEY ,
    message VARCHAR(1000),
    subject VARCHAR(255) NOT NULL DEFAULT ''
);