package tykfa90.chainedrandomizer.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outcomes")
public class Outcome {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(updatable = false)
    private String outcomeName;
    @Column(updatable = false)
    private String parentPool;
    private Double outcomeSuccessChance;

    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
    }

    public String getParentPool() {
        return parentPool;
    }

    public void setParentPool(String parentPool) {
        this.parentPool = parentPool;
    }

    public Double getOutcomeSuccessChance() {
        return outcomeSuccessChance;
    }

    public void setOutcomeSuccessChance(Double outcomeSuccessChance) {
        this.outcomeSuccessChance = outcomeSuccessChance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Outcome)) return false;
        Outcome outcome = (Outcome) o;
        return getOutcomeName().equals(outcome.getOutcomeName()) &&
                getParentPool().equals(outcome.getParentPool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOutcomeName(), getParentPool());
    }
}
