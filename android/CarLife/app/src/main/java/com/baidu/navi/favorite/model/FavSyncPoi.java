package com.baidu.navi.favorite.model;

import android.text.TextUtils;
import com.baidu.platform.comapi.basestruct.Point;

public class FavSyncPoi
{
  public int actionType;
  public String addTimesec;
  public String bduid;
  public String buildingId;
  public String cId;
  public int cityid;
  public String content;
  public String floorId;
  public boolean isDetail;
  public boolean isSync;
  public int nId;
  public String poiId;
  public String poiJsonData;
  public String poiName;
  public int poiStyle;
  public int poiType;
  public Point pt;
  public String sId;
  public int version;
  
  public int getActionType()
  {
    return this.actionType;
  }
  
  public int getNID()
  {
    return this.nId;
  }
  
  public int getVersion()
  {
    return this.version;
  }
  
  public boolean hasPoiJsonData()
  {
    return !TextUtils.isEmpty(this.poiJsonData);
  }
  
  public String toString()
  {
    return "sId:" + this.sId + ", cId:" + this.cId + ", name:" + this.poiName + ", addr:" + this.content + ", addTimesec:" + this.addTimesec + ", poiId:" + this.poiId + ", version:" + this.version + ", isSync:" + this.isSync + ", actionType:" + this.actionType + ", pt:" + this.pt.toString() + ", bduid:" + this.bduid;
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navi/favorite/model/FavSyncPoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */