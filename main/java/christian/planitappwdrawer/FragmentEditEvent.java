package christian.planitappwdrawer;

import android.view.View;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import christian.planitappwdrawer.R;

public class FragmentEditEvent extends Fragment {
    private static final String TAG = "EditEvent";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_event_edit, container, false);

        return view;
    }

    public interface OnFragmentInteractionListener {
    }
}