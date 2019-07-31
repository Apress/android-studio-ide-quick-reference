package net.workingdev.ch11randomnumber;

import android.util.Log;
import java.util.Random;

import androidx.lifecycle.ViewModel;

public class RandomNumber extends ViewModel {

  private String TAG = getClass().getSimpleName();

  int mrandomnumber;
  boolean minitialized = false;

  String getNumber() {
    if(!minitialized) {
      createRandomNumber();
    }
    Log.i(TAG, "RETURN Random number");
    return mrandomnumber + "";
  }

   void createRandomNumber() {
    Log.i(TAG, "CREATE NEW Random number");
    Random random = new Random();
    mrandomnumber = random.nextInt(100);
  }
}
