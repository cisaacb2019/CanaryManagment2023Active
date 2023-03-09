package com.cb.canarymanagment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cb.canarymanagment.R

class homefragment : Fragment() {

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val view = inflater.inflate(R.layout.fragment_home, container, false)

            val button = view.findViewById<Button>(R.id.addnewbutton)
            button.setOnClickListener {
                val addapifragment = addapifragment()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, addapifragment)
                    .addToBackStack(null)
                    .commit()
            }

            return view
        }
    }