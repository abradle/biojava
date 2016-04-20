package org.biojava.nbio.structure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.biojava.nbio.structure.io.mmcif.model.ChemComp;
import org.rcsb.mmtf.api.StructureDataInterface;

/**
 * A light group referencing the {@link StructureDataInterface}
 * @author Anthony Bradley
 *
 */
public class GroupProxy implements Group {


	private StructureDataInterface structureDataInterface;
	private int groupIndex;
	private int groupType;
	private int atomsInGroup;
	private Atom[] atoms;

	/**
	 * Constructor takes a data interface and an index
	 * @param structureDataInterface
	 * @param groupIndex
	 */
	public GroupProxy(StructureDataInterface structureDataInterface, int groupIndex, int atomsInGroup) {
		this.structureDataInterface = structureDataInterface;
		this.groupIndex = groupIndex;
		this.groupType = structureDataInterface.getGroupTypeIndices()[groupIndex];
		this.atomsInGroup = atomsInGroup;
		atoms = new Atom[atomsInGroup];
	}

	// TODO CLONE FUNCTION
	public Group clone() {
		return null;

	}


	@Override
	public int size() {
		return structureDataInterface.getNumAtomsInGroup(groupType);
	}

	@Override
	public boolean has3D() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPDBFlag(boolean flag) {
		// TODO Auto-generated method stub

	}

	@Override
	public GroupType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAtom(Atom atom) {
		
	}

	@Override
	public List<Atom> getAtoms() {
		return Arrays.asList(atoms);
	}

	@Override
	public void setAtoms(List<Atom> atoms) {
		this.atoms = atoms.toArray(new Atom[0]);

	}

	@Override
	public void clearAtoms() {
		this.atoms = new Atom[atomsInGroup];
	}

	@Override
	public Atom getAtom(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atom getAtom(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasAtom(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPDBName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPDBName(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasAminoAtoms() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setProperties(Map<String, Object> properties) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Atom> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setChain(Chain chain) {
		// TODO Auto-generated method stub

	}

	@Override
	public Chain getChain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResidueNumber getResidueNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResidueNumber(ResidueNumber residueNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setResidueNumber(String chainId, Integer residueNumber, Character iCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getChainId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setChemComp(ChemComp cc) {
		// TODO Auto-generated method stub

	}

	@Override
	public ChemComp getChemComp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasAltLoc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Group> getAltLocs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAltLoc(Group g) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isWater() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Group getAltLocGroup(Character altLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trimToSize() {
	}

	@Override
	public String toSDF() {
		// TODO Auto-generated method stub
		return null;
	}

}
