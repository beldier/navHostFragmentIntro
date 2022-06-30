package com.example.navhostfragmentdemo

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


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
        setHasOptionsMenu(true)
        return view.rootView
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController() )
                || super.onOptionsItemSelected(item)
    }

}