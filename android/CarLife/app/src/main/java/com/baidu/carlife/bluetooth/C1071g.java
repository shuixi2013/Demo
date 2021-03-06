package com.baidu.carlife.bluetooth;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageButton;
import android.widget.TextView;
import com.baidu.carlife.BaiduNaviApplication;
import com.baidu.carlife.C0965R;
import com.baidu.carlife.core.C0936j;
import com.baidu.carlife.core.C1253f;
import com.baidu.carlife.core.C1260i;
import com.baidu.carlife.core.C1261k;
import com.baidu.carlife.logic.C1868q;
import com.baidu.carlife.logic.C1868q.C1060g;
import com.baidu.carlife.p078f.C1436a;
import com.baidu.carlife.p078f.C1440d;
import com.baidu.carlife.p078f.C1443g;
import com.baidu.carlife.p087l.C1663a;
import com.baidu.carlife.processes.C2028a;
import com.baidu.carlife.util.C2171b;
import java.util.Locale;

/* compiled from: BtTeleUserInterface */
/* renamed from: com.baidu.carlife.bluetooth.g */
public class C1071g {
    /* renamed from: a */
    private static final String f2795a = C1071g.class.getSimpleName();
    /* renamed from: b */
    private static final int f2796b = -1;
    /* renamed from: c */
    private static final int f2797c = 1;
    /* renamed from: d */
    private static final int f2798d = 2;
    /* renamed from: e */
    private static final int f2799e = 3;
    /* renamed from: f */
    private static C1068a f2800f = null;
    /* renamed from: g */
    private static C1071g f2801g = null;
    /* renamed from: i */
    private static Context f2802i = null;
    /* renamed from: l */
    private static int f2803l = -1;
    /* renamed from: m */
    private static boolean f2804m = false;
    /* renamed from: n */
    private static boolean f2805n = false;
    /* renamed from: o */
    private static boolean f2806o = false;
    /* renamed from: p */
    private static boolean f2807p = false;
    /* renamed from: h */
    private C1070b f2808h = new C1070b();
    /* renamed from: j */
    private int f2809j = 0;
    /* renamed from: k */
    private boolean f2810k = false;
    /* renamed from: q */
    private C1060g f2811q = new C10611(this);
    /* renamed from: r */
    private View f2812r = null;
    /* renamed from: s */
    private WindowManager f2813s = null;

    /* compiled from: BtTeleUserInterface */
    /* renamed from: com.baidu.carlife.bluetooth.g$1 */
    class C10611 implements C1060g {
        /* renamed from: a */
        final /* synthetic */ C1071g f2786a;

        /* compiled from: BtTeleUserInterface */
        /* renamed from: com.baidu.carlife.bluetooth.g$1$1 */
        class C10591 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C10611 f2785a;

            C10591(C10611 this$1) {
                this.f2785a = this$1;
            }

            public void run() {
                this.f2785a.f2786a.m3564b(1);
            }
        }

        C10611(C1071g this$0) {
            this.f2786a = this$0;
        }

        /* renamed from: a */
        public void mo1390a(boolean isBTConnected) {
            C1260i.m4435b(C1071g.f2795a, "on PhoneStateIDLE");
            if (C1071g.f2803l == -1) {
                C1260i.m4435b(C1071g.f2795a, "From Initial State to Call Idle State");
            } else if (C1071g.f2803l != 0) {
                if (C1071g.f2803l == 1) {
                    C1260i.m4435b(C1071g.f2795a, "From Ring State to Call Idle State");
                    if (this.f2786a.m3579k()) {
                        this.f2786a.m3580l();
                    }
                    if (C2171b.m8221d()) {
                        this.f2786a.m3590e();
                    }
                } else if (C1071g.f2803l == 2) {
                    C1260i.m4435b(C1071g.f2795a, "From Offhook State to Call Idle State");
                    if (this.f2786a.m3579k()) {
                        this.f2786a.m3580l();
                    }
                    if (C2171b.m8221d()) {
                        this.f2786a.m3590e();
                    }
                }
            }
            C1071g.f2803l = 0;
            C1071g.f2806o = false;
            C1071g.f2804m = false;
            this.f2786a.f2810k = false;
            this.f2786a.m3584p();
        }

