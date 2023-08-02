package com.example.proyecto_tercer_semestre_backend.model

import jakarta.persistence.*

@Entity
@Table(name = "project_skills")
class ProjectSkills {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?= null
    @Column (name = "id_project")
    var idProject:Int?= null
    @Column (name = "id_skills")
    var idSkills:Int?= null
}