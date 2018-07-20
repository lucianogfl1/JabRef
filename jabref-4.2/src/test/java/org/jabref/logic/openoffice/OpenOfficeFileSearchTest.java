package org.jabref.logic.openoffice;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.Assert.assertNull;


import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

class OpenOfficeFileSearchTest {

	@Test
	public void testdetectInstallationsNotNull() {
		assertNotNull(OpenOfficeFileSearch.detectInstallations());
		
	}
	
	@Test
	public void testfindOpenOfficeDirectoriesNotNull() {
		
		//OpenOfficeFileSearch op = new OpenOfficeFileSearch();
		//op.findOpenOfficeDirectories(null);
		List<Path> caminho = OpenOfficeFileSearch.detectInstallations();
		  assertNotNull(OpenOfficeFileSearch.findOpenOfficeDirectories(caminho));
		  
	}
	
	@Test
	public void testfindWindowsOpenOfficeDirsNotNull() {
		assertNotNull(OpenOfficeFileSearch.findWindowsOpenOfficeDirs());
		
	}
	
	@Test
	public void testfindOSXOpenOfficeDirsNotNull() {
		assertNotNull(OpenOfficeFileSearch.findOSXOpenOfficeDirs());
		
	}
	
	@Test
	public void testfindLinuxOpenOfficeDirsNotNull() {
		assertNotNull(OpenOfficeFileSearch.findLinuxOpenOfficeDirs());
		
	}
		
}
