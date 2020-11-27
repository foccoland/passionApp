package it.italiaonline.mail.passionsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import it.italiaonline.mail.passionsapp.R
import it.italiaonline.mail.passionsapp.adapter.PassionRecyclerViewAdapter
import it.italiaonline.mail.passionsapp.databinding.FragmentMainBinding
import it.italiaonline.mail.passionsapp.databinding.PassionItemBinding
import it.italiaonline.mail.passionsapp.model.Passion

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val passionsList = listOf(
        Passion(1, "Baseball", R.drawable.baseball),
        Passion(2, "Basketball", R.drawable.basketball),
        Passion(3, "Bicycle", R.drawable.bicycle),
        Passion(4, "Bowling", R.drawable.bowling),
        Passion(5, "Boat", R.drawable.boat),
        Passion(6, "Cooking", R.drawable.cooking),
        Passion(7, "Tableball", R.drawable.tableball),
        Passion(8, "Trekking", R.drawable.treeforest),
        Passion(9, "Traveling", R.drawable.tripmap)
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.passionRecyclerView.adapter = PassionRecyclerViewAdapter(passionsList)
        binding.passionRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        return binding.root
    }
}