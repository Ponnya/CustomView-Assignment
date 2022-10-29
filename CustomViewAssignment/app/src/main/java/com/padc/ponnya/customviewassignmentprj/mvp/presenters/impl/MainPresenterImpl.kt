package com.padc.ponnya.customviewassignmentprj.mvp.presenters.impl

import androidx.lifecycle.ViewModel
import com.padc.ponnya.customviewassignmentprj.mvp.presenters.MainPresenter
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView

class MainPresenterImpl : ViewModel(), MainPresenter {

    private lateinit var mMainView: MainView

    override fun initView(view: MainView) {
        mMainView = view
    }

    override fun onTapClose() {
        mMainView.closeProfileScreen()
    }

    override fun onUiReady() {

    }

    override fun onTapAddButton() {

    }

    override fun onTapProfile() {
        mMainView.openProfileScreen()
    }
}