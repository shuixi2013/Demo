package com.baidu.android.pushservice.e;

import android.content.Context;
import java.util.HashMap;

public class p
  extends c
{
  protected String d;
  
  public p(l paraml, Context paramContext, String paramString)
  {
    super(paraml, paramContext);
    this.d = paramString;
  }
  
  protected void a(HashMap<String, String> paramHashMap)
  {
    super.a(paramHashMap);
    paramHashMap.put("method", "ginfo");
    paramHashMap.put("gid", this.d);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/android/pushservice/e/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */