package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding
            ?: throw IllegalAccessException("binding from ActivityMainBinding must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<CategoriesListFragment>(R.id.mainContainer)
            }
        }

        with(binding) {
            btnCategories.setOnClickListener {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<CategoriesListFragment>(R.id.mainContainer)
                }
            }

            btnFavourites.setOnClickListener {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<FavoritesFragment>(R.id.mainContainer)
                }
            }
        }
    }
}