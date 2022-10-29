package com.padc.ponnya.customviewassignmentprj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderProfileImageBinding
import com.padc.ponnya.customviewassignmentprj.delegates.ProfileDelegate
import com.padc.ponnya.customviewassignmentprj.views.viewholders.ProfileImageViewHolder

class ProfileImageAdapter(private val mDelegate: ProfileDelegate) : RecyclerView.Adapter<ProfileImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileImageViewHolder {
        val view = ViewHolderProfileImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProfileImageViewHolder(mDelegate,view)
    }

    override fun onBindViewHolder(holder: ProfileImageViewHolder, position: Int) {
        if (position == itemCount - 1)
            holder.bindData(true)
    }

    override fun getItemCount(): Int = 4
}