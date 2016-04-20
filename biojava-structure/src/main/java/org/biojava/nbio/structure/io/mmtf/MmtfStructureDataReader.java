package org.biojava.nbio.structure.io.mmtf;

import java.util.ArrayList;
import java.util.List;

import org.biojava.nbio.structure.Atom;
import org.biojava.nbio.structure.AtomProxy;
import org.biojava.nbio.structure.BondImpl;
import org.biojava.nbio.structure.Chain;
import org.biojava.nbio.structure.ChainImpl;
import org.biojava.nbio.structure.Group;
import org.biojava.nbio.structure.GroupProxy;
import org.biojava.nbio.structure.Structure;
import org.biojava.nbio.structure.StructureImpl;
import org.rcsb.mmtf.api.StructureDataInterface;

/**
 * A reader into Biojava from the structuredata interface.
 * @author Anthony Bradley
 *
 */
public class MmtfStructureDataReader {
	
	/**
	 * Convert a StructureDataInterface to a structure.
	 * @param structureDataInterface the input structure data interface.
	 * @return the structure object
	 */
	public Structure getStructure(StructureDataInterface structureDataInterface) {
		
		int chainIndex = 0;
		int groupIndex = 0;
		int atomStructIndex = 0;
		
		Structure structure = new StructureImpl();
		// Set the pdb code
		structure.setPDBCode(structureDataInterface.getStructureId());
		// Now loop through the chains and the models
		for (int chainsPerModel : structureDataInterface.getChainsPerModel()) {
			List<Chain> modelChains = new ArrayList<>();
			structure.addModel(modelChains);
			for (int chainInModel=0; chainInModel<chainsPerModel; chainInModel++) {
				Chain chain = new ChainImpl();
				chain.setChainID(structureDataInterface.getChainIds()[chainIndex]);
				int groupsThisChain = structureDataInterface.getGroupsPerChain()[chainIndex];
				List<Group> groups = new ArrayList<>(groupsThisChain);
				chain.setAtomGroups(groups);
				for (int groupInChain=0; groupInChain<groupsThisChain; groupInChain++) {
					int groupType = structureDataInterface.getGroupTypeIndices()[groupIndex];
					// Now build the new group
					int atomsInGroup = structureDataInterface.getNumAtomsInGroup(groupType);
					Group group = new GroupProxy(structureDataInterface, groupIndex, atomsInGroup);
					for (int atomInGroup=0; atomInGroup<atomsInGroup; atomInGroup++){
						// Now make a new atom
						Atom atom = new AtomProxy(structureDataInterface, atomStructIndex, atomInGroup, groupType);
						//group.addAtom(atom);
						group.getAtoms().set(atomInGroup, atom);
						atomStructIndex++;
					}
					int[] bondInds = structureDataInterface.getGroupBondIndices(groupType);
					int[] bondOrders = structureDataInterface.getGroupBondOrders(groupType);
					for (int i=0; i<bondOrders.length; i++){
						int indOne = bondInds[i*2];
						int indTwo = bondInds[i*2+1];
						int order = bondOrders[i];
						new BondImpl(group.getAtoms().get(indOne), group.getAtoms().get(indTwo), order);
					}
					groupIndex++;
				}
				chainIndex++;
			}
		}
		return structure;
		
	}
	
	
}
