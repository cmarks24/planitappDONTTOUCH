package christian.planitappwdrawer;


import android.view.View;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import christian.planitappwdrawer.R;

public class FragmentGroupPage extends Fragment {
    private static final String TAG = "GroupsPage";

    private Button btnNavGrpSch;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_group_page, container, false);
        btnNavGrpSch = (Button) view.findViewById(R.id.btnNavGrpSch);



        return view;
    }




    public interface OnFragmentInteractionListener {
    }
}