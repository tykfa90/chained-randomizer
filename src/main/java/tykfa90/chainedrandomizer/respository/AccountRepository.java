package tykfa90.chainedrandomizer.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tykfa90.chainedrandomizer.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
