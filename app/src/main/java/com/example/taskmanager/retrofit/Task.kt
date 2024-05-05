package com.example.taskmanager.retrofit

import com.google.gson.annotations.SerializedName
import java.time.LocalDate

data class Task(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("date") val date: String,
    @SerializedName("iscompleted") val iscompleted: Boolean,
    @SerializedName("creatorname") val creatorName: String

) {
    override fun toString(): String {
        return "Task(id=$id, name='$name', description='$description', date=$date, iscompleted=$iscompleted, creatorName='$creatorName')"
    }
}

