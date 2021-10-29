package devondivinecz.com.PlansRecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import devondivinecz.com.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlansFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlansFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PlansFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PlansFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlansFragment newInstance(String param1, String param2) {
        PlansFragment fragment = new PlansFragment();
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
        View view = inflater.inflate(R.layout.fragment_plans, container, false);

        ArrayList<Workout> workouts = new ArrayList<>();
        workouts.add(new Workout("Arm Workout Plan", "Workout One\tReps:10\tSets:3",
                "Workout Two\tReps:10\tSets:3",
                "Workout Three\tReps:10\tSets:3",
                "Workout Four\tReps:10\tSets:3",
                "Workout Five\tReps:10\tSets:3",
                "Workout Six\tReps:10\tSets:3",
                "Workout Seven\tReps:10\tSets:3",
                "Workout Eight\tReps:10\tSets:3",
                "Workout Nine\tReps:10\tSets:3",
                "Workout Ten\tReps:10\tSets:3"));
        workouts.add(new Workout("Trapezius Workout Plan", "Workout One\tReps:10\tSets:3",
                "Workout Two\tReps:10\tSets:3",
                "Workout Three\tReps:10\tSets:3",
                "Workout Four\tReps:10\tSets:3",
                "Workout Five\tReps:10\tSets:3",
                "Workout Six\tReps:10\tSets:3",
                "Workout Seven\tReps:10\tSets:3",
                "Workout Eight\tReps:10\tSets:3",
                "Workout Nine\tReps:10\tSets:3",
                "Workout Ten\tReps:10\tSets:3"));
        workouts.add(new Workout("Leg Workout Plan", "Workout One\tReps:10\tSets:3",
                "Workout Two\tReps:10\tSets:3",
                "Workout Three\tReps:10\tSets:3",
                "Workout Four\tReps:10\tSets:3",
                "Workout Five\tReps:10\tSets:3",
                "Workout Six\tReps:10\tSets:3",
                "Workout Seven\tReps:10\tSets:3",
                "Workout Eight\tReps:10\tSets:3",
                "Workout Nine\tReps:10\tSets:3",
                "Workout Ten\tReps:10\tSets:3"));
        workouts.add(new Workout("Cardio Workout Plan", "Workout One\tReps:10\tSets:3",
                "Workout Two\tReps:10\tSets:3",
                "Workout Three\tReps:10\tSets:3",
                "Workout Four\tReps:10\tSets:3",
                "Workout Five\tReps:10\tSets:3",
                "Workout Six\tReps:10\tSets:3",
                "Workout Seven\tReps:10\tSets:3",
                "Workout Eight\tReps:10\tSets:3",
                "Workout Nine\tReps:10\tSets:3",
                "Workout Ten\tReps:10\tSets:3"));

        RecyclerView recyclerView = view.findViewById(R.id.plansRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new WorkoutRecyclerViewAdapter(workouts));

        return view;
    }
}