package devondivinecz.com.BackViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import devondivinecz.com.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BackLayoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BackLayoutFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    public BackLayoutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BackLayoutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BackLayoutFragment newInstance(String param1, String param2, String param3) {
        BackLayoutFragment fragment = new BackLayoutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_back_layout, container, false);

        if(mParam1 != null) {
            TextView titleView = view.findViewById(R.id.back_title);
            titleView.setText(mParam1);
        }

        if(mParam2 != null) {
            ImageView imageView = view.findViewById(R.id.back_image);
            imageView.setImageResource(Integer.parseInt(mParam2));
        }

        if(mParam3 != null) {
            TextView instructionView = view.findViewById(R.id.back_instructions);
            instructionView.setText(mParam3);
        }

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        boolean textSize = sharedPreferences.getBoolean("large_text", false);



        if(textSize = sharedPreferences.getBoolean("large_text", false)) {
            TextView title = view.findViewById(R.id.back_title);
            TextView instructions = view.findViewById(R.id.back_instructions);
            title.setTextSize(40);
            instructions.setTextSize(18);
        }

        return view;
    }
}