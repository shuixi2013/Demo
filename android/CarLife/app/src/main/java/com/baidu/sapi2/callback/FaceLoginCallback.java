package com.baidu.sapi2.callback;

import com.baidu.sapi2.result.FaceLoginResult;

public abstract class FaceLoginCallback
  implements SapiCallback<FaceLoginResult>
{
  public abstract void onPwdVerifyFailure(FaceLoginResult paramFaceLoginResult);
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/sapi2/callback/FaceLoginCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */