package com.baidu.carlife.core.screen.video;

import com.baidu.carlife.core.LogUtil;

/* compiled from: ReceiverAndConverterThreadInternal */
/* renamed from: com.baidu.carlife.core.screen.video.d */
public class ReceiverAndConverterThreadInternal extends BaseReceiverAndConverterThread {
    /* renamed from: h */
    private static final String f3850h = "Recorder";
    /* renamed from: i */
    private static final String f3851i = "--QA-TEST--";
    /* renamed from: j */
    private static byte[] f3852j;
    /* renamed from: k */
    private static Recorder f3853k = Recorder.newInstance();
    /* renamed from: l */
    private long f3854l = ((long) Recorder.f3864e);
    /* renamed from: m */
    private long f3855m = 0;

    public ReceiverAndConverterThreadInternal() {
        f3831d = f3853k.f3906g;
        sByteBuffer = f3853k.f3907h;
        sBitmap = f3853k.f3905f;
    }

    /* renamed from: a */
    public void mo1523a() {
        this.f3835a = false;
        f3853k.m4891v();
    }

    /* renamed from: a */
    public void mo1524a(int newRate) {
        this.f3854l = (long) (1000 / newRate);
    }

    /* renamed from: c */
    private void m4807c() {
        LogUtil.d(f3850h, "ReceiverAndConverterThreadInternal  stopThreadInner");
        this.f3835a = false;
        f3853k.m4891v();
        f3853k.m4836C();
    }

    public void run() {
        try {
            if (f3853k.m4879j() || f3853k.m4840G()) {
                this.f3854l = (long) Recorder.f3864e;
                try {
                    f3853k.m4874g(true);
                    LogUtil.d(f3850h, "ReceiverAndConverterThreadInternal isRunning=" + this.f3835a);
                    int mColorFormat = f3853k.m4886q();
                    LogUtil.d(f3850h, "isJPEGMode=" + f3853k.m4879j() + ", mColorFormat=" + mColorFormat);
                    if (!f3853k.m4879j()) {
                        if (mColorFormat == 15 || mColorFormat == 16) {
                            if (f3853k.m4837D() || VideoOutputThread.m4915b()) {
                                f3853k.m4876h(false);
                            } else {
                                m4806a(false);
                                VideoOutputThread.m4912a(f3831d);
                            }
                            f3853k.m4834A();
                            while (this.f3835a) {
                                m4809e();
                            }
                            LogUtil.d(f3850h, "ReceiverAndConverterThreadInternal  run finished.");
                            m4807c();
                        }
                        if ((f3853k.m4837D() && f3852j == null) || VideoOutputThread.m4915b()) {
                            if (mColorFormat == 6 || mColorFormat == 7) {
                                f3852j = new byte[((Recorder.f3861b * Recorder.f3862c) * 2)];
                            } else {
                                f3852j = new byte[(((Recorder.f3861b * Recorder.f3862c) * 3) / 2)];
                            }
                            f3853k.m4876h(false);
                            LogUtil.m4440c(f3850h, "run mColorFormat == 6 || mColorFormat == 7");
                        } else {
                            m4806a(true);
                            VideoOutputThread.m4912a(f3852j);
                            LogUtil.m4440c(f3850h, "VideoOutputThread.firstSendEncodeFrame(mDestFormatBuf);");
                        }
                        f3853k.m4834A();
                        while (this.f3835a) {
                            LogUtil.m4440c(f3850h, "enter  readAndConvert, isRunning=" + this.f3835a);
                            m4808d();
                        }
                        LogUtil.d(f3850h, "ReceiverAndConverterThreadInternal  run finished.");
                        m4807c();
                    }
                } catch (NullPointerException e) {
                    LogUtil.m4440c(f3850h, "Output Thread closeLocalSocket lead to");
                }
            } else {
                m4807c();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m4808d() {
        if (f3853k.m4870e()) {
            if (f3853k.m4846M() == -1) {
                m4807c();
            }
            try {
                Thread.sleep(50);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        m4810f();
        JniMethod.convert(f3831d, f3852j, Recorder.f3861b, Recorder.f3862c);
        int flag = f3853k.m4852a(f3852j);
        if (flag == -2 && !f3853k.m4843J()) {
            m4807c();
        }
        LogUtil.m4440c(f3850h, "input2Encoder success flag= " + flag);
    }

    /* renamed from: e */
    private void m4809e() {
        if (f3853k.m4870e()) {
            if (f3853k.m4846M() == -1) {
                m4807c();
            }
            try {
                Thread.sleep(50);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        long startTime = System.currentTimeMillis();
        m4810f();
        LogUtil.m4440c(f3851i, "JAVA got frame time = " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        if (f3853k.m4852a(f3831d) == -2 && !f3853k.m4843J()) {
            m4807c();
        }
        LogUtil.m4440c(f3851i, "JAVA encode time = " + (System.currentTimeMillis() - startTime));
    }

    /* renamed from: a */
    private void m4806a(boolean needConvert) {
        m4810f();
        if (needConvert) {
            JniMethod.convert(f3831d, f3852j, Recorder.f3861b, Recorder.f3862c);
        }
    }

    /* renamed from: f */
    private void m4810f() {
        long startTime = System.currentTimeMillis();
        if (startTime - this.f3855m < this.f3854l) {
            try {
                Thread.sleep((this.f3854l - startTime) + this.f3855m);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.f3855m = System.currentTimeMillis();
        synchronized (sBitmap) {
            sByteBuffer.clear();
            sBitmap.copyPixelsToBuffer(sByteBuffer);
        }
    }
}
