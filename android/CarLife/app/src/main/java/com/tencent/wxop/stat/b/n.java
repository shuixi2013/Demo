package com.tencent.wxop.stat.b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

class n
{
  static int a()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new o()).length;
      return i;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 1;
  }
  
  static int b()
  {
    j = 0;
    String str = "";
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" }).start().getInputStream();
      byte[] arrayOfByte = new byte[24];
      while (localInputStream.read(arrayOfByte) != -1) {
        str = str + new String(arrayOfByte);
      }
      localInputStream.close();
      str = str.trim();
      i = j;
      if (str.length() > 0) {
        i = Integer.valueOf(str).intValue();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        m.f().b(localException);
        int i = j;
      }
    }
    return i * 1000;
  }
  
  static int c()
  {
    j = 0;
    String str = "";
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq" }).start().getInputStream();
      byte[] arrayOfByte = new byte[24];
      while (localInputStream.read(arrayOfByte) != -1) {
        str = str + new String(arrayOfByte);
      }
      localInputStream.close();
      str = str.trim();
      i = j;
      if (str.length() > 0) {
        i = Integer.valueOf(str).intValue();
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        m.f().b(localThrowable);
        int i = j;
      }
    }
    return i * 1000;
  }
  
  static String d()
  {
    int i = 2;
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = "";
    arrayOfString1[1] = "";
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
      String[] arrayOfString2 = localBufferedReader.readLine().split("\\s+");
      while (i < arrayOfString2.length)
      {
        arrayOfString1[0] = (arrayOfString1[0] + arrayOfString2[i] + " ");
        i += 1;
      }
      localBufferedReader.close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    return arrayOfString1[0];
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/tencent/wxop/stat/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */