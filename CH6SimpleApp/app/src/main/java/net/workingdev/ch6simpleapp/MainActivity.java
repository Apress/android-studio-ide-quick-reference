package net.workingdev.ch6simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView txtview;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    txtview = (TextView) findViewById(R.id.textView);
  }

  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.btnhello:
        txtview.setText("hello");
        break;
      case R.id.btnworld:
        txtview.setText("world");
        break;
    }
  }
}
