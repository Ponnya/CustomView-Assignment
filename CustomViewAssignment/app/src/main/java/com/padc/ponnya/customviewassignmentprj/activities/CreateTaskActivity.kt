package com.padc.ponnya.customviewassignmentprj.activities

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.R
import com.padc.ponnya.customviewassignmentprj.adapters.ProfileImageAdapter
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.CreateTaskPresenter
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.MainPresenter
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.impl.CreateTaskPresenterImpl
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.impl.MainPresenterImpl
import com.padc.ponnya.customviewassignmentprj.mvp.views.CreateTaskView
import kotlinx.android.synthetic.main.activity_create_task.*
import kotlinx.android.synthetic.main.activity_main.*

class CreateTaskActivity : BaseActivity(),CreateTaskView {

    private lateinit var mProfileImageAdapter: ProfileImageAdapter

    private lateinit var mCreateTaskPresenter: CreateTaskPresenter

    companion object {
        fun newIntent(context: Context) = Intent(context, CreateTaskActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)
        setUpPresenter()
        setUpProfileRecyclerView()
    }

    private fun setUpPresenter() {
        mCreateTaskPresenter = ViewModelProvider(this)[CreateTaskPresenterImpl::class.java]
        mCreateTaskPresenter.initView(this)
    }

    private fun setUpProfileRecyclerView() {
        mProfileImageAdapter = ProfileImageAdapter(mCreateTaskPresenter)
        rvAssigneeProfileImage.adapter = mProfileImageAdapter
        // Overlap Items Right to left
        rvAssigneeProfileImage.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                val mPosition = parent.getChildAdapterPosition(view)
                if (mPosition != 0)
                    outRect.left = -40
                else
                    super.getItemOffsets(outRect, view, parent, state)
            }
        })

        rvAssigneeProfileImage.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
    }
}