package com.padc.ponnya.customviewassignmentprj.activities

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padc.ponnya.customviewassignmentprj.R
import com.padc.ponnya.customviewassignmentprj.adapters.ProfileImageAdapter
import com.padc.ponnya.customviewassignmentprj.adapters.TaskAdapter
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.MainPresenter
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.impl.MainPresenterImpl
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(),MainView {
    private lateinit var mProfileImageAdapter: ProfileImageAdapter
    private lateinit var mTaskAdapter: TaskAdapter

    private lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPresenter()
        setUpProfileRecyclerView()
        setUpTasksListRecyclerView()
    }

    private fun setUpPresenter() {
        mMainPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mMainPresenter.initView(this)
    }

    private fun setUpProfileRecyclerView() {
        mProfileImageAdapter = ProfileImageAdapter(mMainPresenter)
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
                    outRect.left = -40
                else
                    super.getItemOffsets(outRect, view, parent, state)

            }
        })

        rvProfileImage.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setUpTasksListRecyclerView(){
        mTaskAdapter = TaskAdapter()
        rvTaskList.adapter = mTaskAdapter
        rvTaskList.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
    }

    override fun navigateToProfileScreen() {
        startActivity(ProfileActivity.newIntent(this))
    }
}