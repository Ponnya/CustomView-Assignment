package com.padc.ponnya.customviewassignmentprj.mvp.presenters

import com.padc.ponnya.customviewassignmentprj.delegates.ProfileDelegate
import com.padc.ponnya.customviewassignmentprj.mvp.views.MainView

interface MainPresenter:IBasePresenter,ProfileDelegate {
    fun initView(view: MainView)
}