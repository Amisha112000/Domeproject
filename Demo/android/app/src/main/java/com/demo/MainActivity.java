package com.demo;

import com.facebook.react.ReactActivity;
// //////////////////////////
import android.os.Bundle;
import android.os.Build;
// //////////////////////////
public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "Demo";
  }
  // ...

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // /////////////////////////
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
      setShowWhenLocked(true);
    }
    // /////////////////////////
  }
}
