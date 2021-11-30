package devondivinecz.com.TricepViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.ForearmViewPager.ForearmLayoutFragment;
import devondivinecz.com.R;

public class TricepViewPagerAdapter extends FragmentStateAdapter {
    public TricepViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return TricepLayoutFragment.newInstance("Close-Grip Bench Press", String.valueOf(R.drawable.close_grip_bench_press), "1. Add weighted plates to the barbell\n" +
                        "2. Start by laying flat on the bench\n" +
                        "3. Grab the barbell with a close grip\n" +
                        "4. Lift the barbell of the rack\n" +
                        "5. Lift the barbell up and back down towards your chest to complete a rep");
            case 1:
                return TricepLayoutFragment.newInstance("Close Grip JM Press", String.valueOf(R.drawable.close_grip_jm_press), "1. Start with a curl bar in a close grip\n" +
                        "2. Lay down flat on your back on the bench\n" +
                        "3. Bring it down towards your chest and back up to complete the rep");
            case 2:
                return TricepLayoutFragment.newInstance("Lying Triceps Extension", String.valueOf(R.drawable.lying_tricep_extension), "1. Laying down on a flat bench, hold the dumbbells straight up\n" +
                        "2. Bring the dumbbells down towards your head and below\n" +
                        "3. Return to the starting position to complete the rep");
            case 3:
                return TricepLayoutFragment.newInstance("Tricep Dips", String.valueOf(R.drawable.tricep_dips), "1. Grab the bars of a dip station with your palms facing inward and your arms straight\n" +
                        "2. Slowly lower until your elbows are at right angles\n" +
                        "3. Lift yourself back up to the top to complete a rep");
            case 4:
                return TricepLayoutFragment.newInstance("One Arm Overhead Dumbbell Tricep Extension", String.valueOf(R.drawable.one_arm_overhead_dumbbell_tricep_extension), "1. Start by standing straight up with one dumbbell in hand holding it above your head\n" +
                        "2. Lower the dumbbell behind and under your head and lift it back up to complete a rep");
            default:
                return TricepLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
