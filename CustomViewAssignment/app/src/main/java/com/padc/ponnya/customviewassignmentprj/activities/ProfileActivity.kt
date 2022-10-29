package com.padc.ponnya.customviewassignmentprj.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.padc.ponnya.customviewassignmentprj.R

class ProfileActivity : BaseActivity() {
    companion object {
        fun newIntent(context: Context) = Intent(context, ProfileActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
}