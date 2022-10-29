package com.padc.ponnya.customviewassignmentprj.views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.Gravity
import android.view.View

class CircularProgressBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : View(context, attrs) {

    private var size = 0

    private var progress = 85

    private var strokeColor = Color.GRAY

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)


    override fun onDraw(canvas: Canvas?) {

        createOuterCircle(canvas)
        drawProgress(canvas)
        createInnerCircle(canvas)
        drawText(canvas)

        super.onDraw(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        size = measuredWidth.coerceAtMost(measuredHeight)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    private fun createOuterCircle(canvas: Canvas?) {
        val outerCircleRadius = size / 2f
        paint.color = strokeColor
        canvas?.drawCircle(size / 2f, size / 2f, outerCircleRadius, paint)
    }

    private fun createInnerCircle(canvas: Canvas?) {
        val innerCircleRadius = size * 0.40f
        paint.color = Color.WHITE
        canvas?.drawCircle(size / 2f, size / 2f, innerCircleRadius, paint)
    }

    private fun drawProgress(canvas: Canvas?) {
        paint.color = Color.BLACK
        val outerCircleRadius = size / 2f
        val rectangle = RectF(
            size / 2f - outerCircleRadius,
            size / 2f - outerCircleRadius,
            size / 2f + outerCircleRadius,
            size / 2f + outerCircleRadius
        )
        canvas?.drawArc(rectangle, 270f, 360 * (progress / 100f), true, paint)
    }

    private fun drawText(canvas: Canvas?) {
        val displayTextSize = width / 3f;
        val displayText = "$progress%"
        paint.color = Color.BLACK
        paint.textSize = displayTextSize
        val len = displayText.length * displayTextSize / 4f
        canvas?.drawText(displayText, size / 2f - len, size / 2f + Gravity.CENTER.toFloat(), paint);
    }

}