package app.lucascoffe.nightowl.di

import app.lucascoffe.nightowl.data.RegionRepository
import app.lucascoffe.nightowl.data.RegionRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideRegionRepository(): RegionRepository = RegionRepositoryImpl()
}