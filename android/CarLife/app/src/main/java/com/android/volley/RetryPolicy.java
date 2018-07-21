package com.android.volley;

public abstract interface RetryPolicy
{
  public abstract int getCurrentRetryCount();
  
  public abstract int getCurrentTimeout();
  
  public abstract void retry(VolleyError paramVolleyError)
    throws VolleyError;
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/android/volley/RetryPolicy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */