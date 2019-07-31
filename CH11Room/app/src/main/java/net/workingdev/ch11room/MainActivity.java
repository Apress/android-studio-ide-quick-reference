package net.workingdev.ch11room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

  private AppDatabase db;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    Button btn = (Button) findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        saveData();
        System.out.println("Clicked");
      }
    });
    db = AppDatabase.getInstance(this);
  }

  private void saveData() {
    final String mlastname = ((TextView) findViewById(R.id.txtlastname)).getText().toString();
    final String mfirstname = ((TextView) findViewById(R.id.txtfirstname)).getText().toString();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("");
        Person person = new Person(mlastname, mfirstname);
        PersonDAO dao = db.getPersonDAO();
        dao.insertPerson(person);
        List<Person> people = dao.listPeople();

        for(Person p:people) {
          System.out.printf("%s , %s\n", p.last_name, p.first_name );
        }
      }
    }).start();
  }
}
