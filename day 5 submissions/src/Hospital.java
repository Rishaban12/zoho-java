class MedicalRecords{
    int recordId;
    String patientName;
    int dateOfVisit;
    String diagnosis;

    void inputRecordDetails(int recordId,String patientName,int dateOfVisit,String diagnosis){
        this.recordId=recordId;
        this.patientName=patientName;
        this.dateOfVisit=dateOfVisit;
        this.diagnosis=diagnosis;
    }
    void displayRecord(){
        System.out.println("recordId:"+recordId);
        System.out.println("patientName:"+patientName);
        System.out.println("dateOfVisit:"+dateOfVisit);
        System.out.println("diagnosis:"+diagnosis);
    }
}
class InPatientRecord extends MedicalRecords{
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;

     void inPatientDetails(int recordId,String patientName,int dateOfVisit,String diagnosis,int roomNumber,int numberOfDaysAdmitted, double roomCharges){
        inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
        this.roomNumber=roomNumber;
        this.numberOfDaysAdmitted=numberOfDaysAdmitted;
        this.roomCharges=roomCharges;
    }
    double calculateTotalCharges(){
        double total=numberOfDaysAdmitted*roomCharges;
        return total;
    }
    void displayRecord(){
        super.displayRecord();
        System.out.println("roomnumber:"+roomNumber);
        System.out.println("numberofDaysAdmitted:"+numberOfDaysAdmitted);
        System.out.println("roomCharges:"+roomCharges);
        System.out.println("TotalCharges:"+calculateTotalCharges());
        System.out.println("----------------------------------------------------\n");
    }
}
class OutPatientRecord extends MedicalRecords{
    String doctorName;
    double consulationFee;

    void OutPatientDetails(int recordId,String patientName,int dateOfVisit,String diagnosis,String doctorName,double consulationFee){
        inputRecordDetails(recordId,patientName,dateOfVisit,diagnosis);
        this.doctorName=doctorName;
        this.consulationFee=consulationFee;
    }

    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("doctorName:"+doctorName);
        System.out.println("consulationFee:"+consulationFee);
    }
}
public class Hospital {
    public static void main(String[] args){
        MedicalRecords[] records=new MedicalRecords[2];
        records[0]=new InPatientRecord();
        records[1]=new OutPatientRecord();
        ((InPatientRecord) records[0]).inPatientDetails(11,"ras",2007,"fever",26,50, 26);
        ((OutPatientRecord) records[1]).OutPatientDetails(12,"rishab",2006,"fever","venkat",12000);
        for(int i=0;i<records.length;i++){
            System.out.println("record"+" "+(i+1));
            records[i].displayRecord();
        }
    }
}
