package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.m;

final class v
  implements Runnable
{
  v(Context paramContext, k paramk) {}
  
  public final void run()
  {
    if (this.a == null)
    {
      j.g().g("The Context of StatService.onResume() can not be null!");
      return;
    }
    j.a(this.a, m.h(this.a), this.b);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/tencent/wxop/stat/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */