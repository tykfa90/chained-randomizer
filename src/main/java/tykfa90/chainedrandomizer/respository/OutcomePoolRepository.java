package tykfa90.chainedrandomizer.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tykfa90.chainedrandomizer.model.OutcomePool;

import java.util.List;

@Repository
public interface OutcomePoolRepository extends JpaRepository<OutcomePool, Long> {

    OutcomePool findByPoolName(String poolName);

    List<OutcomePool> findAllByCreatorName(String creatorName);
}
