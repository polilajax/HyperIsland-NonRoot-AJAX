package com.hyperisland

import android.app.*
import android.content.*
import android.graphics.*
import android.os.*
import android.view.*

class IslandService : Service() {

    override fun onCreate() {
        super.onCreate()

        val wm = getSystemService(WINDOW_SERVICE) as WindowManager

        val view = View(this)
        view.setBackgroundColor(Color.BLACK)

        val params = WindowManager.LayoutParams(
            200, 80,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )

        params.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL

        wm.addView(view, params)
    }

    override fun onBind(intent: Intent?) = null
}
