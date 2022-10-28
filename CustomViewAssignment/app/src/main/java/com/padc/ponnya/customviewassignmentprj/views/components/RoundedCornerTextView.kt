package com.padc.ponnya.customviewassignmentprj.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.withStyledAttributes
import com.padc.ponnya.customviewassignmentprj.R

private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
    // Paint styles used for rendering are initialized here. This
    // is a performance optimization, since onDraw() is called
    // for every screen refresh.
    style = Paint.Style.FILL
}
private var cornerRadius = 0f

private var backgroundColor = Color.WHITE

class RoundedCornerTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {



    private val path = Path()

init {
    context.withStyledAttributes(attrs,R.styleable.RoundedCornerTextView){
        backgroundColor = getColor(R.styleable.RoundedCornerTextView_backgroundColor,
            backgroundColor)

        cornerRadius = getDimension(R.styleable.RoundedCornerTextView_cornerRadius, cornerRadius)
    }
}
    override fun onDraw(canvas: Canvas?) {

        val rectangle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        path.addRoundRect(rectangle,cornerRadius,cornerRadius,Path.Direction.CCW)

        paint.color = backgroundColor

        canvas?.drawPath(path,paint)
        super.onDraw(canvas)

    }

}