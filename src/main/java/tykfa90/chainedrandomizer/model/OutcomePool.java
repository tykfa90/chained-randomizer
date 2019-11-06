package tykfa90.chainedrandomizer.model;

import javax.persistence.*;

@Entity
@Table(name = "outcomePools")
public class OutcomePool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creatorName;
    private String poolName;
    private Boolean publicAccess = false;

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Boolean getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
    }
}
