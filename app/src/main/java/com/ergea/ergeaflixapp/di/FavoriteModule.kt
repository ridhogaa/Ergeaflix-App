package com.ergea.ergeaflixapp.di

import com.ergea.core.domain.usecase.MovieUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@EntryPoint
@InstallIn(SingletonComponent::class)
interface FavoriteModule {
    fun movieUseCase(): MovieUseCase
}