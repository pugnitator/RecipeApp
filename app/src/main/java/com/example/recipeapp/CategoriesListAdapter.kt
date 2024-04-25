package com.example.recipeapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.databinding.ItemCategoryBinding

class CategoriesListAdapter(
    private val dataSet: Set<Category>
) : RecyclerView.Adapter<CategoriesListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemCategoryBinding.bind(itemView)

        fun bind(category: Category) {
            with(binding) {
                ivCategoryItem.setImageResource()
                tvCategoryItemTitle.text = category.title
                tvCategoryItemDescription.text = category.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(STUB.getCategories()[position])
    }

    override fun getItemCount(): Int {
        return STUB.getCategories().size
    }
}