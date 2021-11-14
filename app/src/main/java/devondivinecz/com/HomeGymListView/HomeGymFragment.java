package devondivinecz.com.HomeGymListView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import devondivinecz.com.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeGymFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeGymFragment extends Fragment {

    ListView equipmentList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeGymFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeGymFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeGymFragment newInstance(String param1, String param2) {
        HomeGymFragment fragment = new HomeGymFragment();
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
        View view = inflater.inflate(R.layout.fragment_home_gym, container, false);

        equipmentList = view.findViewById(R.id.equipment_list);
        ArrayList<HomeGymList> homeGymList = new ArrayList<>();
        homeGymList.add(new HomeGymList("Adjustable Dumbbells"));
        homeGymList.add(new HomeGymList("Adjustable Bench"));
        homeGymList.add(new HomeGymList("Squat Rack"));
        homeGymList.add(new HomeGymList("Barbell"));
        homeGymList.add(new HomeGymList("Curl Bar"));
        homeGymList.add(new HomeGymList("Weighted Plates"));
        homeGymList.add(new HomeGymList("Dip Bar"));
        homeGymList.add(new HomeGymList("Ab Roller"));
        homeGymList.add(new HomeGymList("Treadmill"));
        homeGymList.add(new HomeGymList("Elliptical"));

        equipmentList.setAdapter(new HomeGymListViewAdapter(getContext(), homeGymList));

        return view;
    }
}