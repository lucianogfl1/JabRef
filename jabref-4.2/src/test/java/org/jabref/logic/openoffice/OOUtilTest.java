package org.jabref.logic.openoffice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.jabref.logic.layout.Layout;
import org.jabref.model.database.BibDatabase;
import org.jabref.model.entry.BibEntry;
import org.junit.jupiter.api.Test;

import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;
import com.sun.star.uno.UnoRuntime;

class OOUtilTest {

	@Test
	void insertFullReferenceAtCurrentLocationExceptionTest() {
		XText text = null;
		XTextCursor cursor = null;
		Layout layout = null;
		String parStyle = null;
		BibEntry entry = null;
		BibDatabase database = null;
		String uniquefier = null;
		assertThrows(Exception.class,
				() -> OOUtil.insertFullReferenceAtCurrentLocation(text,cursor,layout,parStyle,
						entry,database,uniquefier));
	}
	
	@Test
	void insertOOFormattedTextAtCurrentLocationExceptionTest() {
		assertThrows(Exception.class,
				() -> OOUtil.insertOOFormattedTextAtCurrentLocation(null, null,null,null));
		
	}
	
	@Test
	void insertParagraphBreakExceptionTest() {
		assertThrows(Exception.class,
				() -> OOUtil.insertParagraphBreak(null, null));
	}
	
	@Test
	void insertTextAtCurrentLocationExecptionTest() {
		assertThrows(Exception.class,
				() -> OOUtil.insertTextAtCurrentLocation(null, null,null,new ArrayList<>()));
	}
	
	@Test
	void insertTextAtCurrentLocationStringExecptionTest() {
		assertThrows(Exception.class,
				() -> OOUtil.insertTextAtCurrentLocation(null, null,null,""));
	}
	
	@Test
	void getPropertyTest(){
		String property = "test";
		XPropertySet props = UnoRuntime.queryInterface(
                XPropertySet.class, new Object());
		assertThrows(Exception.class, () -> OOUtil.getProperty(new Object(), "test"));
	}

}
