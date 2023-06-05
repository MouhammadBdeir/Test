
CREATE TABLE IF NOT EXISTS feedback (
    id serial PRIMARY KEY ,
    message VARCHAR(1000),
    subject VARCHAR(255) NOT NULL DEFAULT ''
);