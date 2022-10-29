package com.padc.ponnya.customviewassignmentprj.mvp.presenters.impl

import androidx.lifecycle.ViewModel
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.CreateTaskPresenter
import com.padc.ponnya.customviewassignmentprj.mvp.views.CreateTaskView
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView

class CreateTaskPresenterImpl : ViewModel(), CreateTaskPresenter {

    private lateinit var mView: CreateTaskView
    override fun initView(view: CreateTaskView) {
        mView = view
    }

    override fun onUiReady() {

    }

    override fun onTapAddButton() {

    }
}