package com.chautnm.onlineshoppingapp.View.TrangChu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chautnm.onlineshoppingapp.R;

/**
 * Created by TOSHIBA on 5/4/2018.
 */

public class FragmentDienTu extends Fragment{

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.layout_dientu,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerDienTu);

        return view;
    }
}
