//package edu.parinya.softarchdesign.structural;
import java.util.LinkedHashSet;
import java.util.Set;
public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members;
    private double totalPrice;
    public HealthcareWorkerTeam(){
        members = new LinkedHashSet<HealthcareServiceable>();
        totalPrice = 0.0;
    }
    public void addMember(HealthcareWorker worker){
        members.add(worker);
        totalPrice += worker.getPrice();
    }
    public void addMember(HealthcareWorkerTeam team){
        members.add(team);
        totalPrice += team.getPrice();
    }
    public void removeMember(HealthcareWorker worker){
        members.remove(worker);
        totalPrice -= worker.getPrice();
    }
    @Override
    public void service() {
        for (HealthcareServiceable ws : members){
            ws.service();
        }
    }
    @Override
    public double getPrice() {
        return totalPrice;
    }
}
