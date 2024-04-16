package com.example.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment() {

    private var _bindingFavorites: FragmentFavoritesBinding? = null
    private val bindingFavorites
        get() = _bindingFavorites

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bindingFavorites = FragmentFavoritesBinding.inflate(layoutInflater)
        val view = bindingFavorites?.root
        return view
    }
}