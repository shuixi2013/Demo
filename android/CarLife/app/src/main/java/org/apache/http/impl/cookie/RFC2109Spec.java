package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class RFC2109Spec
  extends CookieSpecBase
{
  public RFC2109Spec()
  {
    throw new RuntimeException("Stub!");
  }
  
  public RFC2109Spec(String[] paramArrayOfString, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void formatCookieAsVer(CharArrayBuffer paramCharArrayBuffer, Cookie paramCookie, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public List<Header> formatCookies(List<Cookie> paramList)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void formatParamAsVer(CharArrayBuffer paramCharArrayBuffer, String paramString1, String paramString2, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getVersion()
  {
    throw new RuntimeException("Stub!");
  }
  
  public Header getVersionHeader()
  {
    throw new RuntimeException("Stub!");
  }
  
  public List<Cookie> parse(Header paramHeader, CookieOrigin paramCookieOrigin)
    throws MalformedCookieException
  {
    throw new RuntimeException("Stub!");
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
    throws MalformedCookieException
  {
    throw new RuntimeException("Stub!");
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/org/apache/http/impl/cookie/RFC2109Spec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */