package com.example.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.FragmentListCategoriesBinding

class CategoriesListFragment : Fragment() {

    private var _binding: FragmentListCategoriesBinding? = null
    private val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListCategoriesBinding.inflate(layoutInflater)
        val adapter = initRecycler(STUB.getCategories())
        _binding?.rvCategories?.adapter = adapter
        return binding?.root
    }

    private fun initRecycler(dataSet: List<Category>): CategoriesListAdapter =
        CategoriesListAdapter(dataSet)

}
