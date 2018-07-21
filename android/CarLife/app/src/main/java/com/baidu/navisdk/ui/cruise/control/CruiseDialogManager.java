package com.baidu.navisdk.ui.cruise.control;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.baidu.navisdk.ui.util.TipTool;
import com.baidu.navisdk.ui.widget.BNDialog;
import com.baidu.navisdk.ui.widget.BNDialog.OnNaviClickListener;
import com.baidu.navisdk.util.common.LogUtil;
import com.baidu.navisdk.util.common.ScreenUtil;
import com.baidu.navisdk.util.jar.JarUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CruiseDialogManager
{
  private static final String TAG = "Cruise";
  private Activity mActivity;
  private CruiseDialogManagerInterface mCruiseDialogManagerInterface;
  private List<Dialog> mDialogList = new LinkedList();
  private BNDialog mExitDialog;
  private BNDialog mGPSSettingDialog;
  private AlertDialog mNewerGuideDialog;
  private BNDialog mNotLocatedDialog;
  private BNDialog mUnavailableDialog;
  
  public CruiseDialogManager(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  private void buildNewerGuideDialogLand()
  {
    if (this.mNewerGuideDialog == null)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mActivity);
      View localView = JarUtils.inflate(this.mActivity, 1711472664, null);
      localView.findViewById(1711865991).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (CruiseDialogManager.this.mNewerGuideDialog != null)
          {
            CruiseDialogManager.this.mNewerGuideDialog.dismiss();
            CruiseDialogManager.access$302(CruiseDialogManager.this, null);
          }
          CruiseDialogManager.this.popDialogAndShow();
        }
      });
      this.mNewerGuideDialog = localBuilder.create();
      if (this.mNewerGuideDialog != null)
      {
        this.mNewerGuideDialog.setView(localView, 0, 0, 0, 0);
        this.mNewerGuideDialog.setCancelable(false);
      }
    }
  }
  
  private void buildNewerGuideDialogPortrait()
  {
    if (this.mNewerGuideDialog == null)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mActivity);
      int i = 1711472663;
      if (ScreenUtil.getInstance().getHeightPixels() < 640) {
        i = 1711472664;
      }
      View localView = JarUtils.inflate(this.mActivity, i, null);
      localView.findViewById(1711865991).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (CruiseDialogManager.this.mNewerGuideDialog != null)
          {
            CruiseDialogManager.this.mNewerGuideDialog.dismiss();
            CruiseDialogManager.access$302(CruiseDialogManager.this, null);
          }
          CruiseDialogManager.this.popDialogAndShow();
        }
      });
      this.mNewerGuideDialog = localBuilder.create();
      if (this.mNewerGuideDialog != null)
      {
        this.mNewerGuideDialog.setView(localView, 0, 0, 0, 0);
        this.mNewerGuideDialog.setCancelable(false);
      }
    }
  }
  
  private void openSysNetworkSetting(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Intent localIntent = new Intent("android.settings.WIFI_SETTINGS");; localIntent = new Intent("android.settings.WIRELESS_SETTINGS")) {
      try
      {
        if (this.mActivity != null) {
          this.mActivity.startActivity(localIntent);
        }
        return;
      }
      catch (Exception localException)
      {
        LogUtil.e("Cruise", localException.toString());
      }
    }
  }
  
  public void dismissGPSSettingDialog()
  {
    try
    {
      if (this.mCruiseDialogManagerInterface != null)
      {
        this.mCruiseDialogManagerInterface.dismissGPSSettingDialog();
        return;
      }
      if ((this.mGPSSettingDialog != null) && (this.mActivity != null) && (!this.mActivity.isFinishing()))
      {
        if (this.mGPSSettingDialog.isShowing()) {
          this.mGPSSettingDialog.dismiss();
        }
        this.mGPSSettingDialog = null;
        return;
      }
    }
    catch (Exception localException) {}
  }
  
  public void dismissQuitDialog()
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.dismissQuitDialog();
    }
    while ((this.mExitDialog == null) || (this.mActivity == null) || (this.mActivity.isFinishing())) {
      return;
    }
    if (this.mExitDialog.isShowing()) {
      this.mExitDialog.dismiss();
    }
    this.mExitDialog = null;
  }
  
  public void hideCruiseUnavailableDialog()
  {
    try
    {
      if (this.mCruiseDialogManagerInterface != null)
      {
        this.mCruiseDialogManagerInterface.hideCruiseUnavailableDialog();
        return;
      }
      if ((this.mUnavailableDialog != null) && (this.mUnavailableDialog.isShowing()))
      {
        this.mUnavailableDialog.dismiss();
        return;
      }
    }
    catch (Exception localException)
    {
      this.mUnavailableDialog = null;
    }
  }
  
  public boolean isNewerGuideDialogShowing()
  {
    return (this.mNewerGuideDialog != null) && (this.mNewerGuideDialog.isShowing());
  }
  
  public void popDialogAndShow()
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.popDialogAndShow();
    }
    Dialog localDialog;
    do
    {
      do
      {
        return;
      } while ((this.mDialogList == null) || (this.mDialogList.isEmpty()));
      localDialog = (Dialog)this.mDialogList.remove(0);
    } while ((localDialog == null) || (localDialog.isShowing()) || (this.mActivity.isFinishing()));
    try
    {
      localDialog.show();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void putDialogInQueue(Dialog paramDialog)
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.putDialogInQueue(paramDialog);
    }
    while ((this.mDialogList == null) || (paramDialog == null)) {
      return;
    }
    Iterator localIterator = this.mDialogList.iterator();
    while (localIterator.hasNext()) {
      if (paramDialog == (Dialog)localIterator.next()) {
        return;
      }
    }
    this.mDialogList.add(paramDialog);
  }
  
  public void setCruiseDialogManagerInterface(CruiseDialogManagerInterface paramCruiseDialogManagerInterface)
  {
    this.mCruiseDialogManagerInterface = paramCruiseDialogManagerInterface;
  }
  
  public void showCruiseNotLocDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener)
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.showCruiseNotLocDialog(paramOnNaviClickListener);
    }
    for (;;)
    {
      return;
      try
      {
        if (this.mNotLocatedDialog == null)
        {
          this.mNotLocatedDialog = new BNDialog(this.mActivity).setTitleText(1711669372).setContentMessage(1711669733).setFirstBtnText(1711669373).setOnFirstBtnClickListener(paramOnNaviClickListener);
          this.mNotLocatedDialog.setCancelable(false);
        }
        if (this.mNotLocatedDialog != null)
        {
          this.mNotLocatedDialog.show();
          return;
        }
      }
      catch (Exception paramOnNaviClickListener) {}
    }
  }
  
  public void showCruiseUnavailableDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener)
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.showCruiseUnavailableDialog(paramOnNaviClickListener);
    }
    for (;;)
    {
      return;
      hideCruiseUnavailableDialog();
      try
      {
        if ((this.mUnavailableDialog == null) && (this.mActivity != null)) {
          this.mUnavailableDialog = new BNDialog(this.mActivity).setTitleText(1711669372).setContentMessage(1711669731).setFirstBtnText(1711669732).setOnFirstBtnClickListener(new BNDialog.OnNaviClickListener()
          {
            public void onClick()
            {
              CruiseDialogManager.this.openSysNetworkSetting(true);
              CruiseDialogManager.this.mUnavailableDialog.dismiss();
            }
          }).setSecondBtnText(1711669759).setOnSecondBtnClickListener(paramOnNaviClickListener);
        }
        if ((this.mUnavailableDialog != null) && (!this.mActivity.isFinishing()))
        {
          this.mUnavailableDialog.show();
          return;
        }
      }
      catch (Exception paramOnNaviClickListener)
      {
        this.mUnavailableDialog = null;
      }
    }
  }
  
  public void showGPSSettingDialog()
  {
    try
    {
      if (this.mCruiseDialogManagerInterface != null)
      {
        this.mCruiseDialogManagerInterface.showGPSSettingDialog();
        return;
      }
      if ((this.mGPSSettingDialog == null) && (this.mActivity != null) && (!this.mActivity.isFinishing()))
      {
        Resources localResources = JarUtils.getResources();
        this.mGPSSettingDialog = new BNDialog(this.mActivity).setTitleText(localResources.getString(1711669372)).setContentMessage(localResources.getString(1711669746)).setFirstBtnText(localResources.getString(1711669747)).setFirstBtnTextColorHighLight().setOnFirstBtnClickListener(new BNDialog.OnNaviClickListener()
        {
          public void onClick()
          {
            try
            {
              Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
              CruiseDialogManager.this.mActivity.startActivity(localIntent);
              return;
            }
            catch (Exception localException)
            {
              LogUtil.e("", localException.toString());
              TipTool.onCreateToastDialog(CruiseDialogManager.this.mActivity, JarUtils.getResources().getString(1711669421));
            }
          }
        }).setSecondBtnText(localResources.getString(1711669373)).setOnSecondBtnClickListener(new BNDialog.OnNaviClickListener()
        {
          public void onClick()
          {
            if ((CruiseDialogManager.this.mActivity != null) && (CruiseDialogManager.this.mActivity != null) && (!CruiseDialogManager.this.mActivity.isFinishing())) {
              TipTool.onCreateToastDialog(CruiseDialogManager.this.mActivity, JarUtils.getResources().getString(1711669415));
            }
          }
        });
      }
      if ((this.mActivity != null) && (!this.mActivity.isFinishing()) && (this.mGPSSettingDialog != null) && (!this.mGPSSettingDialog.isShowing()))
      {
        this.mGPSSettingDialog.show();
        return;
      }
    }
    catch (Exception localException)
    {
      LogUtil.e("Cruise", "dialog show failed because activity is NOT running!");
    }
  }
  
  public void showNewerGuideDialog(boolean paramBoolean)
  {
    if ((this.mNewerGuideDialog != null) && (this.mNewerGuideDialog.isShowing()))
    {
      this.mNewerGuideDialog.dismiss();
      this.mNewerGuideDialog = null;
    }
    if (paramBoolean) {
      putDialogInQueue(this.mNewerGuideDialog);
    }
    while ((this.mNewerGuideDialog == null) || (this.mActivity.isFinishing())) {
      return;
    }
    this.mNewerGuideDialog.show();
  }
  
  public void showQuitDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener)
  {
    if (this.mCruiseDialogManagerInterface != null) {
      this.mCruiseDialogManagerInterface.showQuitDialog(paramOnNaviClickListener);
    }
    for (;;)
    {
      return;
      if (this.mActivity != null)
      {
        dismissQuitDialog();
        try
        {
          this.mExitDialog = new BNDialog(this.mActivity).enableBackKey(true).setTitleText(JarUtils.getResources().getString(1711669372)).setContentMessage(JarUtils.getResources().getString(1711669745)).setSecondBtnText(JarUtils.getResources().getString(1711669611)).setSecondBtnTextColorHighLight().setOnSecondBtnClickListener(paramOnNaviClickListener).setFirstBtnText(JarUtils.getResources().getString(1711669612)).setOnFirstBtnClickListener(new BNDialog.OnNaviClickListener()
          {
            public void onClick() {}
          });
          if ((!this.mExitDialog.isShowing()) && (this.mActivity != null) && (!this.mActivity.isFinishing()))
          {
            this.mExitDialog.show();
            return;
          }
        }
        catch (Exception paramOnNaviClickListener) {}
      }
    }
  }
  
  public static abstract interface CruiseDialogManagerInterface
  {
    public abstract void dismissGPSSettingDialog();
    
    public abstract void dismissQuitDialog();
    
    public abstract void hideCruiseUnavailableDialog();
    
    public abstract void popDialogAndShow();
    
    public abstract void putDialogInQueue(Dialog paramDialog);
    
    public abstract void showCruiseNotLocDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener);
    
    public abstract void showCruiseUnavailableDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener);
    
    public abstract void showGPSSettingDialog();
    
    public abstract void showQuitDialog(BNDialog.OnNaviClickListener paramOnNaviClickListener);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navisdk/ui/cruise/control/CruiseDialogManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */