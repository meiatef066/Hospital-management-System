package hospital2.entites;

public class patient extends person {

    private String patientStatus;
    private String bloodType;
    private String tobaccoUsage;
    private String History;
    private String geneticHistory;
    private String surgicalHistory;
    private String patientPrescription;
    private String roomid;
    private int bill;
    private int price;
    private String doctorName;
    private int DoctorId;
    public patient() {
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTobaccoUsage() {
        return tobaccoUsage;
    }

    public void setTobaccoUsage(String tobaccoUsage) {
        this.tobaccoUsage = tobaccoUsage;
    }

    public String getHistory() {
        return History;
    }

    public void setHistory(String History) {
        this.History = History;
    }

    public String getGeneticHistory() {
        return geneticHistory;
    }

    public void setGeneticHistory(String geneticHistory) {
        this.geneticHistory = geneticHistory;
    }

    public String getSurgicalHistory() {
        return surgicalHistory;
    }

    public void setSurgicalHistory(String surgicalHistory) {
        this.surgicalHistory = surgicalHistory;
    }

    public String getPatientPrescription() {
        return patientPrescription;
    }

    public void setPatientPrescription(String patientPrescription) {
        this.patientPrescription = patientPrescription;
    }

    public boolean isexamined() {
        return this.patientPrescription != "";
    }
}
