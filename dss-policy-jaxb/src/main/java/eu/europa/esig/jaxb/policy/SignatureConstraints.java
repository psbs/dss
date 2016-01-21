//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.21 at 07:28:29 PM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StructuralValidation" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="AcceptablePolicies" type="{http://dss.esig.europa.eu/validation/diagnostic}MultiValuesConstraint" minOccurs="0"/>
 *         &lt;element name="AcceptableFormats" type="{http://dss.esig.europa.eu/validation/diagnostic}MultiValuesConstraint" minOccurs="0"/>
 *         &lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignatureConstraints" minOccurs="0"/>
 *         &lt;element name="SignedAttributes" type="{http://dss.esig.europa.eu/validation/diagnostic}SignedAttributesConstraints" minOccurs="0"/>
 *         &lt;element name="UnsignedAttributes" type="{http://dss.esig.europa.eu/validation/diagnostic}UnsignedAttributesConstraints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureConstraints", propOrder = {
    "structuralValidation",
    "acceptablePolicies",
    "acceptableFormats",
    "basicSignatureConstraints",
    "signedAttributes",
    "unsignedAttributes"
})
public class SignatureConstraints {

    @XmlElement(name = "StructuralValidation")
    protected LevelConstraint structuralValidation;
    @XmlElement(name = "AcceptablePolicies")
    protected MultiValuesConstraint acceptablePolicies;
    @XmlElement(name = "AcceptableFormats")
    protected MultiValuesConstraint acceptableFormats;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;
    @XmlElement(name = "SignedAttributes")
    protected SignedAttributesConstraints signedAttributes;
    @XmlElement(name = "UnsignedAttributes")
    protected UnsignedAttributesConstraints unsignedAttributes;

    /**
     * Gets the value of the structuralValidation property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getStructuralValidation() {
        return structuralValidation;
    }

    /**
     * Sets the value of the structuralValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setStructuralValidation(LevelConstraint value) {
        this.structuralValidation = value;
    }

    /**
     * Gets the value of the acceptablePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getAcceptablePolicies() {
        return acceptablePolicies;
    }

    /**
     * Sets the value of the acceptablePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setAcceptablePolicies(MultiValuesConstraint value) {
        this.acceptablePolicies = value;
    }

    /**
     * Gets the value of the acceptableFormats property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getAcceptableFormats() {
        return acceptableFormats;
    }

    /**
     * Sets the value of the acceptableFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setAcceptableFormats(MultiValuesConstraint value) {
        this.acceptableFormats = value;
    }

    /**
     * Gets the value of the basicSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public BasicSignatureConstraints getBasicSignatureConstraints() {
        return basicSignatureConstraints;
    }

    /**
     * Sets the value of the basicSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public void setBasicSignatureConstraints(BasicSignatureConstraints value) {
        this.basicSignatureConstraints = value;
    }

    /**
     * Gets the value of the signedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public SignedAttributesConstraints getSignedAttributes() {
        return signedAttributes;
    }

    /**
     * Sets the value of the signedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public void setSignedAttributes(SignedAttributesConstraints value) {
        this.signedAttributes = value;
    }

    /**
     * Gets the value of the unsignedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public UnsignedAttributesConstraints getUnsignedAttributes() {
        return unsignedAttributes;
    }

    /**
     * Sets the value of the unsignedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public void setUnsignedAttributes(UnsignedAttributesConstraints value) {
        this.unsignedAttributes = value;
    }

}
