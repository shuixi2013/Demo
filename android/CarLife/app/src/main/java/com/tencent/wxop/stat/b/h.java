package com.tencent.wxop.stat.b;

import android.util.Base64;

public class h
{
  static byte[] a()
  {
    return Base64.decode("MDNhOTc2NTExZTJjYmUzYTdmMjY4MDhmYjdhZjNjMDU=", 0);
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, a());
  }
  
  static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int m = 0;
    int[] arrayOfInt1 = new int['Ā'];
    int[] arrayOfInt2 = new int['Ā'];
    int j = paramArrayOfByte2.length;
    if ((j <= 0) || (j > 256)) {
      throw new IllegalArgumentException("key must be between 1 and 256 bytes");
    }
    int i = 0;
    while (i < 256)
    {
      arrayOfInt1[i] = i;
      arrayOfInt2[i] = paramArrayOfByte2[(i % j)];
      i += 1;
    }
    j = 0;
    i = 0;
    while (i < 256)
    {
      j = j + arrayOfInt1[i] + arrayOfInt2[i] & 0xFF;
      k = arrayOfInt1[i];
      arrayOfInt1[i] = arrayOfInt1[j];
      arrayOfInt1[j] = k;
      i += 1;
    }
    paramArrayOfByte2 = new byte[paramArrayOfByte1.length];
    int k = 0;
    j = 0;
    i = m;
    while (i < paramArrayOfByte1.length)
    {
      k = k + 1 & 0xFF;
      j = j + arrayOfInt1[k] & 0xFF;
      m = arrayOfInt1[k];
      arrayOfInt1[k] = arrayOfInt1[j];
      arrayOfInt1[j] = m;
      paramArrayOfByte2[i] = ((byte)(arrayOfInt1[(arrayOfInt1[k] + arrayOfInt1[j] & 0xFF)] ^ paramArrayOfByte1[i]));
      i += 1;
    }
    return paramArrayOfByte2;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, a());
  }
  
  static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return a(paramArrayOfByte1, paramArrayOfByte2);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/tencent/wxop/stat/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */