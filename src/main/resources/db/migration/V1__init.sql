CREATE TABLE IF NOT EXISTS projects(
    id SERIAL,
    title VARCHAR(150),
    estimate DECIMAL(10,5),
    description VARCHAR (100),
    estimated_time DATE,
    work_level VARCHAR (50),
    type_work VARCHAR (50),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS skills(
    id SERIAL,
    id_project INT NOT NULL,
    description VARCHAR (200),
    PRIMARY KEY (id),
    FOREIGN KEY (id_project) REFERENCES projects(id)
);


CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    fullname VARCHAR (50),
    email VARCHAR (100),
    contact VARCHAR (15),
    states VARCHAR (100),
    application_skill VARCHAR(100)
    PRIMARY KEY (id)
    FOREIGN KEY (application_skill) REFERENCES skills(id)
);