        /* renamed from: b */
        public void mo1391b(boolean isBTConnected) {
            C1260i.m4435b(C1071g.f2795a, "on PhoneCallRinging");
            if (C1071g.f2803l == -1) {
                C1260i.m4435b(C1071g.f2795a, "From Initial State to Call Ring State");
                new Handler().postDelayed(new C10591(this), 100);
            } else if (C1071g.f2803l == 0) {
                C1260i.m4435b(C1071g.f2795a, "From Idle State to Call Ring State");
                this.f2786a.m3564b(1);
                if (C2171b.m8221d() && (C2171b.m8219b() || C2171b.m8220c())) {
                    this.f2786a.m3589d();
                }
                if (this.f2786a.m3582n()) {
                    this.f2786a.m3583o();
                }
            } else if (C1071g.f2803l == 1) {
                C1260i.m4435b(C1071g.f2795a, "From Ring State to Call Ring State");
            } else if (C1071g.f2803l == 2) {
                C1260i.m4435b(C1071g.f2795a, "From Offhook State to Call Ring State");
            }
            C1071g.f2806o = false;
            C1071g.f2804m = true;
            C1071g.f2803l = 1;
        }

        /* renamed from: c */
        public void mo1392c(boolean isBTConnected) {
            C1260i.m4435b(C1071g.f2795a, "on PhoneStateOffhook");
            if (C1071g.f2803l == -1) {
                C1260i.m4435b(C1071g.f2795a, "From Initial State to Call Offhook State");
                if (!C1663a.m5979a().m6035e()) {
                    C1048c.m3441a(true);
                }
            } else if (C1071g.f2803l == 0) {
                C1260i.m4435b(C1071g.f2795a, "From Idle State to Call Offhook State");
                C1071g.f2806o = true;
                this.f2786a.m3564b(2);
                C1071g.f2804m = true;
                this.f2786a.m3583o();
            } else if (C1071g.f2803l == 1) {
                C1260i.m4435b(C1071g.f2795a, "From Ring State to Call Offhook State");
                if (this.f2786a.m3581m()) {
                    C1071g.f2804m = true;
                    this.f2786a.m3583o();
                } else if (this.f2786a.m3579k()) {
                    this.f2786a.m3580l();
                }
                if (C2171b.m8221d()) {
                    this.f2786a.m3590e();
                }
            } else if (C1071g.f2803l == 2) {
                C1260i.m4435b(C1071g.f2795a, "From Offhook State to Call Offhook State");
            }
            C1071g.f2803l = 2;
        }

        /* renamed from: a */
        public void mo1389a() {
            C1260i.m4435b(C1071g.f2795a, "on PhoneStateActive");
        }

