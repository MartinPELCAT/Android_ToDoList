package pelcat.martin.mytodolist;

import android.app.Activity;
import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by pelcatm on 15/01/2018.
 */
public class TodoActivity extends Activity implements View.OnClickListener {
    private Button valider;
    private Button vider;
    private ArrayList<String> listItems= new ArrayList();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        valider = (Button) findViewById(R.id.valider);
        valider.setOnClickListener(this) ;
        ListView view = (ListView) findViewById(R.id.listeview);
        view.setAdapter(new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,listItems));

        vider = (Button) findViewById(R.id.clearList);
        vider.setOnClickListener(this) ;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.valider)
        {
            EditText edit = (EditText) findViewById(R.id.editText);
            ListView view = (ListView) findViewById(R.id.listeview);
            listItems.add(edit.getText().toString());
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                    android.R.layout.simple_list_item_1, listItems);
            view.setAdapter(adapter);

        }
        else{
            ListView view = (ListView) findViewById(R.id.listeview);
        }


    }
}
