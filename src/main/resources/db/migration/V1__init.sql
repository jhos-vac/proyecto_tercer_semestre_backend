CREATE TABLE IF NOT EXISTS projects(
    id SERIAL,
    title VARCHAR(150),
    estimate DECIMAL(5,2),
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

CREATE TABLE IF NOT EXISTS project_skills(
    id  SERIAL,
    id_project INT NOT NULL,
    id_skills INT NOT NULL,
    FOREIGN KEY (id_project) REFERENCES projects(id),
    FOREIGN KEY (id_skills) REFERENCES skills(id),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    fullname VARCHAR (50),
    email VARCHAR (100),
    contact VARCHAR (15),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS postulation(
    id SERIAL,
    id_users INT NOT NULL,
    id_project_skills INT NOT NULL,
    states VARCHAR (100),
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id),
    FOREIGN KEY (id_project_skills) REFERENCES project_skills(id)
);