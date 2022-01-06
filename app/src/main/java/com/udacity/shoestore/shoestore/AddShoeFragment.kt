package com.udacity.shoestore.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.MainViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentAddShoeBinding

class AddShoeFragment : Fragment() {
    private lateinit var binding: FragmentAddShoeBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_shoe, container, false)
        binding.cancelBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(AddShoeFragmentDirections.actionAddShoeFragmentToShoeListFragment())
        )
        binding.saveBtn.setOnClickListener {
            viewModel.addShoe(binding.nameDetail.text.toString(),
                binding.companyDetail.text.toString(),
                binding.sizeDetail.text.toString(),
                binding.descDetail.text.toString())
            findNavController().navigateUp()
        }
        return binding.root
    }

}