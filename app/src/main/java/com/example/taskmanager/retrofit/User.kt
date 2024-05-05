package com.example.taskmanager.retrofit

data class User (
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
    val photo: String

) {
    override fun toString(): String {
        return "User(id=$id, name='$name', email='$email', password='$password', photo='$photo')"
    }
}