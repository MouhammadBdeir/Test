
-- Customer
CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    anrede VARCHAR(255),
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    email VARCHAR(255),
    phoneNumber VARCHAR(255),
    message VARCHAR(1000),
    interest VARCHAR(255),
    company VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS feedback (
    id serial PRIMARY KEY ,
    message VARCHAR(1000),
    subject VARCHAR(255) NOT NULL DEFAULT ''
);