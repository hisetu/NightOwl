package app.lucascoffe.nightowl.app.regions_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.lucascoffe.nightowl.data.RegionRepository
import app.lucascoffe.nightowl.data.model.Region
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
class RegionListViewModel @Inject constructor(private val repository: RegionRepository) :
    ViewModel() {
    private val _uiState = MutableStateFlow(RegionListState())
    val uiState = _uiState.asStateFlow()

    init {
        flow { emit(repository.getRegionList()) }
            .onEach { list ->
                _uiState.update { it.copy(regions = list) }
            }
            .catch {
                _uiState.update { it.copy(errorMessage = "載入失敗") }
            }
            .launchIn(viewModelScope)
    }

    fun clearErrorMessage() {
        _uiState.update { it.copy(errorMessage = "") }
    }

    fun setSelectedPosition(position: Int) {
        _uiState.update { it.copy(selectedPosition = position) }
    }

    fun next() {
        if (uiState.value.regions.isEmpty()) {
            _uiState.update { it.copy(errorMessage = "發生錯誤，請重新進入此頁面") }
            return
        }
        if (uiState.value.selectedPosition > uiState.value.regions.lastIndex) {
            _uiState.update { it.copy(errorMessage = "請選擇有效的選項") }
            return
        }

        _uiState.update { it.copy(goNextEvent = true) }
    }

    fun consumeGoNextEvent() {
        _uiState.update { it.copy(goNextEvent = false) }
    }
}

data class RegionListState(
    val regions: List<Region> = emptyList(),
    val errorMessage: String? = null,
    val selectedPosition: Int = 0,
    val goNextEvent: Boolean = false
)