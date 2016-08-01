package com.example.tanmayjha.recyclerviewapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResailFragment extends Fragment {
    Button sellButton;

    public ResailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentResail = inflater.inflate(R.layout.fragment_resail, container, false);
        RecyclerView resailViewRecycler = (RecyclerView) fragmentResail.findViewById(R.id.recycler_view);
        String names[] = new String[ResailDatabase.resailDatabases.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = ResailDatabase.resailDatabases[i].getName();
        }

        String rooms[] = new String[ResailDatabase.resailDatabases.length];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = ResailDatabase.resailDatabases[i].getRoom();
        }

        String products[] = new String[ResailDatabase.resailDatabases.length];
        for (int i = 0; i < products.length; i++) {
            products[i] = ResailDatabase.resailDatabases[i].getProduct();
        }

        String phoneno[] = new String[ResailDatabase.resailDatabases.length];
        for (int i = 0; i < phoneno.length; i++) {
            phoneno[i] = ResailDatabase.resailDatabases[i].getPhoneno();
        }

        String costs[] = new String[ResailDatabase.resailDatabases.length];
        for (int i = 0; i < costs.length; i++) {
            costs[i] = ResailDatabase.resailDatabases[i].getCost();
        }
        ResailAdapter adapter = new ResailAdapter(names, rooms, products, phoneno, costs);
        resailViewRecycler.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        resailViewRecycler.setLayoutManager(linearLayoutManager);
        return fragmentResail;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        View view=getView();
        sellButton=(Button)view.findViewById(R.id.sell_button);
        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),InputActivity.class);
                startActivity(i);
            }
        });
    }

}
