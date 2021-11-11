package com.shyptsolution.roomdatabase

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.shyptsolution.roomdatabase.R
import com.shyptsolution.roomdatabase.data.User
import com.shyptsolution.roomdatabase.data.UserViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [addFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class addFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_add, container, false)
        val button=view.findViewById<Button>(R.id.addbutton)
        button.setOnClickListener {
            insertDataToDataBase()
            Toast.makeText(requireContext(),"Added",Toast.LENGTH_LONG).show()
        }
        var mUserViewModel=ViewModelProvider(requireActivity()).get(UserViewModel::class.java)
//    mUserViewModel=ViewModelProvider(this).get(UserViewModel::class.java)
        return view
    }

    private fun insertDataToDataBase() {
        val name=view?.findViewById<EditText>(R.id.name)?.text.toString()
        val age=view?.findViewById<EditText>(R.id.age)?.text.toString()
        val address=view?.findViewById<EditText>(R.id.address)?.text.toString()
    if(inputCheck(name,age,address)){
//        val user=User(0,name,age.toInt(),address)
//        mUserViewModel.addUser(user)
        Toast.makeText(requireContext(),"Added",Toast.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_addFragment_to_listFragment)
    }
    }

    private fun inputCheck(firstName:String,age:String,Address:String):Boolean{
        return  !(TextUtils.isEmpty(firstName) && TextUtils.isEmpty(Address) &&  TextUtils.isEmpty(age))
    }

}