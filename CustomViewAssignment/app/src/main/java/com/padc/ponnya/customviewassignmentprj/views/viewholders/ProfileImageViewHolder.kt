package com.padc.ponnya.customviewassignmentprj.views.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.R
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderProfileImageBinding

class ProfileImageViewHolder(private val viewHolderProfileImageBinding: ViewHolderProfileImageBinding) :
    RecyclerView.ViewHolder(viewHolderProfileImageBinding.root) {
    fun bindData() {
        viewHolderProfileImageBinding.ivProfile.setImageResource(R.drawable.add_icon)
    }
}