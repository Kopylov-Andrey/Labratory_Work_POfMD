package com.andrey.labratory_work_5_pofmd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener{


    private View highlitedView;
    private ArrayAdapter<String> arad;
    private ListView listView;
    private EditText editText;
    private Button butEdit, butDel;
    int selectedItemIndex = -1;


    public void onAdd(View view){
        butEdit.setEnabled(true);
        butDel.setEnabled(true);
        String string;
        string = editText.getText().toString();
        arad.add(string);
    }

    public void onEdit(View view){
        if(selectedItemIndex == -1)
            return;
        String s = arad.getItem(selectedItemIndex);
        arad.remove(s);
        arad.insert(editText.getText().toString(), selectedItemIndex);

    }

    public void onDel(View view){
        if(selectedItemIndex == -1)
            return;
        String s1 = arad.getItem( selectedItemIndex);
        arad.remove(s1);
        selectedItemIndex =-1;
    }

    public void onClear(View view){
        butEdit.setEnabled(false);
        butDel.setEnabled(false);
        arad.clear();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDel = (Button) findViewById(R.id.bd);
        butEdit = (Button) findViewById(R.id.be);
        editText = (EditText) findViewById(R.id.edtext);
        arad= new ArrayAdapter<String>(this,R.layout.le);
        listView=(ListView)findViewById(R.id.lw);
        listView.setAdapter(arad);
        arad.add("first");
        arad.add("second");
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s = arad.getItem(position);
        selectedItemIndex = position;
        editText.setText(s);
        if(highlitedView!=null)
        {
            highlitedView.setBackgroundColor(ContextCompat.getColor(this,R.color.pink));
        }
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.pink2));
        highlitedView = view;
    }
}