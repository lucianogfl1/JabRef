package org.jabref.logic.openoffice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UndefinedBibtexEntryTest {
	
	@Test
	public void testUndefinedBibtexEntryKey() {
		UndefinedBibtexEntry k = new UndefinedBibtexEntry("key");
		assertEquals("key", k.getKey());
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}