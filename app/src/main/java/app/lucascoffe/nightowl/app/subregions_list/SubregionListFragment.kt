package app.lucascoffe.nightowl.app.subregions_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.lucascoffe.nightowl.databinding.FragmentSubregionListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SubregionListFragment : Fragment() {
    private var _binding: FragmentSubregionListBinding? = null
    private val binding: FragmentSubregionListBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentSubregionListBinding.inflate(inflater).run {
        _binding = this
        root
    }

}