package com.sottocorp.materialdesignnavdrawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sottocorp.materialdesignnavdrawer.R;

public class MaestrasFragment extends Fragment {

    public static MaestrasFragment newInstance(Bundle bundle)
    {
        final MaestrasFragment imageFragment = new MaestrasFragment();

        if (bundle != null)
        {
            imageFragment.setArguments(bundle);
        }
        return imageFragment;
    }

    @Override
    public View onCreateView
    (
            LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    )
    {
        // The last two arguments ensure LayoutParams are inflated properly
        final View view = inflater.inflate(R.layout.maestras_fragment, container, false);
        return view;
    }
}
