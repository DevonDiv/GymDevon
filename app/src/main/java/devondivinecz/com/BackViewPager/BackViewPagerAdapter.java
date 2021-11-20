package devondivinecz.com.BackViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.BicepViewPager.BicepLayoutFragment;

public class BackViewPagerAdapter extends FragmentStateAdapter {
    public BackViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return BackLayoutFragment.newInstance("Pull Ups", null, "1. Grab the pull up bar with your palms facing away from you\n" +
                        "2. Pull your body up until your chin is above the bar\n" +
                        "3. Lower your body back down to complete a rep");
            case 1:
                return BackLayoutFragment.newInstance("Dumbbell Rows", null, "1. With on dumbbell in hand put your other hand and one leg on a flat bench\n" +
                        "2. Raise the dumbbell up towards your chest and back down to complete the rep");
            case 2:
                return BackLayoutFragment.newInstance("Barbell Rows", null, "1. With a barbell in both hands slightly bench your knees and tilt forward\n" +
                        "2. While keeping your back straight and looking up pull the barbell towards your hips\n" +
                        "3. Lower the barbell back down and fully extend your arms to complete the rep");
            case 3:
                return BackLayoutFragment.newInstance("Side Dumbbell Lateral Raises", null, "1. Hold a dumbbell in each hand by your waist\n" +
                        "2. Raise the dumbbell up to your shoulders into a T shape\n" +
                        "3. Lower the dumbbells back towards your waist to complete a rep");
            case 4:
                return BackLayoutFragment.newInstance("Dumbbell Rear Delt Raises", null, "1. Sitting on a bench with a dumnbbell in each hand by your waist\n" +
                        "2. Lean forward slightly and raise the dumbbells up to your shoulders away from your body\n" +
                        "3. Lower the dumbbells back towards your waist to complete a rep");
            default:
                return BackLayoutFragment.newInstance(null, null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
