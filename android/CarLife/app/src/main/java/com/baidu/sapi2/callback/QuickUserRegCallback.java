package com.baidu.sapi2.callback;

import com.baidu.sapi2.result.QuickUserRegResult;

public abstract class QuickUserRegCallback
  implements CaptchaAware<QuickUserRegResult>
{
  public abstract void onUsernameExist(QuickUserRegResult paramQuickUserRegResult);
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/sapi2/callback/QuickUserRegCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */