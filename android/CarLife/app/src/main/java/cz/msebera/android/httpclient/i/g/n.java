package cz.msebera.android.httpclient.i.g;

import cz.msebera.android.httpclient.annotation.Immutable;
import cz.msebera.android.httpclient.j.d;
import cz.msebera.android.httpclient.j.h;
import cz.msebera.android.httpclient.k.w;
import cz.msebera.android.httpclient.x;
import cz.msebera.android.httpclient.y;

@Immutable
public class n
  implements d<x>
{
  public static final n a = new n();
  private final w b;
  private final y c;
  
  public n()
  {
    this(null, null);
  }
  
  public n(w paramw, y paramy)
  {
    if (paramw != null)
    {
      this.b = paramw;
      if (paramy == null) {
        break label30;
      }
    }
    for (;;)
    {
      this.c = paramy;
      return;
      paramw = cz.msebera.android.httpclient.k.l.b;
      break;
      label30:
      paramy = cz.msebera.android.httpclient.i.l.a;
    }
  }
  
  public cz.msebera.android.httpclient.j.c<x> a(h paramh, cz.msebera.android.httpclient.d.c paramc)
  {
    return new m(paramh, this.b, this.c, paramc);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/cz/msebera/android/httpclient/i/g/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */