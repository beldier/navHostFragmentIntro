package com.example.navhostfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val buttonB = view.findViewById<Button>(R.id.actionButton)
        buttonB?.setOnClickListener { view: View ->
            val message = " Hello there "
            val action = FragmentBDirections.actionFragmentBToFragmentC(message)
            Navigation.findNavController(view).navigate(action)
        }
        return view.rootView
    }
}