package uk.co.simplyhealth.healthplan.claims;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimsController {

	@Autowired
	private ClaimsService claimsService;
	
	@GetMapping("/Claims")
	public Map<UUID, Claim> getClaims() {
		return claimsService.getAllClaims();
	}
	
	// Change the status with a put...
	@PutMapping(value="/Claims/{id}")
	public void updateStatus(@PathVariable UUID id, @RequestParam("status") String status) {
		claimsService.updateStatus(id, status);
	}
	
}
