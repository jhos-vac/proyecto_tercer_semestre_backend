CREATE TABLE IF NOT EXISTS users (
    id SERIAL,
    fullname VARCHAR(100),
    email VARCHAR (100),
    contact VARCHAR (15),
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS project(
    id SERIAL,
    id_users INT NOT NULL,
    title VARCHAR(150),
    budget DECIMAL(5,2),
    description VARCHAR (100),
    start_date DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS apply(
    id SERIAL,
    id_users INT NOT NULL,
    id_project INT NOT NULL,
    states VARCHAR (100),
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id),
    FOREIGN KEY (id_project) REFERENCES project(id)
);

CREATE TABLE IF NOT EXISTS skills(
    id SERIAL,
    id_users INT NOT NULL,
    fullname VARCHAR (100),
    description VARCHAR (200),
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id)
);