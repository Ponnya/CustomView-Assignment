package com.padc.ponnya.customviewassignmentprj.activities

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.R
import com.padc.ponnya.customviewassignmentprj.adapters.ProfileImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private lateinit var mProfileImageAdapter: ProfileImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        mProfileImageAdapter = ProfileImageAdapter()
        rvProfileImage.adapter = mProfileImageAdapter
        // Overlap Items Right to left
        rvProfileImage.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                val mPosition = parent.getChildAdapterPosition(view)
                if (mPosition != 0)
                    outRect.left = -80
                else
                    super.getItemOffsets(outRect, view, parent, state)

            }
        })

        rvProfileImage.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)


    }
}