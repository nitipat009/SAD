package edu.parinya.softarchdesign.structural;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new LinkedHashSet();

    @Override
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        int total = 0;
        for (HealthcareServiceable member : members) {
            total = (int) (total + member.getPrice());
        }
        return total;
    }

    public void addMember(HealthcareWorker member) {
        members.add(member);
    }

    public void addMember(HealthcareWorkerTeam team) {
        members.add(team);
    }

    public void removeMember(HealthcareWorker member) {
        members.remove(member);
    }
    
}
