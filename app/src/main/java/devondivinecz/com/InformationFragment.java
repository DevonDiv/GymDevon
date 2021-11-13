package devondivinecz.com;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InformationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InformationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InformationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InformationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InformationFragment newInstance(String param1, String param2) {
        InformationFragment fragment = new InformationFragment();
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
        View view = inflater.inflate(R.layout.fragment_information, container, false);

        Button locationButton = view.findViewById(R.id.location_button);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo:42.2818368,-82.8766737?z=20");
                Intent intent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(intent);
            }
        });

        Button websiteButton = view.findViewById(R.id.website_button);

        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")); //Add Link - Create Bullshit site using scweb server?
                startActivity(intent);
            }
        });

        Button phoneButton = view.findViewById(R.id.phone_button);

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:2263457080"));
                startActivity(intent);
            }
        });

        Button homeGymButton = view.findViewById(R.id.start_home_gym_button);

        homeGymButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_info_to_home_gym);
            }
        });

        return view;
    }
}