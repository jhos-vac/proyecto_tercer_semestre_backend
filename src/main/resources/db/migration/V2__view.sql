CREATE VIEW project_view AS
SELECT p.*, u.fullname users
FROM project p JOIN users u
ON p.id_users = u.id;


CREATE VIEW apply_view AS
SELECT a.*, u.fullname users, p.title project
FROM apply a JOIN users u ON a.id_users = u.id
             JOIN project p ON a.id_project = p.id;
