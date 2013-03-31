package com.joseluishdz.lista;

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<Item>{
		//class that extends ArrayAdapter of the JavaBean
	 	private ArrayList<Item> items;
	    Activity context;
	    //Constructor, receives the context, the layout and the values to populate the list
	    public ItemAdapter(Activity context, int textViewResourceId, ArrayList<Item> items) {
	            super(context, textViewResourceId, items);
	            this.items = items;
	            this.context = context;
	    }
	    
	    //method getView override, this is called for each item on the list of values
	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	            View item = convertView;
	            if (item == null) {
	            	//Object LayoutInflater, we use it for get access to the UI thread and build our list
	                LayoutInflater vi = context.getLayoutInflater();
	                item = vi.inflate(R.layout.listarenglon, null);
	            }
	            //her we fill the elements on the layout with the values on the list of values
	            Item o = items.get(position);
	            if (o != null) {
	                    TextView txt1 = (TextView) item.findViewById(R.id.texto1);
	                    if (txt1 != null) {
	                    	txt1.setText(o.getTexto1());}
	                    TextView txt2 = (TextView) item.findViewById(R.id.texto2);
	                    if (txt2 != null) {
	                    	txt2.setText(o.getTexto2());}
	            }
	            return item;
	    }
}
