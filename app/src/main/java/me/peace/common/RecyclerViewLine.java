package me.peace.common;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by User_Kira on 2016/10/14.
 */
public class RecyclerViewLine extends RecyclerView.ItemDecoration {

    public static final int HORIZONTAL = LinearLayoutManager.HORIZONTAL;
    public static final int VERTICAL = LinearLayoutManager.VERTICAL;

    private Paint paint;
    private int orientation;
    private int size;

    private RecyclerViewLine() {
        this(VERTICAL);
    }

    private RecyclerViewLine(int orientation) {
        this.orientation = orientation;
        paint = new Paint();
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

        if (orientation == VERTICAL) {
            drawHorizontal(c, parent);
        } else {
            drawVertical(c, parent);
        }
    }

    protected void drawVertical(Canvas c, RecyclerView parent) {
        final int top = parent.getPaddingTop();
        final int bottom = parent.getHeight() - parent.getPaddingBottom();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            final int left = child.getRight() + params.rightMargin;
            final int right = left + size;
            c.drawRect(left, top, right, bottom, paint);
        }
    }

    protected void drawHorizontal(Canvas c, RecyclerView parent) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            final int top = child.getBottom() + params.bottomMargin;
            final int bottom = top + size;
            c.drawRect(left, top, right, bottom, paint);
        }
    }

    public static class Builder{
        private RecyclerViewLine line;

        public Builder(){
            line = new RecyclerViewLine();
        }

        public Builder setSize(int size){
            line.size = size;
            return this;
        }

        public Builder setOrientation(int orientation) {
            if (orientation == VERTICAL || orientation == HORIZONTAL) {
                line.orientation = orientation;
            }
            return this;
        }

        public Builder setColor(int color) {
            line.paint.setColor(color);
            return this;
        }

        public RecyclerViewLine build(){
            return line;
        }
    }
}