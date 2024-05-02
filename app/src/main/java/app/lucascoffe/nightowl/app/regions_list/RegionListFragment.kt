package app.lucascoffe.nightowl.app.regions_list

import android.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import app.lucascoffe.nightowl.data.model.Region
import app.lucascoffe.nightowl.databinding.FragmentRegionListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class RegionListFragment : Fragment() {

    private var _binding: FragmentRegionListBinding? = null
    private val binding: FragmentRegionListBinding
        get() = _binding!!

    private val viewModel by viewModels<RegionListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentRegionListBinding.inflate(inflater).run {
        _binding = this
        root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdapter = ArrayAdapter<Region>(requireActivity(), R.layout.simple_spinner_item)

        with(binding.spRegion) {
            adapter = arrayAdapter
            onItemSelectedListener = object : OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Log.d("position", position.toString())
                    viewModel.setSelectedPosition(position)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect {
                    (binding.spRegion.adapter as? ArrayAdapter<Region>)?.run {
                        clear()
                        addAll(it.regions)
                    }

                    if (it.errorMessage.isNullOrEmpty().not()) {
                        Toast.makeText(requireActivity(), it.errorMessage, Toast.LENGTH_SHORT)
                            .show()
                        viewModel.clearErrorMessage()
                    }

                    if (it.goNextEvent) {
//                        findNavController().navigate()
                        viewModel.consumeGoNextEvent()
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}