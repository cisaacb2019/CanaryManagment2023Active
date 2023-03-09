package com.cb.canarymanagment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cb.canarymanagment.Adapters.RecyclerViewAdapter
import com.cb.canarymanagment.ModelData.TableData
import com.cb.canarymanagment.R

class addapifragment : Fragment() {

    private fun generateTableData(): List<TableData> {
        val data = mutableListOf<TableData>()
        data.add(TableData("Grin", "Wallet Monitoring"))
        data.add(TableData("Table 2", "GraphQL API"))
        data.add(TableData("Table 3", "SOAP API"))
        return data
    }

    private val tableDataList = generateTableData()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_api, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RecyclerViewAdapter(tableDataList)


        return view
    }


    // TODO: add RecyclerView adapter and layout manager code
}