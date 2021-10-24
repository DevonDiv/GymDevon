package devondivinecz.com.BicepViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import devondivinecz.com.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BicepLayoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BicepLayoutFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BicepLayoutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BicepLayoutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BicepLayoutFragment newInstance(String param1, String param2) {
        BicepLayoutFragment fragment = new BicepLayoutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bicep_layout, container, false);

        if(mParam1 != null) {
            TextView titleView = view.findViewById(R.id.bicep_title);
            titleView.setText(mParam1);
        }

        if(mParam2 != null) {
            ImageView imageView = view.findViewById(R.id.bicep_image);
            imageView.setImageResource(Integer.parseInt(mParam2));
        }

        return view;
    }
}