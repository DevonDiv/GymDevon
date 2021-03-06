package devondivinecz.com.CreditListView;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import devondivinecz.com.HomeGymListView.HomeGymList;
import devondivinecz.com.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreditFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreditFragment extends Fragment {

    ListView creditsList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CreditFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreditFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreditFragment newInstance(String param1, String param2) {
        CreditFragment fragment = new CreditFragment();
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
        View view = inflater.inflate(R.layout.fragment_credit, container, false);

        creditsList = view.findViewById(R.id.credit_list);
        ArrayList<CreditList> creditList = new ArrayList<>();
        creditList.add(new CreditList("Connor Blackwell: Workouts & Images"));
        creditList.add(new CreditList("Devon Divinecz: Workouts"));
        creditList.add(new CreditList("Android Studio Help: https://developer.android.com/studio"));
        creditList.add(new CreditList("Translation: https://www.deepl.com/en/translator"));

        creditsList.setAdapter(new CreditListViewAdapter(getContext(), creditList));

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        boolean textSize = sharedPreferences.getBoolean("large_text", false);

        if(textSize = sharedPreferences.getBoolean("large_text", false)) {
            TextView title = view.findViewById(R.id.creditTitle);

            title.setTextSize(40);
        }


        return view;
    }
}