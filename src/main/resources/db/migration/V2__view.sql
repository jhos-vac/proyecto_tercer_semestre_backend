CREATE  VIEW postulation_view AS
SELECT p.*, pr.id_skills skill, u.fullname user_postulation, s.description skills_description
FROM postulation p
JOIN users u ON p.id_users = u.id
JOIN project_skills pr ON p.id_project_skills = pr.id
JOIN skills s ON pr.id_skills = u.id ;

CREATE VIEW project_skills_view AS
SELECT sp.*, s.description description_detail
FROM project_skills sp
JOIN skills s ON s.id = sp.id_skills;