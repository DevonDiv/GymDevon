package devondivinecz.com.ShoulderViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.R;

public class ShoulderViewPagerAdapter extends FragmentStateAdapter {
    public ShoulderViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return ShoulderLayoutFragment.newInstance("Dumbbell Lateral Raise", String.valueOf(R.drawable.dumbbell_lateral_raise), "1. Hold a dumbbell in each hand by your waist\n" +
                        "2. Raise the dumbbell up to your shoulders into a T shape\n" +
                        "3. Lower the dumbbells back towards your waist to complete a rep");
            case 1:
                return ShoulderLayoutFragment.newInstance("Incline Lateral Raise", String.valueOf(R.drawable.incline_lateral_raise), "1. Sitting down and leaning back at a 45 degree angle hold a dumbbell in each hand by your waist\n" +
                        "2. Raise the dumbbell up to your shoulders into a T shape\n" +
                        "3. Lower the dumbbells back towards your waist to complete a rep");
            case 2:
                return ShoulderLayoutFragment.newInstance("Rear Kickback", String.valueOf(R.drawable.rear_kickback), "1. In a squat position hold the dumbbells on each side below your waist\n" +
                        "2. Raise the dumbbells up backwards as far as you can\n" +
                        "3. Lower the dumbbells back down to complete a rep");
            case 3:
                return ShoulderLayoutFragment.newInstance("Rainbow Raise", String.valueOf(R.drawable.rainbow_raise), "1. Rest the side of your body on the bench at a 45 degree angle\n" +
                        "2. With the dumbbell starting behind your back raise it up and towards the front of your body in a semi circle motion");
            case 4:
                return ShoulderLayoutFragment.newInstance("Kneeling Dumbbell Press", String.valueOf(R.drawable.kneeling_dumbbell_press), "1. Start on one knee with the dumbbell above your shoulder\n" +
                        "2. Raise the dumbbell up and down to complete the rep");
            default:
                return ShoulderLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
