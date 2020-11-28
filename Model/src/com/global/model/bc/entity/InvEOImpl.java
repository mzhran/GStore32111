package com.global.model.bc.entity;

import com.global.model.bc.entity.base.StoreEntityBase;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 21 23:52:09 AST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvEOImpl extends StoreEntityBase {
    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        calculateTotal();
        super.doDML(operation, e);
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        InvId,
        InvNum,
        InvDate,
        BpId,
        InvTotal,
        Discount,
        InvNet,
        TransTypeId,
        Bp,
        InvLine,
        StoreTrans;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int INVID = AttributesEnum.InvId.index();
    public static final int INVNUM = AttributesEnum.InvNum.index();
    public static final int INVDATE = AttributesEnum.InvDate.index();
    public static final int BPID = AttributesEnum.BpId.index();
    public static final int INVTOTAL = AttributesEnum.InvTotal.index();
    public static final int DISCOUNT = AttributesEnum.Discount.index();
    public static final int INVNET = AttributesEnum.InvNet.index();
    public static final int TRANSTYPEID = AttributesEnum.TransTypeId.index();
    public static final int BP = AttributesEnum.Bp.index();
    public static final int INVLINE = AttributesEnum.InvLine.index();
    public static final int STORETRANS = AttributesEnum.StoreTrans.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.global.model.bc.entity.InvEO");
    }


    /**
     * Gets the attribute value for InvId, using the alias name InvId.
     * @return the value of InvId
     */
    public BigDecimal getInvId() {
        return (BigDecimal) getAttributeInternal(INVID);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvId.
     * @param value value to set the InvId
     */
    public void setInvId(BigDecimal value) {
        setAttributeInternal(INVID, value);
    }

    /**
     * Gets the attribute value for InvNum, using the alias name InvNum.
     * @return the value of InvNum
     */
    public String getInvNum() {
        return (String) getAttributeInternal(INVNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvNum.
     * @param value value to set the InvNum
     */
    public void setInvNum(String value) {
        setAttributeInternal(INVNUM, value);
    }

    /**
     * Gets the attribute value for InvDate, using the alias name InvDate.
     * @return the value of InvDate
     */
    public Timestamp getInvDate() {
        return (Timestamp) getAttributeInternal(INVDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvDate.
     * @param value value to set the InvDate
     */
    public void setInvDate(Timestamp value) {
        setAttributeInternal(INVDATE, value);
    }

    /**
     * Gets the attribute value for BpId, using the alias name BpId.
     * @return the value of BpId
     */
    public BigDecimal getBpId() {
        return (BigDecimal) getAttributeInternal(BPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpId.
     * @param value value to set the BpId
     */
    public void setBpId(BigDecimal value) {
        setAttributeInternal(BPID, value);
    }

    /**
     * Gets the attribute value for InvTotal, using the alias name InvTotal.
     * @return the value of InvTotal
     */
    public BigDecimal getInvTotal() {
        return (BigDecimal) getAttributeInternal(INVTOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvTotal.
     * @param value value to set the InvTotal
     */
    public void setInvTotal(BigDecimal value) {
        setAttributeInternal(INVTOTAL, value);
        calculateTotal();
    }

    /**
     * Gets the attribute value for Discount, using the alias name Discount.
     * @return the value of Discount
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) getAttributeInternal(DISCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Discount.
     * @param value value to set the Discount
     */
    public void setDiscount(BigDecimal value) {
        setAttributeInternal(DISCOUNT, value);
        calculateTotal();
    }
    
    public BigDecimal calculateTotal(){
        RowIterator iter = getInvLine();
        BigDecimal total = new BigDecimal(0);
        try {
            
       
        while (iter.hasNext()) {
            Row row = iter.next();
            InvLineEOImpl line = (InvLineEOImpl) row;
            total = total.add( line.getLineTotal());
            setInvTotal(total);
        }
        if (getDiscount() != null) {
            total = total.subtract(getDiscount());
            setInvNet(total);
        } 
        } catch (Exception e) {
             // TODO: Add catch code
             e.printStackTrace();
         }
        return total;
    }

    /**
     * Gets the attribute value for InvNet, using the alias name InvNet.
     * @return the value of InvNet
     */
    public BigDecimal getInvNet() {
        return (BigDecimal) getAttributeInternal(INVNET);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvNet.
     * @param value value to set the InvNet
     */
    public void setInvNet(BigDecimal value) {
        setAttributeInternal(INVNET, value);
    }

    /**
     * Gets the attribute value for TransTypeId, using the alias name TransTypeId.
     * @return the value of TransTypeId
     */
    public BigDecimal getTransTypeId() {
        return (BigDecimal) getAttributeInternal(TRANSTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransTypeId.
     * @param value value to set the TransTypeId
     */
    public void setTransTypeId(BigDecimal value) {
        setAttributeInternal(TRANSTYPEID, value);
    }

    /**
     * @return the associated entity com.global.model.bc.entity.base.StoreEntityBase.
     */
    public EntityImpl getBp() {
        return (EntityImpl) getAttributeInternal(BP);
    }

    /**
     * Sets <code>value</code> as the associated entity com.global.model.bc.entity.base.StoreEntityBase.
     */
    public void setBp(EntityImpl value) {
        setAttributeInternal(BP, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getInvLine() {
        return (RowIterator) getAttributeInternal(INVLINE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getStoreTrans() {
        return (RowIterator) getAttributeInternal(STORETRANS);
    }

    /**
     * @param invId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal invId) {
        return new Key(new Object[] { invId });
    }


}
