package healthsystem;

import tools.Boolean;
import tools.MayBePure;

public class DonorHealth {
    DonorData d;

    public DonorHealth(DonorData d) {
        this.d = d;
    }


    public boolean checkHealth() {
        // just in case the people maintaining class BloodDonor
        // forgot to check that the new age is 18...
        assert d.getAge()>=18 : "age not allowed (change of law!)";

        return d.getHighsystolic() < 180 && d.getHighdiastolic() > 100;
    }


}
