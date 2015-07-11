package healthsystem;

public class BloodDonor {

    // Tested this method
    public static boolean canGiveBlood(DonorData d) {
        boolean canGiveBlood;

        // precond.: people already rejected are not allowed
        assert !d.getRejected() : "rejected previously!";

        // check the age is valid
        if (d.getAge() >= 0) {  // this is wrong; it should >=18!
            canGiveBlood = (new DonorHealth(d)).checkHealth();
        } else
            canGiveBlood = false;
        return canGiveBlood;

    }

    public static void main(String[] args) {
        DonorData donorData0 = new DonorData();
        donorData0.setRejected(true);
        Boolean canGiveBlood = BloodDonor.canGiveBlood(donorData0);
        System.out.println(canGiveBlood);
    }
}

