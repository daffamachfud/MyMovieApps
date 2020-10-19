package com.onoh.mymovieapps.ui.file

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.onoh.mymovieapps.R

class FileFragment : Fragment() {

    private lateinit var fileViewModel: FileViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        fileViewModel =
                ViewModelProviders.of(this).get(FileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_file, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        fileViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
