package com.baidu.carlife.core.screen.b;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.baidu.carlife.core.i;

public class b
  extends a
{
  public b(Activity paramActivity)
  {
    this.c = paramActivity;
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    i.b("ouyang", "-------keyCode:" + paramInt);
    if ((paramInt != 65521) && (paramInt != 65520)) {
      return false;
    }
    if (paramKeyEvent.getAction() == 0)
    {
      i.b("ouyang", "-------ACTION_DOWN----");
      return false;
    }
    if (paramKeyEvent.getAction() == 1)
    {
      if (paramInt != 65520) {
        break label95;
      }
      this.c.dispatchKeyEvent(new KeyEvent(0, 22));
    }
    for (;;)
    {
      i.b("ouyang", "-------ACTION_UP----");
      return true;
      label95:
      this.c.dispatchKeyEvent(new KeyEvent(0, 21));
    }
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/carlife/core/screen/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */