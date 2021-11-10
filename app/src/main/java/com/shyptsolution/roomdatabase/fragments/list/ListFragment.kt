package com.shyptsolution.roomdatabase.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.shyptsolution.roomdatabase.MainActivity
import com.shyptsolution.roomdatabase.R
import com.shyptsolution.roomdatabase.fragments.add.addFragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_list, container, false)
        val addfrag=addFragment()
        val floating=view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floating. setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
//            setfragment(addfrag)
            Toast.makeText(view.context,"Hello",Toast.LENGTH_LONG).show()
        }

        return view
    }


}