package salamancacartelos.proposalsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import salamancacartelos.proposalsservice.services.ProposalService;

=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import salamancacartelos.proposalsservice.models.Proposal;
import salamancacartelos.proposalsservice.services.ProposalService;

import java.util.List;

>>>>>>> develop
@RestController
@RequestMapping("/api/proposal")
public class ProposalController {
    @Autowired
    ProposalService proposalService;
<<<<<<< HEAD
=======

    @GetMapping("/")
    public ResponseEntity<List<Proposal>> getProposals() {
        List<Proposal> proposals = proposalService.getProposals();
        return ResponseEntity.ok(proposals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proposal> getProposal(@PathVariable Long id) throws Exception {
        Proposal proposal = proposalService.getProposal(id);
        return ResponseEntity.ok(proposal);
    }
>>>>>>> develop
}
