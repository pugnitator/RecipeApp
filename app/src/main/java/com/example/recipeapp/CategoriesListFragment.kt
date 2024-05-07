package com.example.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
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

    private fun initRecycler(dataSet: List<Category>): CategoriesListAdapter {
        val adapter = CategoriesListAdapter(dataSet)
        adapter.setOnItemClickListener(object : CategoriesListAdapter.OnItemClickListener {
            override fun onItemClick() {
                parentFragmentManager.commit {
                    openRecipesByCategoryId()
                }
            }
        })
        return adapter
    }

    private fun openRecipesByCategoryId() {
    }
}
