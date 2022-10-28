package com.padc.ponnya.customviewassignmentprj.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.withStyledAttributes
import com.padc.ponnya.customviewassignmentprj.R

class RoundedCornerTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    private var cornerRadius = 0f

    private var mBackgroundColor = Color.WHITE

    private val path = Path()

    init {
        context.withStyledAttributes(attrs, R.styleable.RoundedCornerTextView) {
            mBackgroundColor = getColor(
                R.styleable.RoundedCornerTextView_backgroundColor,
                mBackgroundColor
            )

            cornerRadius =
                getDimension(R.styleable.RoundedCornerTextView_cornerRadius, cornerRadius)
        }
    }

    override fun onDraw(canvas: Canvas?) {

        val rectangle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        path.addRoundRect(rectangle, cornerRadius, cornerRadius, Path.Direction.CCW)

        paint.color = mBackgroundColor
        paint.style = Paint.Style.FILL
        canvas?.drawPath(path, paint)
        super.onDraw(canvas)

    }

}