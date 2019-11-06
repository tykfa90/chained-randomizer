package tykfa90.chainedrandomizer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tykfa90.chainedrandomizer.model.OutcomePool;
import tykfa90.chainedrandomizer.service.OutcomePoolService;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(path = "/pools")
public class OutcomePoolController {
    private OutcomePoolService outcomePoolService;

    public OutcomePoolController(OutcomePoolService outcomePoolService) {
        this.outcomePoolService = outcomePoolService;
    }

    //Displays all outcome pools that are publicly accessible.
    @GetMapping
    @RequestMapping(path = "/all")
    public List<OutcomePool> getAllAccessiblePools() {
        return outcomePoolService.getAllPools();
    }

    //Displays all outcome pools owned by the user.
    @GetMapping
    @RequestMapping(path = "/owned")
    public List<OutcomePool> findAllByUsername(String creatorName) {
        return outcomePoolService.getAllByUserName(creatorName);
    }

    //Displays a specific outcome pool with specified pool name.
    @GetMapping
    @RequestMapping(path = "/{poolName}")
    public OutcomePool findOutcomeByName(@PathVariable String poolName) {
        return outcomePoolService.findPoolByPoolName(poolName);
    }
}
