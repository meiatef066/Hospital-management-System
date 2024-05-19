package hospital2;

import hospital2.entites.*;
import java.util.*;
public class hospitalContainer {
    public Map<String, LinkedList<patient>> doctorPatientQueue;  // get data of patient from reciptionist
     public hospitalContainer() {
        doctorPatientQueue = new HashMap<>();
    }
        public void addPatientToDoctor(String doctorName, patient p) {
         doctorPatientQueue.computeIfAbsent(doctorName, k -> new LinkedList<>()).addLast(p);
    }
    public LinkedList<patient> getPatientsForDoctor(String doctorName) {
       LinkedList<patient> doctorQueue=doctorPatientQueue.get(doctorName);
       return (doctorQueue!=null && !doctorQueue.isEmpty())? doctorQueue:null;
       }
} 
