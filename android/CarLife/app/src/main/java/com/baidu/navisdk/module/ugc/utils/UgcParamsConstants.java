package com.baidu.navisdk.module.ugc.utils;

import com.baidu.navisdk.util.http.HttpURLManager;

public class UgcParamsConstants
{
  public static abstract interface UgcBundlePraramsKey
  {
    public static final String UGC_BUNDLE_KEY_POSTION = "bundle_position";
    public static final String UGC_BUNDLE_KEY_PRESENTER = "bundle_presenter";
  }
  
  public static abstract interface UgcMapBtnConstants
  {
    public static final int TYPE_AUTH_REQUEST_AUDIO_BTN = 4;
    public static final int TYPE_AUTH_REQUEST_PHOTO_BTN = 3;
    public static final int TYPE_CHECK_DETAIL_BTN = 7;
    public static final int TYPE_REPORT_BTN = 1;
    public static final int TYPE_SHOW_LOGGIN_BTN = 6;
    public static final int TYPE_SHOW_REPORT_BTN = 8;
    public static final int TYPE_SOFTWARE_DIRECTION_BTN = 2;
  }
  
  public static abstract interface UrlConstants
  {
    public static final String URL_MAP_PRO_POSITION_ADDED = HttpURLManager.getInstance().getScheme() + "i.map.baidu.com/api/page/poicorrect/addpoi?business_trigger=28";
    public static final String URL_MAP_PRO_POSITION_REPORT = HttpURLManager.getInstance().getScheme() + "i.map.baidu.com/api/page/poicorrect/selectpoint?business_trigger=29";
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navisdk/module/ugc/utils/UgcParamsConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */