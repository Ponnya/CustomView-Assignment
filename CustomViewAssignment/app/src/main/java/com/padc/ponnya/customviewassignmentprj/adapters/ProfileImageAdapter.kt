package com.padc.ponnya.customviewassignmentprj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.databinding.ViewHolderProfileImageBinding
import com.padc.ponnya.customviewassignmentprj.views.viewholders.ProfileImageViewHolder

class ProfileImageAdapter : RecyclerView.Adapter<ProfileImageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileImageViewHolder {
        val view = ViewHolderProfileImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProfileImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileImageViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 4
}