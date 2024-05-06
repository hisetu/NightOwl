package app.lucascoffe.nightowl.data

import app.lucascoffe.nightowl.data.model.Region
import app.lucascoffe.nightowl.data.remote.RegionApi
import app.lucascoffe.nightowl.data.remote.model.SubregionResponse
import javax.inject.Inject

interface RegionRepository {
    suspend fun getRegionList(): List<Region>
    suspend fun getSubregionList(region: String): SubregionResponse
}

class RegionRepositoryImpl @Inject constructor(private val regionApi: RegionApi) :
    RegionRepository {
    override suspend fun getRegionList(): List<Region> = listOf(
        Region(id = 0, name = "Asia"),
        Region(id = 1, name = "Europe"),
        Region(id = 2, name = "Americas")
    )

    override suspend fun getSubregionList(region: String): SubregionResponse =
        regionApi.getSubregions(region)
}