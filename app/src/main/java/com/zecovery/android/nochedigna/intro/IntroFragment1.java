package com.zecovery.android.nochedigna.intro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zecovery.android.nochedigna.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment1 extends Fragment {

    public IntroFragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_1, container, false);
    }

}
