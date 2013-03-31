package com.joseluishdz.lista;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView lst = (ListView)findViewById(R.id.listView1);
        
        // First example, with one of the default android layouts (just a text inside the item)
        /*String[] valores = new String []{
    		"corvette","lamborgini","SLR MCLaren", "otro valor"	
    	};
    	
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    			android.R.layout.simple_list_item_1, valores);
    			
    	lst.setAdapter(adapter);
    	*/
        
        // Example with a custom layout generated in the listarenglon.xml file
        // Using the ItemAdapter to override the getView method and sending it an arraylist of Item classes
        ArrayList<Item> items = new ArrayList<Item>();
        
        items.add(new Item("hola", "adios"));
        items.add(new Item("uno", "dos"));
        items.add(new Item("bien", "mal"));

    	ItemAdapter adaptador = new ItemAdapter
    			(this, R.layout.listarenglon , items);
    	lst.setAdapter(adaptador);
    	
    	lst.setOnItemClickListener(new OnItemClickListener() {
        	//@Override
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        		Toast toast = Toast.makeText(getBaseContext(), String.valueOf(id), 3);
        		toast.show();
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
