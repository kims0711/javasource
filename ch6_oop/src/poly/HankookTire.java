package poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);
    }

    @Override
    public boolean roll() {
        ++acuumulateRotation;

        if (acuumulateRotation < maxRotation)

        {
            System.out.println(location + "HankookTire 수명" + (maxRotation - acuumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "HankookTire 펑크 ***");
            return false;
        }
    }
}
