package com.padc.ponnya.customviewassignmentprj.views.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.R
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderProfileImageBinding
import com.padc.ponnya.customviewassignmentprj.delegates.ProfileDelegate

class ProfileImageViewHolder(
    private val mDelegate: ProfileDelegate,
    private val viewHolderProfileImageBinding: ViewHolderProfileImageBinding
) :
    RecyclerView.ViewHolder(viewHolderProfileImageBinding.root) {
    private var mClickable: Boolean = false
    init {
        viewHolderProfileImageBinding.ivProfile.setOnClickListener {
            if (mClickable)
                mDelegate.onTapAddButton()
        }
    }

    fun bindData(clickable: Boolean) {
        mClickable = clickable
        viewHolderProfileImageBinding.ivProfile.setImageResource(R.drawable.add_icon)
    }
}