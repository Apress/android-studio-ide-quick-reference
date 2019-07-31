package net.workingdev.ch11lifecycleaware;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {

  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  public void onCreateEvent() {
    System.out.println("EVENT: onCreate Event fired");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  public void onPauseEvent() {
    System.out.println("EVENT: onPause Event fired");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  public void onResumeEvent() {
    System.out.println("EVENT: onResume Event fired");
  }
}
