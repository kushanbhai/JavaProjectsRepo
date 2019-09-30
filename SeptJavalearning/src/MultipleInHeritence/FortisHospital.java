package MultipleInHeritence;

public class FortisHospital implements USHospital, UKHospital, IndianHospital {

	@Override
	public void emergencyservices() {
		System.out.println("FortisHospital ---emergencyservices");

	}

	@Override
	public void OPDservices() {
		System.out.println("FortisHospital ---OPDservices");

	}

	@Override
	public void IPDServices() {

		System.out.println("FortisHospital ---IPDservices");
	}

	@Override
	public void neuroservices() {

		System.out.println("FortisHospital ---neuroservices");
	}

	@Override
	public void Orthoservices() {
		System.out.println("FortisHospital ---Orthoservices");

	}

	@Override
	public void physioservices() {

		System.out.println("FortisHospital ---physioservices");

	}

	@Override
	public void clicnicalservices() {

		System.out.println("FortisHospital ---clicnicalservices");

	}

	@Override
	public void pathologyservices() {

		System.out.println("FortisHospital ---pathologyservices");

	}

//fortis hospital methods
	public void medicalclaimservices() {
		System.out.println("FortisHospital ---medicalclaimservices");
	}

	public void nursingservices() {
		System.out.println("FortisHospital ---nursingservices");
	}

	public void ambulanceclaimservices() {
		System.out.println("FortisHospital ---ambulanceclaimservices");
	}
}
