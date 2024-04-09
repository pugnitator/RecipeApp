package com.example.recipeapp
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//class CategoriesListFragment: Fragment(){
//
//    var binding = FragmentCategoriesListBinding? = null
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        var binding = .inflate(R.layout.fragment_list_categories, container)
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//}
//


class HomeFragment : Fragment() {

    private var _homeBinding: FragmentHomeBinding? = null
    private val homeBinding get() = _homeBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _homeBinding = FragmentHomeBinding.inflate(inflater,container,false)
        val view  = homeBinding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _homeBinding = null
    }

}