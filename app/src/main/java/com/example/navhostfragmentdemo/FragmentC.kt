package com.example.navhostfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class FragmentC : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonC = view.findViewById<Button>(R.id.actionButton)
        buttonC?.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragmentC_to_fragmentA)
        }
    }
}


// A B B1 B2 B3 B4  C -> A
// A A
