package com.baidu.carlife.core.connect;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener;
import android.util.Log;
import com.baidu.baidumaps.common.network.NetworkListener;
import com.baidu.carlife.core.C1253f;
import com.baidu.carlife.core.C1260i;
import com.baidu.carlife.core.C1261k;

public class WifiDirectBroadReceiver extends BroadcastReceiver {
    /* renamed from: b */
    private static final String f3200b = "[WifiDirect]";
    /* renamed from: e */
    private static boolean f3201e = false;
    /* renamed from: a */
    Activity f3202a = null;
    /* renamed from: c */
    private WifiP2pManager f3203c;
    /* renamed from: d */
    private Channel f3204d;
    /* renamed from: f */
    private C1237h f3205f = null;

    public WifiDirectBroadReceiver(WifiP2pManager manager, Channel channel, C1237h uWifiDirectManager) {
        this.f3203c = manager;
        this.f3204d = channel;
        this.f3205f = uWifiDirectManager;
    }

    public WifiDirectBroadReceiver(WifiP2pManager manager, Channel channel, Activity activity) {
        this.f3203c = manager;
        this.f3204d = channel;
        this.f3202a = activity;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        C1260i.m4435b(f3200b, "BroadReceiver: -------------- : " + action);
        if (NetworkListener.f2258e.equals(action)) {
            m4105a(context, intent);
            return;
        }
        int state;
        if ("android.net.wifi.p2p.STATE_CHANGED".equals(action)) {
            state = intent.getIntExtra("wifi_p2p_state", -1);
            if (state == 2) {
                C1260i.m4435b(f3200b, "BroadReceiver: state WIFI_P2P_STATE_ENABLED :" + state);
            } else {
                C1260i.m4435b(f3200b, "BroadReceiver: state WIFI_P2P_STATE_DISABLED :" + state);
            }
        }
        if ("android.net.wifi.p2p.PEERS_CHANGED".equals(action) && this.f3203c != null) {
            C1260i.m4435b(f3200b, "BroadReceiver: PEERS_CHANGED ");
        }
        if ("android.net.wifi.p2p.THIS_DEVICE_CHANGED".equals(action)) {
            WifiP2pDevice device = (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice");
            C1260i.m4435b(f3200b, "BroadReceiver: Device status : " + device.status);
            if (device.status == 0) {
                C1260i.m4435b(f3200b, "BroadReceiver: --------------------- peer connected");
                f3201e = true;
            } else if (f3201e) {
                C1260i.m4435b(f3200b, "BroadReceiver: --------------------- peer disconnected reset discover");
                f3201e = false;
                C1261k.m4453a((int) C1253f.fp, 2000);
            }
        }
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(action)) {
            C1260i.m4435b(f3200b, "BroadReceiver: WIFI_P2P_CONNECTION_CHANGED_ACTION : ");
            if (this.f3203c != null) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                C1260i.m4435b(f3200b, "BroadReceiver: NetworkInfo Connect state : " + networkInfo.isConnected());
                if (networkInfo.isConnected()) {
                    C1260i.m4435b(f3200b, "BroadReceiver: Connected to p2p network. Requesting network details");
                    if (this.f3205f != null) {
                        this.f3203c.requestConnectionInfo(this.f3204d, this.f3205f);
                    } else if (this.f3202a != null) {
                        this.f3203c.requestConnectionInfo(this.f3204d, (ConnectionInfoListener) this.f3202a);
                    }
                }
            } else {
                return;
            }
        }
        if ("android.net.wifi.p2p.DISCOVERY_STATE_CHANGE".equals(action)) {
            state = intent.getIntExtra("discoveryState", -1);
            if (2 == state) {
                Log.d(f3200b, "BroadReceiver: -------- WIFI_P2P_DISCOVERY_STARTED");
            } else if (1 == state) {
                Log.d(f3200b, "BroadReceiver: -------- WIFI_P2P_DISCOVERY_STOPPED");
            } else {
                Log.d(f3200b, "BroadReceiver: -------- Unknown state !");
            }
        }
    }

    /* renamed from: a */
    public void m4105a(Context context, Intent intent) {
        switch (intent.getIntExtra("wifi_state", 0)) {
            case 1:
                C1260i.m4435b(f3200b, "Wifi State: Disabled");
                return;
            case 3:
                C1260i.m4435b(f3200b, "Wifi State: Enabled");
                C1261k.m4453a((int) C1253f.fq, 1000);
                return;
            default:
                return;
        }
    }
}
