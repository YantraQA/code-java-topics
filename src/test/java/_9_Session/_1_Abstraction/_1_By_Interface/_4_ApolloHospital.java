package _9_Session._1_Abstraction._1_By_Interface;

public class _4_ApolloHospital extends GlobalPatientData implements _1_USMedical, _2_UKMedical, _3_IndianMedical {
	
	@Override
	public void physioServices() {
		System.out.println("Apollo - physio");
	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo - Oncology");
	}

	@Override
	public void orthopedicServices() {
		System.out.println("Apollo - orthopedic");

	}

	@Override
	public void RadioLogyServices() {
		System.out.println("Apollo - RadioLogyServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("Apollo - ENTServices");

	}

	@Override
	public void ambulanceServices() {
		System.out.println("Apollo - ambulanceServices");
	}

	@Override
	public void emegergencyServices() {
		System.out.println("Apollo - emegergencyServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo - neuroServices");
	}

	@Override
	public void peditricServices() {
		System.out.println("Apollo - peditricServices");
	}

	// From WHO Interface
	@Override
	public void polioServices() {
		System.out.println("Apollo - polioServices");

	}

	// non overridden methods: (Specialized methods of ApolloHospital)
	public void OPServices() {
		System.out.println("Apollo - OPTServices");
	}

	public void medicalInsurance() {
		System.out.println("Apollo - medicalInsurance");
	}

	public void pathalogyServices() {
		System.out.println("Apollo - pathalogyServices");
	}

}
