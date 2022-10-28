package com.padc.ponnya.customviewassignmentprj.views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.padc.ponnya.customviewassignmentprj.R

class CircleImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatImageView(context, attrs) {

    private var path = Path()

    private var strokeColor = Color.BLACK

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        // Paint styles used for rendering are initialized here. This
        // is a performance optimization, since onDraw() is called
        // for every screen refresh.
        color = strokeColor
    }

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageView) {
            strokeColor = getColor(R.styleable.CircleImageView_strokeColor, strokeColor)
        }
    }

    private var size = 0

    override fun onDraw(canvas: Canvas?) {
        val radius = size / 2f
        paint.isAntiAlias = true
        path.addCircle(size / 2f, size / 2f, radius - (radius * 0.1f), Path.Direction.CCW)
        canvas?.drawCircle(size / 2f, size / 2f, radius, paint)
        canvas?.clipPath(path)


        super.onDraw(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        size = measuredWidth.coerceAtMost(measuredHeight)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}