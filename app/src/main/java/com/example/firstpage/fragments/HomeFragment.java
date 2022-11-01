package com.example.firstpage.fragments;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.firstpage.R;
import com.example.firstpage.activities.New_Screen;
import com.example.firstpage.adapters.AdapterHome;

public class HomeFragment extends Fragment {
    GridView gridView;


    int[] images =
            {R.drawable.nature1,
                    R.drawable.nature2,
                    R.drawable.nature3,
                    R.drawable.nature4,
                    R.drawable.nature2,
                    R.drawable.nature1,
                    R.drawable.nature4
            };



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = view.findViewById(R.id.Grid_view);
        gridView.setAdapter(new AdapterHome(images, getContext()));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view1, int index, long l) {
                Intent intent = new Intent(getContext(), New_Screen.class);

                intent.putExtra("", images[index]);
                startActivity(intent);

            }
        });
        return view;

    }


}
