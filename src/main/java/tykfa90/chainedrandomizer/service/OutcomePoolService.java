package tykfa90.chainedrandomizer.service;

import org.springframework.stereotype.Service;
import tykfa90.chainedrandomizer.model.OutcomePool;
import tykfa90.chainedrandomizer.respository.OutcomePoolRepository;

import java.util.List;

@Service
public class OutcomePoolService {
    private OutcomePoolRepository outcomePoolRepository;

    public List<OutcomePool> getAllPools() {
        return outcomePoolRepository.findAll();
    }

    public List<OutcomePool> getAllByUserName(String creatorName) {
        return outcomePoolRepository.findAllByCreatorName(creatorName);
    }

    public OutcomePool findPoolByPoolName(String poolName) {
        return outcomePoolRepository.findByPoolName(poolName);
    }
}
