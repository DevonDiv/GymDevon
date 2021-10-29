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
            case 0: return TrapsLayoutFragment.newInstance(null, null);
            case 1: return TrapsLayoutFragment.newInstance(null, null);
            case 2: return TrapsLayoutFragment.newInstance(null, null);
            case 3: return TrapsLayoutFragment.newInstance(null, null);
            case 4: return TrapsLayoutFragment.newInstance(null, null);
            default: return TrapsLayoutFragment.newInstance("Fragment Not Found", null);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
