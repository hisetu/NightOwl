package app.lucascoffe.nightowl.data

import app.lucascoffe.nightowl.data.model.Region

interface RegionRepository {
    suspend fun getRegionList(): List<Region>
}

class RegionRepositoryImpl : RegionRepository {
    override suspend fun getRegionList(): List<Region> = listOf(
        Region(id = 0, name = "Asia"),
        Region(id = 1, name = "Europe"),
        Region(id = 2, name = "Americas")
    )
}