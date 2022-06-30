package com.example.navhostfragmentdemo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val buttonA = view.findViewById<Button>(R.id.actionButton)
        buttonA?.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
        }
        val buttonDataBindingActivity = view.findViewById<Button>(R.id.actionButton3)
        buttonDataBindingActivity.setOnClickListener{
            val intent = Intent( activity, DataBindingActivity::class.java)
            startActivity(intent)
        }
        return view.rootView
    }
}