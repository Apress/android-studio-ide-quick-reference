package net.workingdev.ch11livedata;

import android.util.Log;
import java.util.Random;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RNModel extends ViewModel {
  private String TAG = getClass().getSimpleName();

  MutableLiveData<String> mrandomnumber = new MutableLiveData<>();
  boolean minitialized = false;

  MutableLiveData<String> getNumber() {
    if(!minitialized) {
      createRandomNumber();
    }
    Log.i(TAG, "RETURN Random number");
    return mrandomnumber;
  }

  void createRandomNumber() {
    Log.i(TAG, "CREATE NEW Random number");
    Random random = new Random();

    mrandomnumber.setValue(random.nextInt(100) + "");
    minitialized = true;
  }
}
