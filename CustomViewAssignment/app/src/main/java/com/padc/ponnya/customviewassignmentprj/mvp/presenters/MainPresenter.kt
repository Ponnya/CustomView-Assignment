package com.padc.ponnya.customviewassignmentprj.mvp.presenters

import com.padc.ponnya.customviewassignmentprj.delegates.ProfileDelegate
import com.padc.ponnya.customviewassignmentprj.delegates.TaskDelegate
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView

interface MainPresenter:IBasePresenter,ProfileDelegate,TaskDelegate {
    fun initView(view: MainView)
    fun onTapClose()
}