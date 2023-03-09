package com.cb.canarymanagment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.cb.canarymanagment.R

class walletmonitorfragment : Fragment() {
    private lateinit var apiTypeTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_wallet_monitor, container, false)
        apiTypeTextView = view.findViewById(R.id.APIType)

        val apiType = arguments?.getString(ARG_API_TYPE)
        apiTypeTextView.text = apiType

        return view
    }

    companion object {
        private const val ARG_API_TYPE = "api_type"

        fun newInstance(apiType: String): walletmonitorfragment {
            val args = Bundle()
            args.putString(ARG_API_TYPE, apiType)
            val fragment = walletmonitorfragment()
            fragment.arguments = args
            return fragment
        }
    }
}
