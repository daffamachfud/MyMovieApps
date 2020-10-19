package com.onoh.mymovieapps.ui.home.documentary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onoh.mymovieapps.R

/**
 * A simple [Fragment] subclass.
 */
class DocumentaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_documentary, container, false)
    }

}