        /* renamed from: d */
        public void mo1393d(boolean isMultiCall) {
        }
    }

    /* compiled from: BtTeleUserInterface */
    /* renamed from: com.baidu.carlife.bluetooth.g$2 */
    class C10622 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1071g f2787a;

        C10622(C1071g this$0) {
            this.f2787a = this$0;
        }

        public void onClick(View v) {
            C1260i.m4435b(C1071g.f2795a, "answer call.");
            C1868q.m7089f().m7127m();
            this.f2787a.m3590e();
        }
    }

    /* compiled from: BtTeleUserInterface */
    /* renamed from: com.baidu.carlife.bluetooth.g$3 */
    class C10633 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1071g f2788a;

        C10633(C1071g this$0) {
            this.f2788a = this$0;
        }

        public void onClick(View v) {
            C1260i.m4435b(C1071g.f2795a, "reject call");
            C1868q.m7089f().m7106a(BaiduNaviApplication.getInstance());
            this.f2788a.m3590e();
        }
    }

    /* compiled from: BtTeleUserInterface */
    /* renamed from: com.baidu.carlife.bluetooth.g$a */
    private class C1068a extends C1067l {
        /* renamed from: a */
        final /* synthetic */ C1071g f2792a;

        /* compiled from: BtTeleUserInterface */
        /* renamed from: com.baidu.carlife.bluetooth.g$a$1 */
        class C10641 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1068a f2789a;

            C10641(C1068a this$1) {
                this.f2789a = this$1;
            }

            public void run() {
                if (C1071g.f2804m) {
                    C1260i.m4435b(C1071g.f2795a, "Phone calling cause switching and dont send background message");
                    C1071g.f2804m = false;
                    return;
                }
                C1260i.m4435b(C1071g.f2795a, "no phonecall,and send background message");
                C1048c.m3441a(false);
            }
        }

        /* compiled from: BtTeleUserInterface */
        /* renamed from: com.baidu.carlife.bluetooth.g$a$2 */
        class C10652 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1068a f2790a;

            C10652(C1068a this$1) {
                this.f2790a = this$1;
            }

            public void run() {
                this.f2790a.f2792a.m3580l();
            }
        }

        /* compiled from: BtTeleUserInterface */
        /* renamed from: com.baidu.carlife.bluetooth.g$a$3 */
        class C10663 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1068a f2791a;

            C10663(C1068a this$1) {
                this.f2791a = this$1;
            }

            public void run() {
                this.f2791a.f2792a.m3580l();
            }
        }

        private C1068a(C1071g c1071g) {
            this.f2792a = c1071g;
        }

        /* renamed from: a */
        public void mo1394a() {
            C1260i.m4435b(C1071g.f2795a, "onStart: ");
        }

        /* renamed from: b */
        public void mo1396b() {
            C1260i.m4435b(C1071g.f2795a, "onStop: ");
            new Handler().postDelayed(new C10641(this), 1000);
        }

        /* renamed from: c */
        public void mo1397c() {
            C1260i.m4435b(C1071g.f2795a, "onPause: ");
        }

        /* renamed from: d */
        public void mo1398d() {
            C1260i.m4435b(C1071g.f2795a, "onResume: ");
            C1663a.m5979a().m6039g();
            C1048c.m3441a(true);
        }

        /* renamed from: e */
        public void mo1399e() {
            C1260i.m4435b(C1071g.f2795a, "onConfigurationChanged: ");
        }

        /* renamed from: a */
        public void mo1395a(Intent intent) {
            C1260i.m4435b(C1071g.f2795a, "onNewIntent: ");
            if (intent != null) {
                int value = intent.getIntExtra("com.baidu.carlife.callstate", -2);
                C1260i.m4435b(C1071g.f2795a, "get Intent Extra: com.baidu.carlife.callstate = " + value);
                if (value == 1) {
                    if (C2171b.m8221d()) {
                        this.f2792a.m3589d();
                    }
                } else if (value == 2) {
                    if (this.f2792a.m3579k()) {
                        new Handler().postDelayed(new C10652(this), 1000);
                    }
                    if (C2171b.m8221d()) {
                        this.f2792a.m3589d();
                    }
                } else if (value == -2 && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("xiaomi") && this.f2792a.m3579k()) {
                    new Handler().postDelayed(new C10663(this), 1000);
                }
            }
        }
    }

    /* compiled from: BtTeleUserInterface */
    /* renamed from: com.baidu.carlife.bluetooth.g$b */
    private class C1070b extends C0936j {
        /* renamed from: a */
        final /* synthetic */ C1071g f2794a;

        /* compiled from: BtTeleUserInterface */
        /* renamed from: com.baidu.carlife.bluetooth.g$b$1 */
        class C10691 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1070b f2793a;

            C10691(C1070b this$1) {
                this.f2793a = this$1;
            }

            public void run() {
                if (!C2171b.m8221d()) {
                    C1047b.m3397a().m3420c(C1071g.f2803l);
                } else if (C1071g.f2806o) {
                    C1047b.m3397a().m3420c(-1);
                }
            }
        }

        private C1070b(C1071g c1071g) {
            this.f2794a = c1071g;
        }

        public void careAbout() {
            addMsg(C1253f.fQ);
        }

        public void handleMessage(Message msg) {
            switch (msg.what) {
                case C1253f.fQ /*2024*/:
                    C1260i.m4435b(C1071g.f2795a, "Top process name = " + C2028a.m7780c(C1071g.f2802i));
                    if (C2028a.m7779b(C1071g.f2802i)) {
                        C1260i.m4435b(C1071g.f2795a, "Pull carlife to foreground");
                        postDelayed(new C10691(this), 1000);
                        this.f2794a.f2809j = 0;
                        return;
                    } else if (this.f2794a.f2809j = this.f2794a.f2809j - 1 > 0 || this.f2794a.f2810k) {
                        C1261k.m4453a((int) C1253f.fQ, 200);
                        return;
                    } else {
                        C1260i.m4435b(C1071g.f2795a, "Timeout: Pull carlife to foreground failed,and set carlife to background");
                        C1048c.m3441a(false);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public C1071g() {
        f2800f = new C1068a();
        C1261k.m4460a(this.f2808h);
    }

    /* renamed from: a */
    public static C1071g m3559a() {
        if (f2801g == null) {
            synchronized (C1071g.class) {
                if (f2801g == null) {
                    f2801g = new C1071g();
                }
            }
        }
        return f2801g;
    }

    /* renamed from: a */
    public void m3586a(Context cx) {
        f2802i = cx;
        this.f2809j = 0;
        f2804m = false;
        this.f2810k = false;
        f2807p = false;
        f2803l = -1;
        C1868q.m7089f().m7111a(this.f2811q);
    }

    /* renamed from: b */
    public void m3587b() {
        if (m3579k()) {
            m3580l();
        }
        C1868q.m7089f().m7114b(this.f2811q);
    }

    /* renamed from: c */
    public C1068a m3588c() {
        return f2800f;
    }

    /* renamed from: k */
    private boolean m3579k() {
        return f2807p;
    }

    /* renamed from: b */
    private void m3564b(int whichPage) {
    }

    /* renamed from: l */
    private void m3580l() {
    }

    /* renamed from: m */
    private boolean m3581m() {
        if (Build.MODEL.toLowerCase(Locale.ENGLISH).contains("lg-d857") || Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("xiaomi")) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m3582n() {
        if (VERSION.SDK_INT < 21 && !Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("xiaomi")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m3583o() {
        this.f2809j = 30;
        C1261k.m4461b((int) C1253f.fQ);
    }

    /* renamed from: p */
    private void m3584p() {
        C1261k.m4452a((int) C1253f.fQ);
    }

    /* renamed from: d */
    public void m3589d() {
        if (this.f2812r == null || this.f2812r.getParent() == null) {
            Context context = BaiduNaviApplication.getInstance().getApplicationContext();
            if (this.f2813s == null) {
                this.f2813s = (WindowManager) context.getSystemService("window");
            }
            this.f2812r = m3563b(context);
            this.f2813s.addView(this.f2812r, m3585q());
            C1260i.m4440c(f2795a, "add view");
            return;
        }
        C1260i.m4440c(f2795a, "return cause already shown");
    }

    /* renamed from: q */
    private LayoutParams m3585q() {
        LayoutParams params = new LayoutParams();
        params.type = C1253f.fF;
        params.flags = 132096;
        params.format = -3;
        params.width = -1;
        params.height = -1;
        params.gravity = 17;
        return params;
    }

    /* renamed from: e */
    public void m3590e() {
        if (this.f2812r != null) {
            C1260i.m4440c(f2795a, "hidePopupWindow");
            this.f2813s.removeView(this.f2812r);
            this.f2812r = null;
        }
        C1440d.m5251a().m5255b(null);
    }

    /* renamed from: b */
    private View m3563b(Context context) {
        View view = LayoutInflater.from(context).inflate(C0965R.layout.dialog_phone_incomming, null);
        ((TextView) view.findViewById(C0965R.id.tip_phone_name)).setText(C1868q.m7089f().m7102a());
        ((ImageButton) view.findViewById(C0965R.id.btn_answer)).setOnClickListener(new C10622(this));
        ((ImageButton) view.findViewById(C0965R.id.btn_hangup)).setOnClickListener(new C10633(this));
        m3560a(view);
        return view;
    }

    /* renamed from: a */
    private void m3560a(View view) {
        C1440d focusManager = C1440d.m5251a();
        C1436a focusArea = new C1443g(view, 4);
        focusArea.m5300d(view.findViewById(C0965R.id.btn_answer)).m5300d(view.findViewById(C0965R.id.btn_hangup));
        focusManager.m5255b(focusArea);
    }
}
