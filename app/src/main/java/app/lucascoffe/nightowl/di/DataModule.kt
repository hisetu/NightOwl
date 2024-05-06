package app.lucascoffe.nightowl.di

import app.lucascoffe.nightowl.data.RegionRepository
import app.lucascoffe.nightowl.data.RegionRepositoryImpl
import app.lucascoffe.nightowl.data.remote.RegionApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideRegionRepository(): RegionRepository = RegionRepositoryImpl()

    @Provides
    fun provideRegionApiRetrofit(): Retrofit = Retrofit.Builder()
        .client(OkHttpClient())
        .baseUrl("https://restcountries.com")
        .addConverterFactory(Json.asConverterFactory(MediaType.get("application/json; charset=UTF8")))
        .build()

    @Provides
    fun provideRegionApi(retrofit: Retrofit): RegionApi = retrofit.create(RegionApi::class.java)
}