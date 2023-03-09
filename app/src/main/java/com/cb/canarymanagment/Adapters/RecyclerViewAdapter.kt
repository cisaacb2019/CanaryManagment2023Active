package com.cb.canarymanagment.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.cb.canarymanagment.ModelData.TableData
import com.cb.canarymanagment.R
import com.cb.canarymanagment.fragments.walletmonitorfragment

class RecyclerViewAdapter(private val tableDataList: List<TableData>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val nameTextView: TextView = view.findViewById(R.id.NameTextView)
        val apiTypeTextView: TextView = view.findViewById(R.id.APITypeTextView)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val tableData = tableDataList[adapterPosition]
            val apiType = tableData.apiType

            if (apiType == "Wallet Monitoring") {
                val fragment = walletmonitorfragment.newInstance(apiType)

                // Navigate to the new fragment using the fragment manager
                val fragmentManager = (v?.context as AppCompatActivity).supportFragmentManager
                fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()

            } else if (tableData.apiType == "two") {
                // Handle click for APIType equal to two
            }
            // Display a toast message
            val toastMessage = "Clicked ${tableData.name}"
            Toast.makeText(v?.context, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.api_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tableData = tableDataList[position]
        holder.nameTextView.text = tableData.name
        holder.apiTypeTextView.text = tableData.apiType
    }

    override fun getItemCount() = tableDataList.size
}
