package com.baidu.carlife.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RoundCornerImageView
  extends ImageView
{
  public RoundCornerImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Path localPath = new Path();
    int i = getWidth();
    int j = getHeight();
    localPath.addRoundRect(new RectF(0.0F, 0.0F, i, j), 20.0F, 20.0F, Path.Direction.CW);
    paramCanvas.clipPath(localPath);
    super.onDraw(paramCanvas);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/carlife/view/RoundCornerImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */