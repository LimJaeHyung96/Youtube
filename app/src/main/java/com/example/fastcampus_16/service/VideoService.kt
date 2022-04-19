package com.example.fastcampus_16.service

import com.example.fastcampus_16.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/1c172797-7656-4e85-bc63-96f2808da88e")
    fun listVideos() : Call<VideoDto>
}