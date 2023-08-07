package com.example.proyecto_tercer_semestre_backend.Dto

import java.util.Date
data class ProjectDTO(
    val id: Long?,
    val title: String?,
    val estimate: Int?,
    val description: String?,
    val estimatedTime: Date?,
    val workLevel: String?,
    val typeWork: String?,
    val skills:List<SkillDTO>,
)
data class SkillDTO(
    val id: Long?,
    val idProject: Int?,
    val description: String?,
    val  users: List<UsersDTO>
)
data class UsersDTO(
    val id:Long?,
    val fullname:String?,
    val email:String?,
    val contact: String?,
    val states: String?,
    val idSkill: Int?,
)