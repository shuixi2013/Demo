package com.baidu.sapi2.callback;

import com.baidu.sapi2.result.VoiceLoginResult;

public abstract class VoiceLoginCallback
  implements SapiCallback<VoiceLoginResult>
{
  public abstract void onPwdVerifyFailure(VoiceLoginResult paramVoiceLoginResult);
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/sapi2/callback/VoiceLoginCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */