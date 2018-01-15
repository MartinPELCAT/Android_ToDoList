package pelcat.martin.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pelcatm on 15/01/2018.
 */
public class TodoActivity extends Activity implements View.OnClickListener {
    private Button valider;
    private Button vider;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        valider = (Button) findViewById(R.id.valider);
        valider.setOnClickListener(this) ;

        vider = (Button) findViewById(R.id.clearList);
        vider.setOnClickListener(this) ;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.valider)
        {
            EditText edit = (EditText) findViewById(R.id.editText);
            TextView view = (TextView) findViewById(R.id.textView);
            view.setText(edit.getText().toString());
        }
        else{
            TextView view = (TextView) findViewById(R.id.textView);
            view.setText("");
        }


    }
}
