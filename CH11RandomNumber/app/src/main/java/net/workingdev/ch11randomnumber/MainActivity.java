package net.workingdev.ch11randomnumber;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //RandomNumber data = new RandomNumber();
    RandomNumber data;
    data = ViewModelProviders.of(this).get(RandomNumber.class);

    ((TextView) findViewById(R.id.txtrandom)).setText(data.getNumber());
  }
}
