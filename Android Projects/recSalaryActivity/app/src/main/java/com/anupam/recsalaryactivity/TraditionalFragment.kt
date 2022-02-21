package com.anupam.recsalaryactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class TraditionalFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        const val KEY_COLOR = "dfs"
        const val KEY_COLOR_CODE = "colorCode"

        fun newInstance( col : String, cod : String ) : Fragment {
            val fragment = TraditionalFragment()
            val bundle = Bundle()
            bundle.putString(KEY_COLOR, col)
            bundle.putString(KEY_COLOR_CODE, cod)
            fragment.arguments = bundle
            return fragment
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bundle = arguments
        val col = bundle?.getString("dfs") ?: ""
        val colCode = bundle?.getString("colorCode") ?: ""

        val root =  inflater.inflate(R.layout.fragment_traditional, container, false)

        root.findViewById<TextView>(R.id.txtCol).text = col
        root.findViewById<TextView>(R.id.txtPcr).setText(colCode)

        return root
    }
}
