package com.example.fastcampus_16.service

import com.example.fastcampus_16.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/2d8abaf4-1263-4534-8d95-f55faaac95f1")
    fun listVideos() : Call<VideoDto>
}