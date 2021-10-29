package devondivinecz.com.PlansRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import devondivinecz.com.R;

public class WorkoutRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private ArrayList<Workout> workouts;

    public WorkoutRecyclerViewAdapter(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plans_recycler_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Workout workout = workouts.get(position);
        holder.title.setText(workout.getTitle());
        holder.workout1.setText(workout.getWorkout1());
        holder.workout2.setText(workout.getWorkout2());
        holder.workout3.setText(workout.getWorkout3());
        holder.workout4.setText(workout.getWorkout4());
        holder.workout5.setText(workout.getWorkout5());
        holder.workout6.setText(workout.getWorkout6());
        holder.workout7.setText(workout.getWorkout7());
        holder.workout8.setText(workout.getWorkout8());
        holder.workout9.setText(workout.getWorkout9());
        holder.workout10.setText(workout.getWorkout10());
    }

    @Override
    public int getItemCount() {
        if(workouts != null) {
            return  workouts.size();
        }

        return 0;
    }
}

class CustomViewHolder extends RecyclerView.ViewHolder {
    protected TextView title;
    protected TextView workout1;
    protected TextView workout2;
    protected TextView workout3;
    protected TextView workout4;
    protected TextView workout5;
    protected TextView workout6;
    protected TextView workout7;
    protected TextView workout8;
    protected TextView workout9;
    protected TextView workout10;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.plansTitle);
        this.workout1 = itemView.findViewById(R.id.workout1);
        this.workout2 = itemView.findViewById(R.id.workout2);
        this.workout3 = itemView.findViewById(R.id.workout3);
        this.workout4 = itemView.findViewById(R.id.workout4);
        this.workout5 = itemView.findViewById(R.id.workout5);
        this.workout6 = itemView.findViewById(R.id.workout6);
        this.workout7 = itemView.findViewById(R.id.workout7);
        this.workout8 = itemView.findViewById(R.id.workout8);
        this.workout9 = itemView.findViewById(R.id.workout9);
        this.workout10 = itemView.findViewById(R.id.workout10);
    }
}


