package net.workingdev.ch11livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //RandomNumber data = new RandomNumber();
    final RNModel data;
    data = ViewModelProviders.of(this).get(RNModel.class);

    final TextView txtnumber = (TextView) findViewById(R.id.txtrandom);
    MutableLiveData<String> mnumber = data.getNumber();
    
    mnumber.observe(this, new Observer<String>() {
      @Override
      public void onChanged(String val) {
        txtnumber.setText(val);
      }
    });

    Button btn = (Button) findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        data.createRandomNumber();
        data.getNumber();
      }
    });

  }
}
