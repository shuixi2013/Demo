package com.baidu.baidunavis.model;

public class NavCarInfo
{
  public static final int CarType_06L = 1;
  public static final int CarType_08L = 2;
  public static final int CarType_09L = 3;
  public static final int CarType_10L = 4;
  public static final int CarType_10T = 5;
  public static final int CarType_11L = 6;
  public static final int CarType_120L = 92;
  public static final int CarType_127L = 93;
  public static final int CarType_12L = 7;
  public static final int CarType_12T = 8;
  public static final int CarType_13L = 9;
  public static final int CarType_13T = 10;
  public static final int CarType_14L = 11;
  public static final int CarType_14T = 12;
  public static final int CarType_15L = 13;
  public static final int CarType_15T = 14;
  public static final int CarType_16L = 15;
  public static final int CarType_16T = 16;
  public static final int CarType_18L = 17;
  public static final int CarType_18T = 18;
  public static final int CarType_19L = 19;
  public static final int CarType_19T = 20;
  public static final int CarType_20L = 21;
  public static final int CarType_20T = 22;
  public static final int CarType_21L = 23;
  public static final int CarType_21T = 24;
  public static final int CarType_22L = 25;
  public static final int CarType_22T = 26;
  public static final int CarType_23L = 27;
  public static final int CarType_23T = 28;
  public static final int CarType_24L = 29;
  public static final int CarType_24T = 30;
  public static final int CarType_25L = 31;
  public static final int CarType_25T = 32;
  public static final int CarType_26L = 33;
  public static final int CarType_27L = 34;
  public static final int CarType_27T = 35;
  public static final int CarType_28L = 36;
  public static final int CarType_28T = 37;
  public static final int CarType_29L = 38;
  public static final int CarType_30L = 39;
  public static final int CarType_30T = 40;
  public static final int CarType_32L = 41;
  public static final int CarType_32T = 42;
  public static final int CarType_33L = 43;
  public static final int CarType_34L = 44;
  public static final int CarType_35L = 45;
  public static final int CarType_35T = 46;
  public static final int CarType_36L = 47;
  public static final int CarType_36T = 48;
  public static final int CarType_37L = 49;
  public static final int CarType_38L = 50;
  public static final int CarType_38T = 51;
  public static final int CarType_39L = 52;
  public static final int CarType_40L = 53;
  public static final int CarType_40T = 54;
  public static final int CarType_42L = 55;
  public static final int CarType_43L = 56;
  public static final int CarType_44L = 57;
  public static final int CarType_44T = 58;
  public static final int CarType_45L = 59;
  public static final int CarType_46L = 60;
  public static final int CarType_47L = 61;
  public static final int CarType_47T = 62;
  public static final int CarType_48L = 63;
  public static final int CarType_48T = 64;
  public static final int CarType_50L = 65;
  public static final int CarType_50T = 66;
  public static final int CarType_52L = 67;
  public static final int CarType_53L = 68;
  public static final int CarType_54L = 69;
  public static final int CarType_55L = 70;
  public static final int CarType_56L = 71;
  public static final int CarType_57L = 72;
  public static final int CarType_58L = 73;
  public static final int CarType_60L = 74;
  public static final int CarType_60T = 75;
  public static final int CarType_62L = 76;
  public static final int CarType_62T = 77;
  public static final int CarType_63L = 78;
  public static final int CarType_64L = 79;
  public static final int CarType_65L = 80;
  public static final int CarType_65T = 81;
  public static final int CarType_66L = 82;
  public static final int CarType_67L = 83;
  public static final int CarType_68L = 84;
  public static final int CarType_71T = 85;
  public static final int CarType_73L = 86;
  public static final int CarType_78L = 87;
  public static final int CarType_78T = 88;
  public static final int CarType_80T = 89;
  public static final int CarType_97L = 90;
  public static final int CarType_98T = 91;
  public static final int CarType_Cnt = 94;
  public static final int CarType_Default = 0;
  public String carPANumber = null;
  public int carType = 0;
  
  public NavCarInfo(String paramString)
  {
    this.carPANumber = paramString;
  }
  
  public NavCarInfo(String paramString, int paramInt)
  {
    this.carPANumber = paramString;
    this.carType = paramInt;
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/baidunavis/model/NavCarInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */