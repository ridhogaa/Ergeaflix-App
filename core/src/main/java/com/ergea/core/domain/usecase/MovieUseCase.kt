package com.ergea.core.domain.usecase

import com.ergea.core.data.source.Resource
import com.ergea.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

interface MovieUseCase {
    fun getNowMoviePlaying(): Flow<Resource<List<Movie>>>
    fun getMoviePopular(): Flow<Resource<List<Movie>>>
    fun getMovieTopRated(): Flow<Resource<List<Movie>>>
    suspend fun insert(movie: Movie)
    fun getAllFavorite(): Flow<List<Movie>>
    suspend fun delete(movie: Movie)
    fun getFavoriteState(id: Int): Flow<Boolean>
}