package com.padc.ponnya.customviewassignmentprj.views.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderTaskBinding
import com.padc.ponnya.customviewassignmentprj.delegates.TaskDelegate

class TaskViewHolder(delegate: TaskDelegate, viewHolderTaskBinding: ViewHolderTaskBinding) :
    RecyclerView.ViewHolder(viewHolderTaskBinding.root) {

    init {
        viewHolderTaskBinding.viewTask.ivProfile.setOnClickListener { delegate.onTapProfile() }
    }
}