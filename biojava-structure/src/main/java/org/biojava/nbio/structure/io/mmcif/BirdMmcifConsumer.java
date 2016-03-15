package org.biojava.nbio.structure.io.mmcif;

import java.util.List;

import org.biojava.nbio.structure.io.FileParsingParameters;
import org.biojava.nbio.structure.io.mmcif.model.AtomSite;
import org.biojava.nbio.structure.io.mmcif.model.AuditAuthor;
import org.biojava.nbio.structure.io.mmcif.model.Cell;
import org.biojava.nbio.structure.io.mmcif.model.ChemComp;
import org.biojava.nbio.structure.io.mmcif.model.ChemCompAtom;
import org.biojava.nbio.structure.io.mmcif.model.ChemCompBond;
import org.biojava.nbio.structure.io.mmcif.model.ChemCompDescriptor;
import org.biojava.nbio.structure.io.mmcif.model.DatabasePDBremark;
import org.biojava.nbio.structure.io.mmcif.model.DatabasePDBrev;
import org.biojava.nbio.structure.io.mmcif.model.DatabasePdbrevRecord;
import org.biojava.nbio.structure.io.mmcif.model.Entity;
import org.biojava.nbio.structure.io.mmcif.model.EntityPolySeq;
import org.biojava.nbio.structure.io.mmcif.model.EntitySrcGen;
import org.biojava.nbio.structure.io.mmcif.model.EntitySrcNat;
import org.biojava.nbio.structure.io.mmcif.model.EntitySrcSyn;
import org.biojava.nbio.structure.io.mmcif.model.Exptl;
import org.biojava.nbio.structure.io.mmcif.model.PdbxChemCompDescriptor;
import org.biojava.nbio.structure.io.mmcif.model.PdbxChemCompIdentifier;
import org.biojava.nbio.structure.io.mmcif.model.PdbxEntityNonPoly;
import org.biojava.nbio.structure.io.mmcif.model.PdbxNonPolyScheme;
import org.biojava.nbio.structure.io.mmcif.model.PdbxPolySeqScheme;
import org.biojava.nbio.structure.io.mmcif.model.PdbxStructAssembly;
import org.biojava.nbio.structure.io.mmcif.model.PdbxStructAssemblyGen;
import org.biojava.nbio.structure.io.mmcif.model.PdbxStructOperList;
import org.biojava.nbio.structure.io.mmcif.model.Refine;
import org.biojava.nbio.structure.io.mmcif.model.Struct;
import org.biojava.nbio.structure.io.mmcif.model.StructAsym;
import org.biojava.nbio.structure.io.mmcif.model.StructConn;
import org.biojava.nbio.structure.io.mmcif.model.StructKeywords;
import org.biojava.nbio.structure.io.mmcif.model.StructNcsOper;
import org.biojava.nbio.structure.io.mmcif.model.StructRef;
import org.biojava.nbio.structure.io.mmcif.model.StructRefSeq;
import org.biojava.nbio.structure.io.mmcif.model.StructRefSeqDif;
import org.biojava.nbio.structure.io.mmcif.model.StructSite;
import org.biojava.nbio.structure.io.mmcif.model.StructSiteGen;
import org.biojava.nbio.structure.io.mmcif.model.Symmetry;

public class BirdMmcifConsumer implements MMcifConsumer {

	@Override
	public void documentStart() {
		
	}

	@Override
	public void documentEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newAtomSite(AtomSite atom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newEntity(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newEntityPolySeq(EntityPolySeq epolseq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructAsym(StructAsym sasym) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStruct(Struct struct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newDatabasePDBrev(DatabasePDBrev dbrev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newDatabasePDBrevRecord(DatabasePdbrevRecord dbrev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newDatabasePDBremark(DatabasePDBremark remark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newExptl(Exptl exptl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newCell(Cell cell) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newSymmetry(Symmetry symmetry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructNcsOper(StructNcsOper sNcsOper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructRef(StructRef sref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructRefSeq(StructRefSeq sref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructRefSeqDif(StructRefSeqDif sref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructSite(StructSite sref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructSiteGen(StructSiteGen sref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxPolySeqScheme(PdbxPolySeqScheme ppss) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxNonPolyScheme(PdbxNonPolyScheme ppss) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxEntityNonPoly(PdbxEntityNonPoly pen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructKeywords(StructKeywords kw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newRefine(Refine r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newChemComp(ChemComp c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newChemCompDescriptor(ChemCompDescriptor ccd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxStructOperList(PdbxStructOperList structOper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxStrucAssembly(PdbxStructAssembly strucAssembly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxStrucAssemblyGen(PdbxStructAssemblyGen strucAssembly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newChemCompAtom(ChemCompAtom atom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxChemCompIndentifier(PdbxChemCompIdentifier id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newChemCompBond(ChemCompBond bond) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newPdbxChemCompDescriptor(PdbxChemCompDescriptor desc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newEntitySrcGen(EntitySrcGen entitySrcGen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newEntitySrcNat(EntitySrcNat entitySrcNat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newEntitySrcSyn(EntitySrcSyn entitySrcSyn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newStructConn(StructConn structConn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newAuditAuthor(AuditAuthor aa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void newGenericData(String category, List<String> loopFields, List<String> lineData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFileParsingParameters(FileParsingParameters params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileParsingParameters getFileParsingParameters() {
		// TODO Auto-generated method stub
		return null;
	}

}
