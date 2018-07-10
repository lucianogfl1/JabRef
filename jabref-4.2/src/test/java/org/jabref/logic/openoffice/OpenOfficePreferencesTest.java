package org.jabref.logic.openoffice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class OpenOfficePreferencesTest {

			@Test
		public void testOpenOfficePreferencesConstructor() {
		List<String> externalStyles= null;
		boolean useAllDatabases = true;
		boolean syncWhenCiting = true ;
		boolean showPanel = true;
		
		OpenOfficePreferences oop = new OpenOfficePreferences("jarsPath","executablePath","installationPath",useAllDatabases,syncWhenCiting,showPanel,externalStyles,"currentStyle");
		assertEquals("executablePath", oop.getExecutablePath());
		assertEquals("installationPath", oop.getInstallationPath());
		assertTrue(oop.getUseAllDatabases());
		assertTrue(oop.getSyncWhenCiting());
		assertTrue(oop.getShowPanel());
		assertEquals(null, oop.getExternalStyles());
		assertEquals("currentStyle", oop.getCurrentStyle());
		assertEquals("jarsPath", oop.getJarsPath());
		
		
		
		
	}
			
			
			@Test
			public void testOpenOfficePreferencesCleanStyle() {
			List<String> externalStyles= null;
			boolean useAllDatabases = true;
			boolean syncWhenCiting = true ;
			boolean showPanel = true;
			
			OpenOfficePreferences oop = new OpenOfficePreferences("jarsPath","executablePath","installationPath",useAllDatabases,syncWhenCiting,showPanel,externalStyles,"currentStyle");
			oop.clearCurrentStyle();
			assertEquals(null, oop.getCurrentStyle());
			
			
			
			
			
		}
			
			@Test
			public void testOpenOfficePreferencesSetExecutablePath() {
			List<String> externalStyles= null;
			boolean useAllDatabases = true;
			boolean syncWhenCiting = true ;
			boolean showPanel = true;
			
			OpenOfficePreferences oop = new OpenOfficePreferences("jarsPath","executablePath","installationPath",useAllDatabases,syncWhenCiting,showPanel,externalStyles,"currentStyle");
			oop.setExecutablePath("novo");
			assertEquals("novo", oop.getExecutablePath());
			
			}
			@Test
			public void testOpenOfficePreferencesSet() {
			List<String> externalStyles= null;
			boolean useAllDatabases = true;
			boolean syncWhenCiting = true ;
			boolean showPanel = true;
			
			OpenOfficePreferences oop = new OpenOfficePreferences("jarsPath","executablePath","installationPath",useAllDatabases,syncWhenCiting,showPanel,externalStyles,"currentStyle");
			oop.setInstallationPath("novo");
			assertEquals("novo", oop.getInstallationPath());
			
			
			oop.setUseAllDatabases(false);
			assertFalse(oop.getUseAllDatabases());
			
			oop.setSyncWhenCiting(false);
			assertFalse(oop.getSyncWhenCiting());
			
			oop.setShowPanel(false);
			assertFalse(oop.getShowPanel());
			
			oop.setExternalStyles(null);
			assertEquals(null, oop.getExternalStyles());
			
			oop.setCurrentStyle("novo");
			assertEquals("novo", oop.getCurrentStyle());
			
			oop.setJarsPath("novo");
			assertEquals("novo", oop.getJarsPath());
			
			oop.updateConnectionParams("novo","velho","usado");
			assertEquals("novo", oop.getInstallationPath());
			assertEquals("velho", oop.getExecutablePath());
			assertEquals("usado", oop.getJarsPath());
			
			
			oop.clearConnectionSettings();
			assertNull(oop.getInstallationPath());
			assertNull(oop.getExecutablePath());
			assertNull(oop.getJarsPath());
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			

}
