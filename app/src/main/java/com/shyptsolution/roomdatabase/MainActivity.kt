package com.shyptsolution.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.shyptsolution.roomdatabase.fragments.add.addFragment
import com.shyptsolution.roomdatabase.fragments.list.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainfrag=ListFragment()
//        setfragment((mainfrag))
//        val floatingbutt=ListFragment().view?.findViewById<FloatingActionButton>(R.id.floatingActionButton)
//        floatingbutt?.setOnClickListener {
//            Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show()
//            setfragment(addFragment())
//        }

    }
//    fun setfragment(fragment:Fragment){
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fragmentContainerView,fragment).commit()
//        }
//    }
}