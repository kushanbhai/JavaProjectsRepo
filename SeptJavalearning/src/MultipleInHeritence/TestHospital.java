package MultipleInHeritence;

public class TestHospital {
public static void main(String[] args) {
	FortisHospital fh = new FortisHospital();
	fh.ambulanceclaimservices();
	fh.clicnicalservices();
	fh.IPDServices();
	fh.medicalclaimservices();
	fh.neuroservices();
	fh.nursingservices();
	fh.OPDservices();
	fh.Orthoservices();
	fh.pathologyservices();
	fh.physioservices();
	USHospital uh = new FortisHospital();
	uh.emergencyservices();
	uh.IPDServices();
	uh.OPDservices();
	System.out.println(USHospital.min_fee);
}
}
