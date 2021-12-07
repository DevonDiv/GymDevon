package devondivinecz.com;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.provider.AlarmClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestFragment newInstance(String param1, String param2) {
        RestFragment fragment = new RestFragment();
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
        View view = inflater.inflate(R.layout.fragment_rest, container, false);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        boolean textSize = sharedPreferences.getBoolean("large_text", false);

        Button thirtySecondButton = view.findViewById(R.id.thirtySecondButton);

        thirtySecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER).putExtra(AlarmClock.EXTRA_LENGTH, 30);
                startActivity(intent);
            }
        });

        Button fortyFiveSecondButton = view.findViewById(R.id.fortyFiveSecondButton);

        fortyFiveSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER).putExtra(AlarmClock.EXTRA_LENGTH, 45);
                startActivity(intent);
            }
        });

        Button minuteButton = view.findViewById(R.id.minuteButton);

        minuteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER).putExtra(AlarmClock.EXTRA_LENGTH, 60);
                startActivity(intent);
            }
        });

        if(textSize = sharedPreferences.getBoolean("large_text", false)) {
            TextView title = view.findViewById(R.id.rest_title);
            Button button = view.findViewById(R.id.thirtySecondButton);
            Button button1 = view.findViewById(R.id.fortyFiveSecondButton);
            Button button2 = view.findViewById(R.id.minuteButton);
            title.setTextSize(40);
            button.setTextSize(18);
            button1.setTextSize(18);
            button2.setTextSize(18);
        }

        return view;
    }
}