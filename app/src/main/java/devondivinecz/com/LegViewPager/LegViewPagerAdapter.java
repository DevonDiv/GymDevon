package devondivinecz.com.LegViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.R;

public class LegViewPagerAdapter extends FragmentStateAdapter {
    public LegViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return LegLayoutFragment.newInstance("Squats", String.valueOf(R.drawable.squats), "1. Add weighted plates to the barbell\n" +
                        "2. Hold the barbell with your hands on top of your shoulder\n" +
                        "3. While holding the barbell lower your body while bending your knees\n" +
                        "4. Rise back up to a standing position to complete the rep");
            case 1:
                return LegLayoutFragment.newInstance("Calf Extension", String.valueOf(R.drawable.calf_extension), "1. Add weighted plates to the barbell\n" +
                        "2. Hold the barbell with your hands on top of your shoulder\n" +
                        "3. Rise up and down on your toes to complete each rep");
            case 2:
                return LegLayoutFragment.newInstance("Jumping Squat", String.valueOf(R.drawable.jumping_squat), "1. Start in a squat position\n" +
                        "2. Jump up as high as you can from the starting position and land back in position");
            case 3:
                return LegLayoutFragment.newInstance("Walking Weighted Lunges", String.valueOf(R.drawable.walking_weighted_lunges), "1. Start with a dumbbell in each hand by your waist\n" +
                        "2. Lunge forward while holding the weights to complete each rep");
            case 4:
                return LegLayoutFragment.newInstance("Bulgarian Squat", String.valueOf(R.drawable.bulgarian_squat), "1. Start with a dumbbell in each hand by your wast\n" +
                        "2. Bend your knee and rest your foot behind you on a bench\n" +
                        "3. Squat on one leg to complete a rep");
            default:
                return LegLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
