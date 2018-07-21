package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.sdk.b.b;

public class WXDesignerSharedObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
  public String designerName;
  public String designerRediretctUrl;
  public int designerUIN;
  public String thumburl;
  public String url;
  
  public WXDesignerSharedObject() {}
  
  public WXDesignerSharedObject(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.url = paramString2;
    this.thumburl = paramString1;
    this.designerUIN = paramInt;
    this.designerName = paramString3;
  }
  
  public boolean checkArgs()
  {
    if ((this.designerUIN == 0) || (TextUtils.isEmpty(this.thumburl)) || (TextUtils.isEmpty(this.url)))
    {
      b.b("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, packageid or thumburl is invalid");
      return false;
    }
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxemojisharedobject_thumburl", this.thumburl);
    paramBundle.putInt("_wxemojisharedobject_designer_uin", this.designerUIN);
    paramBundle.putString("_wxemojisharedobject_designer_name", this.designerName);
    paramBundle.putString("_wxemojisharedobject_designer_rediretcturl", this.designerRediretctUrl);
    paramBundle.putString("_wxemojisharedobject_url", this.url);
  }
  
  public int type()
  {
    return 25;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    this.thumburl = paramBundle.getString("_wxwebpageobject_thumburl");
    this.designerUIN = paramBundle.getInt("_wxemojisharedobject_designer_uin");
    this.designerName = paramBundle.getString("_wxemojisharedobject_designer_name");
    this.designerRediretctUrl = paramBundle.getString("_wxemojisharedobject_designer_rediretcturl");
    this.url = paramBundle.getString("_wxwebpageobject_url");
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/tencent/mm/sdk/modelmsg/WXDesignerSharedObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */