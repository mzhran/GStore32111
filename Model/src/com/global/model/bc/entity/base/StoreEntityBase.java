package com.global.model.bc.entity.base;

import java.math.BigDecimal;

import oracle.jbo.AttributeDef;
//import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;

public class StoreEntityBase extends EntityImpl {
    @Override
    protected void doDML(int i, TransactionEvent transactionEvent) {
        // TODO Implement this method
        if (i == DML_INSERT) {
            EntityDefImpl defObject = getEntityDef();
            AttributeDef[] attrDefs = defObject.getAttributeDefs();
            for (AttributeDef attrDef : attrDefs) {
                String seqName = (String) attrDef.getProperty("SeqName");
                if (seqName != null) {
                    SequenceImpl sequence = new SequenceImpl(seqName, getDBTransaction());
//                    Number num = sequence.getSequenceNumber();
                    BigDecimal num = sequence.getSequenceNumber().getBigDecimalValue();
                    populateAttributeAsChanged(attrDef.getIndex(), num);
                    break;


                }
            }
            
        }
        super.doDML(i, transactionEvent);
    }

    @Override
    protected void initDefaults() {
        // TODO Implement this method
        super.initDefaults();
        AttributeDef[] attrDefs = getEntityDef().getAttributeDefs();
        for (AttributeDef attrDef : attrDefs) {

            String seqName = (String) attrDef.getProperty("SeqName");
            if (seqName != null) {
        //                SequenceImpl sequence = new SequenceImpl(seqName, getDBTransaction());
        //                Number num = sequence.getSequenceNumber();
                BigDecimal num = new BigDecimal(-1);
                populateAttributeAsChanged(attrDef.getIndex(), num);
                break;

            }
        }
    }
}
