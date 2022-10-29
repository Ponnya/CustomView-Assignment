package com.padc.ponnya.customviewassignmentprj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderTaskListBinding
import com.padc.ponnya.customviewassignmentprj.views.viewholders.TaskListViewHolder

class TaskListAdapter:RecyclerView.Adapter<TaskListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
       val view = ViewHolderTaskListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TaskListViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 5
}