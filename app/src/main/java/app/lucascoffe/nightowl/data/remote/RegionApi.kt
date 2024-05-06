package app.lucascoffe.nightowl.data.remote

import app.lucascoffe.nightowl.data.remote.model.Subregion
import retrofit2.http.GET
import retrofit2.http.Path

interface RegionApi {
    @GET("v3.1/region/{region}?fields=name,flags,subregion")
    suspend fun getSubregions(@Path("region") region: String): Subregion
}