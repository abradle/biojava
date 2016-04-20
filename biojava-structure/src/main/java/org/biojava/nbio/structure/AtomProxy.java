package org.biojava.nbio.structure;

import java.util.ArrayList;
import java.util.List;

import org.biojava.nbio.structure.io.FileConvert;
import org.rcsb.mmtf.api.StructureDataInterface;

/**
 * A lightweight atom object
 * @author Anthony Bradley
 *
 */
public class AtomProxy implements Atom {

	private StructureDataInterface structureDataInterface;
	private int structureIndex;
	private int groupIndex;
	private int groupType;
	private Group group;
	private List<Bond> bondList;
	
	private Element element;
	

	/**
	 * Constructor requires an API to the data.
	 * @param structureDataInterface
	 * @param index
	 */
	public AtomProxy(StructureDataInterface structureDataInterface, int structureIndex, int groupIndex, int groupType){
		this.structureDataInterface = structureDataInterface;
		this.structureIndex = structureIndex;
		this.groupIndex = groupIndex;
		this.groupType = groupType;
		
		bondList = new ArrayList<>();
	}
	
	public Atom clone() {
		Atom atom = new AtomProxy(structureDataInterface, structureIndex, groupIndex, groupType);
		return atom;
	}
	
	@Override
	public String toPDB() {
		return FileConvert.toPDB(this);
	}

	@Override
	public void toPDB(StringBuffer buf) {
		FileConvert.toPDB(this,buf);
	}

	@Override
	public void setName(String s) {
		
	}

	@Override
	public String getName() {
		return structureDataInterface.getGroupAtomNames(groupType)[groupIndex];
	}

	@Override
	public void setElement(Element e) {
		this.element = e;
		
	}

	@Override
	public Element getElement() {
		return this.element;
	}

	@Override
	public void setPDBserial(int i) {
		this.structureDataInterface.getAtomIds()[structureIndex] = i;

		
	}

	@Override
	public int getPDBserial() {
		return this.structureDataInterface.getAtomIds()[structureIndex];
	}

	@Override
	public void setCoords(double[] c) {
		this.structureDataInterface.getxCoords()[structureIndex] = (float) c[0];	
		this.structureDataInterface.getyCoords()[structureIndex] = (float) c[1];	
		this.structureDataInterface.getzCoords()[structureIndex] = (float) c[2];	

	}

	@Override
	public double[] getCoords() {
		return new double[] {this.structureDataInterface.getxCoords()[structureIndex],
				this.structureDataInterface.getyCoords()[structureIndex],
				this.structureDataInterface.getzCoords()[structureIndex]};
	}

	@Override
	public void setX(double x) {
		this.structureDataInterface.getxCoords()[structureIndex] = (float) x;		
		
	}

	@Override
	public void setY(double y) {
		this.structureDataInterface.getyCoords()[structureIndex] = (float) y;		
		
	}

	@Override
	public void setZ(double z) {
		this.structureDataInterface.getzCoords()[structureIndex] = (float) z;		
	}

	@Override
	public double getX() {
		return this.structureDataInterface.getxCoords()[structureIndex];
	}

	@Override
	public double getY() {
		return this.structureDataInterface.getyCoords()[structureIndex];

	}

	@Override
	public double getZ() {
		return this.structureDataInterface.getzCoords()[structureIndex];

	}

	@Override
	public void setAltLoc(Character c) {
		this.structureDataInterface.getAltLocIds()[structureIndex] = c;
	}

	@Override
	public Character getAltLoc() {
		return this.structureDataInterface.getAltLocIds()[structureIndex];
	}

	@Override
	public void setOccupancy(float occupancy) {
		this.structureDataInterface.getOccupancies()[structureIndex] = occupancy;
		
	}

	@Override
	public float getOccupancy() {
		return this.structureDataInterface.getOccupancies()[structureIndex];

	}

	@Override
	public void setTempFactor(float temp) {
		this.structureDataInterface.getbFactors()[structureIndex] = temp;
		
	}

	@Override
	public float getTempFactor() {
		return this.structureDataInterface.getbFactors()[structureIndex];

	}

	@Override
	public void setGroup(Group parent) {
		this.group = parent;
		
	}

	@Override
	public Group getGroup() {
		return this.group;

	}

	@Override
	public void addBond(Bond bond) {
		bondList.add(bond);
		
	}

	@Override
	public List<Bond> getBonds() {
		return bondList;
	}

	@Override
	public void setBonds(List<Bond> bonds) {
		this.bondList = bonds;
		
	}

	@Override
	public short getCharge() {
		return (short) structureDataInterface.getGroupAtomCharges(groupType)[groupIndex];

	}

	@Override
	public void setCharge(short charge) {
		structureDataInterface.getGroupAtomCharges(groupType)[groupIndex] = charge;		
	}

}
