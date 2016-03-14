package org.biojava.nbio.structure.io;

import org.junit.Test;

public class TestLigandToSdf {

	@Test
	/**
	 * A simple test against a simple ligand
	 */
	public void testSimple() {
		
		// Read in the PDB file
		
	}
	
	@Test
	/**
	 * A test against a multiple occupancy ligand (alternate locations)
	 */
	public void testMultOccupancy() {
		
		// Read in the PDB file
		
	}
	
	
	@Test
	/**
	 * A test for a ligand with bonds missing in the CCD
	 */
	public void testBondsMissing() { 
		
	}
	
	@Test
	/**
	 * A test for a protonated amine 
	 */
	public void testProtonatedAmine() {
		
	}
	
	// NOW READ THROUGH THE WHOLE OF THE PDB AND FIND ANY FURTHER ISSUES
	
	// ALSO ADD SOME INTEGRATION TESTING TO MAKE SURE THE OUTPUT IS THE SAME AS EXPECTED
	
	// CCD -> FOR LIGANDS COULD BE COMBO OF PDB CODE AND HET ID...???
	
}
