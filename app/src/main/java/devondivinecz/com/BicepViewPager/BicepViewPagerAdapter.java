package devondivinecz.com.BicepViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.R;

public class BicepViewPagerAdapter extends FragmentStateAdapter {
    public BicepViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return BicepLayoutFragment.newInstance("Dumbbell Curls", String.valueOf(R.drawable.dumbbell_curls), "1. Hold the dumbbells by your waist\n" +
                        "2. Curl the dumbbells up towards your chest\n" +
                        "3. Lower the dumbbells back to your waist to complete the rep");
            case 1:
                return BicepLayoutFragment.newInstance("Waiters Curls", String.valueOf(R.drawable.waiters_curl), "1. Start in a squat position while holding a dumbbell with both hands at the top\n" +
                        "2. Hold the dumbbell to your chin\n" +
                        "3. Lower the dumbbell to your waist\n" +
                        "4. Raise the dumbbell back up to your chin");
            case 2:
                return BicepLayoutFragment.newInstance("Concentration Curls", String.valueOf(R.drawable.concentration_curls), "1. With one dumbbell in hand sit on the bench\n" +
                        "2. Rest your elbow above your kneecap with your arm extended\n" +
                        "3. Curl the dumbbell towards your chin\n" +
                        "4. Low the dumbbell back down\n" +
                        "5. Switch arms after your rep");
            case 3:
                return BicepLayoutFragment.newInstance("Incline Dumbbell Curls", String.valueOf(R.drawable.incline_dumbbell_curls), "1. Sit on the bench at a 45 degree angle with both dumbbells facing outward\n" +
                        "2. Curl the dumbbells up towards your chest\n" +
                        "3. Lower the dumbbells back down to complete the rep");
            case 4:
                return BicepLayoutFragment.newInstance("Seated Hammer Curl", String.valueOf(R.drawable.seated_hammer_curls), "1. Sit on the bench at a 45 degree angle with both dumbbells facing up\n" +
                        "2. Curl the dumbbells up towards your chest\n" +
                        "3. Lower the dumbbells back down to complete the rep");
            default:
                return BicepLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
