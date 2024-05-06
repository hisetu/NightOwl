package app.lucascoffe.nightowl.app.subregions_list

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.lucascoffe.nightowl.R
import app.lucascoffe.nightowl.data.RegionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class SubregionListViewModel @Inject constructor(
    private val regionRepository: RegionRepository,
    private val application: Application
) : ViewModel() {
    private val _uiState = MutableStateFlow(SubregionListState())
    val uiState = _uiState.asStateFlow()

    fun loadData(region: String) {
        flow { emit(regionRepository.getSubregionList(region)) }
            .onEach { res ->
                _uiState.update {
                    it.copy(subregions = res.map { a -> SubregionListState.Subregion(a.subregion) })
                }
            }
            .catch { _uiState.update { it.copy(errorMessage = application.getString(R.string.subregion_load_load_fail)) } }
            .launchIn(viewModelScope)
    }

}

data class SubregionListState(
    val subregions: List<Subregion> = emptyList(),
    val errorMessage: String = ""
) {
    data class Subregion(val name: String)
}