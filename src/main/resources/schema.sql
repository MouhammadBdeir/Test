
-- Customer
CREATE TABLE IF NOT EXISTS customer (
      id SERIAL PRIMARY KEY,
      anrede VARCHAR(255),
      first_name VARCHAR(255),
      last_name VARCHAR(255),
      email VARCHAR(255),
      phone_number VARCHAR(255),
      message TEXT,
      interest VARCHAR(255),
      company VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS feedback (
    id serial PRIMARY KEY ,
    message VARCHAR(1000),
    subject VARCHAR(255) NOT NULL DEFAULT ''
);

CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
 );