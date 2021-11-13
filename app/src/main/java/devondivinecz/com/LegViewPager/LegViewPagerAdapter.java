package devondivinecz.com.LegViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

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
                return LegLayoutFragment.newInstance("Squats", null, "1. Add weighted plates to the barbell\n" +
                        "2. Hold the barbell with your hands on top of your shoulder\n" +
                        "3. While holding the barbell lower your body while bending your knees\n" +
                        "4. Rise back up to a standing position to complete the rep");
            case 1:
                return LegLayoutFragment.newInstance("Calf Extension", null, "1. Add weighted plates to the barbell\n" +
                        "2. Hold the barbell with your hands on top of your shoulder\n" +
                        "3. Rise up and down on your toes to complete each rep");
            case 2:
                return LegLayoutFragment.newInstance("Leg Press", null, "1. While seated on the machine put your legs against the platform\n" +
                        "2. Push your legs to a full extension\n" +
                        "3. Bring your legs back towards your chest to complete the rep");
            case 3:
                return LegLayoutFragment.newInstance("Walking Weighted Lunges", null, "1. Start with a dumbbell in each hand by your waist\n" +
                        "2. Lunge forward while holding the weights to complete each rep");
            case 4:
                return LegLayoutFragment.newInstance("Bulgarian Squat", null, "1. Start with a dumbbell in each hand by your wast\n" +
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
