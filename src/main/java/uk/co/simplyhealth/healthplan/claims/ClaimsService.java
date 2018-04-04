package uk.co.simplyhealth.healthplan.claims;

import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class ClaimsService {
	
	private Map<UUID, Claim> claims;

	Map<UUID, Claim> getAllClaims() {
		if (claims == null) {
			claims = new HashMap<UUID, Claim>(10);
			Map<Date, String> n1 = new HashMap<Date, String>(10);
			n1.put(new Date(), "New claim started");
			Map<String, Object> details = new HashMap<String, Object>(10);
			details.put("Treatment Desctiption", "Dental Work");
			details.put("Treatment Date", new Date());
			details.put("Ammount", 100);
			
			Map<String, Object> details2 = new HashMap<String, Object>(10);
			details2.put("Treatment Desctiption", "Eyes Work");
			details2.put("Treatment Date", new Date());
			details2.put("Ammount", 500);
			
			
			Claim c1 = new Claim("For my teeth checkup", new Date(), UUID.randomUUID(), UUID.randomUUID(), "NEW", n1, details);
			Claim c2 = new Claim("For my eyes checkup", new Date(), UUID.randomUUID(), UUID.randomUUID(), "NEW", n1, details2);
			
			claims.put(UUID.randomUUID(), c1);
			claims.put(UUID.randomUUID(), c2);			
		}
		return claims;
	}

	public void updateStatus(UUID id, String status) {
		Claim c = getAllClaims().get(id);
		if (c != null) {
			c.setStatus(status);
			claims.replace(id, c);
		}
	}
}
