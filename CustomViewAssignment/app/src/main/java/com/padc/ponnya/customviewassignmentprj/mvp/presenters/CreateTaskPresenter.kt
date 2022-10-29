package com.padc.ponnya.customviewassignmentprj.mvp.presenters

import com.padc.ponnya.customviewassignmentprj.delegates.ProfileDelegate
import com.padc.ponnya.customviewassignmentprj.mvp.views.CreateTaskView
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView

interface CreateTaskPresenter:IBasePresenter, ProfileDelegate {
    fun initView(view: CreateTaskView)
}