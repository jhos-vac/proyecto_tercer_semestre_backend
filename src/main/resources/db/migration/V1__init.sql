
CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    fullname VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(100),
    contact VARCHAR(20),
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS skills(
    id SERIAL,
    nombre VARCHAR(50),
    description VARCHAR(200),
    hourly_rate DECIMAL(10, 2),
    availability VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS workers(
    id SERIAL,
    id_users INT NOT NULL,
    biography VARCHAR(500),
    ratings DECIMAL(3, 2),
    review INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS projects(
    id SERIAL,
    title VARCHAR(100),
    description VARCHAR(500),
    id_users INT NOT NULL,
    start_date DATE,
    estimated_duration INT,
    budget DECIMAL(12, 2),
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS requests(
    id SERIAL,
    id_users INT NOT NULL,
    id_project INT NOT NULL,
    id_worker INT NOT NULL,
    states  VARCHAR(20),
    date_requests DATE,
    response_date DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (id_users) REFERENCES users(id),
    FOREIGN KEY (id_project) REFERENCES projects(id),
    FOREIGN KEY (id_worker) REFERENCES workers(id)
);