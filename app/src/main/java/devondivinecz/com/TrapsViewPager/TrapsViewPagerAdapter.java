package devondivinecz.com.TrapsViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import devondivinecz.com.ForearmViewPager.ForearmLayoutFragment;

public class TrapsViewPagerAdapter extends FragmentStateAdapter {
    public TrapsViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        position = position % 5;
        switch(position) {
            case 0:
                return TrapsLayoutFragment.newInstance("Dumbbell Shrugs", null, "1. Starting with a dumbbell in each hand at your waist\n" +
                        "2. Shrug your shoulders up and down to complete a rep");
            case 1:
                return TrapsLayoutFragment.newInstance("Single Arm Shrugs", null, "1. Starting with a dumbbell in one hand at your waist\n" +
                        "2. Shrug your shoulders up and down to complete a rep");
            case 2:
                return TrapsLayoutFragment.newInstance("Prone Lower Trap Raise", null, "1. Laying down on a flat bench hold a dumbbell towards the ground\n" +
                        "2. Raise the dumbbell up to your shoulder and to your side\n" +
                        "3. Lower the dumbbell to complete a rep");
            case 3:
                return TrapsLayoutFragment.newInstance("Dumbbell Snatch", null, "1. Start with your knees back, back straight and one dumbbell on the ground\n" +
                        "2. In one motion shoot up into a standing position ending the with the dumbbell raise straight up above your head\n" +
                        "3. Return back into starting position to complete the rep");
            case 4:
                return TrapsLayoutFragment.newInstance("Incline Dumbbell Shrug", null, "1. Laying belly down on an incline bench hold a dumbbell in each hand\n" +
                        "2. Shrug your shoulders up and down to complete a rep");
            default:
                return TrapsLayoutFragment.newInstance("Fragment Not Found", null, null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
