package org.biojava.nbio.structure.io;

public class Bird {

//	Example Data
//	Location for this data: ftp://ftp.wwpdb.org/pub/pdb/data/bird/prd/
//	data_PRD_000001
//	_pdbx_reference_molecule.prd_id                       PRD_000001 
//	_pdbx_reference_molecule.name                         'Actinomycin D' 
//	_pdbx_reference_molecule.represent_as                 polymer 
//	_pdbx_reference_molecule.type                         Polypeptide 
//	_pdbx_reference_molecule.class                        Antibiotic 
//	_pdbx_reference_molecule.compound_details             
//	; ACTINOMYCIN D IS A BICYCLIC PEPTIDE, A MEMBER OF THE                 
//	  ACTINOMYCIN FAMILY.
//	  HERE, ACTINOMYCIN D IS REPRESENTED BY THE SEQUENCE (SEQRES)
//	;
//	_pdbx_reference_molecule.description                  
//	; ACTINOMYCIN D CONSISTS OF TWO PENTAMER                
//	  RINGS LINKED BY THE CHROMOPHORE (PXZ)
//	;
//	_pdbx_reference_molecule.representative_PDB_id_code   1a7y 
//	_pdbx_reference_entity_list.prd_id          PRD_000001 
//	_pdbx_reference_entity_list.ref_entity_id   1 
//	_pdbx_reference_entity_list.component_id    1 
//	_pdbx_reference_entity_list.type            polymer 
//	_pdbx_reference_entity_list.details         
//	'PEPTIDE LIKE SEQUENCE RESIDUES 1 TO 11' 
//	loop_
//	_pdbx_reference_entity_poly_link.prd_id 
//	_pdbx_reference_entity_poly_link.ref_entity_id 
//	_pdbx_reference_entity_poly_link.link_id 
//	_pdbx_reference_entity_poly_link.atom_id_1 
//	_pdbx_reference_entity_poly_link.comp_id_1 
//	_pdbx_reference_entity_poly_link.entity_seq_num_1 
//	_pdbx_reference_entity_poly_link.atom_id_2 
//	_pdbx_reference_entity_poly_link.comp_id_2 
//	_pdbx_reference_entity_poly_link.entity_seq_num_2 
//	_pdbx_reference_entity_poly_link.value_order 
//	_pdbx_reference_entity_poly_link.component_id 
//	_pdbx_reference_entity_poly_link.details 
//	_pdbx_reference_entity_poly_link.insert_code_1 
//	_pdbx_reference_entity_poly_link.insert_code_2 
//	PRD_000001 1 1  C    THR 1  N DVA 2  sing 1 ? ? ? 
//	PRD_000001 1 2  OG1  THR 1  C MVA 5  sing 1 ? ? ? 
//	PRD_000001 1 3  N    THR 1  C PXZ 6  sing 1 ? ? ? 
//	PRD_000001 1 4  C    DVA 2  N PRO 3  sing 1 ? ? ? 
//	PRD_000001 1 5  C    PRO 3  N SAR 4  sing 1 ? ? ? 
//	PRD_000001 1 6  C    SAR 4  N MVA 5  sing 1 ? ? ? 
//	PRD_000001 1 7  "C'" PXZ 6  N THR 7  sing 1 ? ? ? 
//	PRD_000001 1 8  C    THR 7  N DVA 8  sing 1 ? ? ? 
//	PRD_000001 1 9  OG1  THR 7  C MVA 11 sing 1 ? ? ? 
//	PRD_000001 1 10 C    DVA 8  N PRO 9  sing 1 ? ? ? 
//	PRD_000001 1 11 C    PRO 9  N SAR 10 sing 1 ? ? ? 
//	PRD_000001 1 12 C    SAR 10 N MVA 11 sing 1 ? ? ? 
//	_pdbx_reference_entity_poly.prd_id          PRD_000001 
//	_pdbx_reference_entity_poly.ref_entity_id   1 
//	_pdbx_reference_entity_poly.db_code         NOR00228 
//	_pdbx_reference_entity_poly.db_name         NOR 
//	_pdbx_reference_entity_poly.type            peptide-like
//	_pdbx_reference_entity_sequence.prd_id          PRD_000001 
//	_pdbx_reference_entity_sequence.ref_entity_id   1 
//	_pdbx_reference_entity_sequence.type            peptide-like 
//	_pdbx_reference_entity_sequence.NRP_flag        Y 
}
