package com.chocce.marcos.laboratoriocalificado03

import retrofit2.Call
import retrofit2.http.GET

interface TeacherApiService {
    @GET("list/teacher")
    fun getTeachers(): Call<Map<String, List<Teacher>>>
}