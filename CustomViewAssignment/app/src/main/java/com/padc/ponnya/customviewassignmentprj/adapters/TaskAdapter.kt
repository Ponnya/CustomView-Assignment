package com.padc.ponnya.customviewassignmentprj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderTaskBinding
import com.padc.ponnya.customviewassignmentprj.delegates.TaskDelegate
import com.padc.ponnya.customviewassignmentprj.views.viewholders.TaskViewHolder

class TaskAdapter(private val mDelegate: TaskDelegate) : RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = ViewHolderTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TaskViewHolder(mDelegate,view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 5
}