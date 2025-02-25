package com.global.model.bc.view;

import com.global.model.bc.entity.InvEOImpl;
import com.global.model.bc.entity.base.StoreEntityBase;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 26 03:13:27 AST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvVORowImpl extends ViewRowImpl {
    public static final int ENTITY_INVEO = 0;
    public static final int ENTITY_BPEO = 1;

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
        BpName,
        BpId1,
        InvLine,
        StoreTrans,
        BpVO,
        TransTypeROVO;
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
    public static final int BPNAME = AttributesEnum.BpName.index();
    public static final int BPID1 = AttributesEnum.BpId1.index();
    public static final int INVLINE = AttributesEnum.InvLine.index();
    public static final int STORETRANS = AttributesEnum.StoreTrans.index();
    public static final int BPVO = AttributesEnum.BpVO.index();
    public static final int TRANSTYPEROVO = AttributesEnum.TransTypeROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvVORowImpl() {
    }

    /**
     * Gets InvEO entity object.
     * @return the InvEO
     */
    public InvEOImpl getInvEO() {
        return (InvEOImpl) getEntity(ENTITY_INVEO);
    }

    /**
     * Gets BpEO entity object.
     * @return the BpEO
     */
    public StoreEntityBase getBpEO() {
        return (StoreEntityBase) getEntity(ENTITY_BPEO);
    }

    /**
     * Gets the attribute value for INV_ID using the alias name InvId.
     * @return the INV_ID
     */
    public BigDecimal getInvId() {
        return (BigDecimal) getAttributeInternal(INVID);
    }

    /**
     * Sets <code>value</code> as attribute value for INV_ID using the alias name InvId.
     * @param value value to set the INV_ID
     */
    public void setInvId(BigDecimal value) {
        setAttributeInternal(INVID, value);
    }

    /**
     * Gets the attribute value for INV_NUM using the alias name InvNum.
     * @return the INV_NUM
     */
    public String getInvNum() {
        return (String) getAttributeInternal(INVNUM);
    }

    /**
     * Sets <code>value</code> as attribute value for INV_NUM using the alias name InvNum.
     * @param value value to set the INV_NUM
     */
    public void setInvNum(String value) {
        setAttributeInternal(INVNUM, value);
    }

    /**
     * Gets the attribute value for INV_DATE using the alias name InvDate.
     * @return the INV_DATE
     */
    public Timestamp getInvDate() {
        return (Timestamp) getAttributeInternal(INVDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for INV_DATE using the alias name InvDate.
     * @param value value to set the INV_DATE
     */
    public void setInvDate(Timestamp value) {
        setAttributeInternal(INVDATE, value);
    }

    /**
     * Gets the attribute value for BP_ID using the alias name BpId.
     * @return the BP_ID
     */
    public BigDecimal getBpId() {
        return (BigDecimal) getAttributeInternal(BPID);
    }

    /**
     * Sets <code>value</code> as attribute value for BP_ID using the alias name BpId.
     * @param value value to set the BP_ID
     */
    public void setBpId(BigDecimal value) {
        setAttributeInternal(BPID, value);
    }

    /**
     * Gets the attribute value for INV_TOTAL using the alias name InvTotal.
     * @return the INV_TOTAL
     */
    public BigDecimal getInvTotal() {
        return (BigDecimal) getAttributeInternal(INVTOTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for INV_TOTAL using the alias name InvTotal.
     * @param value value to set the INV_TOTAL
     */
    public void setInvTotal(BigDecimal value) {
        setAttributeInternal(INVTOTAL, value);
    }

    /**
     * Gets the attribute value for DISCOUNT using the alias name Discount.
     * @return the DISCOUNT
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) getAttributeInternal(DISCOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for DISCOUNT using the alias name Discount.
     * @param value value to set the DISCOUNT
     */
    public void setDiscount(BigDecimal value) {
        setAttributeInternal(DISCOUNT, value);
    }
//    public BigDecimal calculateTotal(){
//        RowIterator iter = getInvLine();
//        BigDecimal total = new BigDecimal(0);
//        try {
//            
//       
//        while (iter.hasNext()) {
//            Row row = iter.next();
//            InvLineVORowImpl line = (InvLineVORowImpl) row;
//            total = total.add( line.getLineTotal());
//            setInvTotal(total);
//        }
//        if (getDiscount() != null) {
//            total = total.subtract(getDiscount());
//            setInvNet(total);
//        } 
//        } catch (Exception e) {
//             // TODO: Add catch code
//             e.printStackTrace();
//         }
//        return total;
//    }
    /**
     * Gets the attribute value for INV_NET using the alias name InvNet.
     * @return the INV_NET
     */
    public BigDecimal getInvNet() {
        return (BigDecimal) getAttributeInternal(INVNET);
    }

    /**
     * Sets <code>value</code> as attribute value for INV_NET using the alias name InvNet.
     * @param value value to set the INV_NET
     */
    public void setInvNet(BigDecimal value) {
        setAttributeInternal(INVNET, value);
    }

    /**
     * Gets the attribute value for TRANS_TYPE_ID using the alias name TransTypeId.
     * @return the TRANS_TYPE_ID
     */
    public BigDecimal getTransTypeId() {
        return (BigDecimal) getAttributeInternal(TRANSTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANS_TYPE_ID using the alias name TransTypeId.
     * @param value value to set the TRANS_TYPE_ID
     */
    public void setTransTypeId(BigDecimal value) {
        setAttributeInternal(TRANSTYPEID, value);
    }

    /**
     * Gets the attribute value for BP_NAME using the alias name BpName.
     * @return the BP_NAME
     */
    public String getBpName() {
        return (String) getAttributeInternal(BPNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for BP_NAME using the alias name BpName.
     * @param value value to set the BP_NAME
     */
    public void setBpName(String value) {
        setAttributeInternal(BPNAME, value);
    }

    /**
     * Gets the attribute value for BP_ID using the alias name BpId1.
     * @return the BP_ID
     */
    public BigDecimal getBpId1() {
        return (BigDecimal) getAttributeInternal(BPID1);
    }

    /**
     * Sets <code>value</code> as attribute value for BP_ID using the alias name BpId1.
     * @param value value to set the BP_ID
     */
    public void setBpId1(BigDecimal value) {
        setAttributeInternal(BPID1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvLine.
     */
    public RowIterator getInvLine() {
        return (RowIterator) getAttributeInternal(INVLINE);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link StoreTrans.
     */
    public RowIterator getStoreTrans() {
        return (RowIterator) getAttributeInternal(STORETRANS);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BpVO.
     */
    public RowSet getBpVO() {
        return (RowSet) getAttributeInternal(BPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TransTypeROVO.
     */
    public RowSet getTransTypeROVO() {
        return (RowSet) getAttributeInternal(TRANSTYPEROVO);
    }
}

