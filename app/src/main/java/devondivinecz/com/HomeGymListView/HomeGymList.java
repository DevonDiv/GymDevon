package devondivinecz.com.HomeGymListView;

public class HomeGymList {

    private String equipment;

    public HomeGymList(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return this.equipment;
    }
}
