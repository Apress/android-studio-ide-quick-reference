package net.workingdev.ch11viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.widget.TextView;

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