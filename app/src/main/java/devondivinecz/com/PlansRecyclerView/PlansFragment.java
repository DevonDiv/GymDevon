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
        workouts.add(new Workout("Arm Workout Plan", "Dumbbell Curls\tReps:10\tSets:3",
                "Waiters Curls\tReps:10\tSets:3",
                "Concentration Curls\tReps:10\tSets:4",
                "Incline Dumbbell Curls\tReps:10\tSets:3",
                "Seated Hammer Curls\tReps:10\tSets:3",
                "Close-Grip Bench Press\tReps:10\tSets:3",
                "Cable Rope Triceps Pushdown\tReps:10\tSets:3",
                "Lying Triceps Extension\tReps:10\tSets:3",
                "Tricep Dips\tReps:10\tSets:3",
                "One Arm Overhead Extension\tReps:10\tSets:3"));

        workouts.add(new Workout("Trapezius Workout Plan", "Dumbbell Lateral Raise\tReps:10\tSets:3",
                "Incline Lateral Raise\tReps:10\tSets:3",
                "Rear Kickback\tReps:10\tSets:3",
                "Rainbow Raise\tReps:10\tSets:3",
                "Kneeling Dumbbell Press\tReps:10\tSets:3",
                "Dumbbell Shrugs\tReps:10\tSets:3",
                "Single Arm Shrugs\tReps:10\tSets:3",
                "Lower Trap Raise\tReps:10\tSets:3",
                "Dumbbell Snatch\tReps:10\tSets:3",
                "Incline Dumbbell Shrug\tReps:10\tSets:3"));

        workouts.add(new Workout("Leg Workout Plan", "Squats\tReps:10\tSets:3",
                "Calf Extension\tReps:10\tSets:3",
                "Leg Press\tReps:10\tSets:3",
                "Walking Weighted Lunges\tReps:10\tSets:3",
                "Bulgarian Squat\tReps:10\tSets:3",
                "Leg Curls\tReps:10\tSets:3",
                "Leg Extension\tReps:10\tSets:3",
                null,
                null,
                null));

        workouts.add(new Workout("Cardio Workout Plan", "Stair Climber 15 Minutes",
                "Stationary Bike 15 Minutes",
                "Treadmill Jog 5 Minutes",
                "Treadmill Sprint 1 Minute",
                "Treadmill Jog 5 Minutes",
                "Treadmill Sprint 1 Minute",
                "Treadmill Jog 5 Minutes",
                "Treadmill Sprint 1 Minute",
                "Treadmill Cooldown Jog 2 Minutes",
                null));

        RecyclerView recyclerView = view.findViewById(R.id.plansRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new WorkoutRecyclerViewAdapter(workouts));

        return view;
    }
}