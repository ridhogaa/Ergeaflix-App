package com.ergea.core.data.source.remote.network

import com.ergea.core.data.source.remote.response.GetMovieResponse
import retrofit2.http.GET

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

interface ApiService {

    @GET("now_playing?api_key=$api_key")
    suspend fun getMovieNowPlaying(): GetMovieResponse

    @GET("popular?api_key=$api_key")
    suspend fun getMoviePopular(): GetMovieResponse

    @GET("top_rated?api_key=$api_key")
    suspend fun getMovieTopRated(): GetMovieResponse

    companion object {
        private const val api_key = "9428967aca5607f7a2bbcb7a46f0ecfe"
    }
}